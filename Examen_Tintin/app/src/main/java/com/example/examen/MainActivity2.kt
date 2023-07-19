package com.example.examen

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.room.Room
import com.example.examen.databinding.ActivityMain2Binding
import kotlinx.coroutines.launch

class MainActivity2 : AppCompatActivity(), AdaptadorListener2 {

    lateinit var binding: ActivityMain2Binding
    var listaHelados: MutableList<Helado> = mutableListOf()
    lateinit var adatador: AdaptadorHelados
    lateinit var room: DBHeladeria
    lateinit var room2: DBHelado
    lateinit var helado: Helado

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rvHelados.layoutManager = LinearLayoutManager(this)
        room = Room.databaseBuilder(this, DBHeladeria:: class.java, "dbHeladeria").build()
        room2 = Room.databaseBuilder(this, DBHelado::class.java, "dbHelados").build()


        val codigoHeladeria = intent.getIntExtra("codigoHeladeria" ,0)
        obtenerHelados(room2, codigoHeladeria)

        binding.btnAddUpdateP.setOnClickListener {
            if(binding.etHelado.text.isNullOrEmpty() || binding.etPrecioHelado.text.isNullOrEmpty() || binding.etDescripcionP.text.isNullOrEmpty()) {
                Toast.makeText(this, "DEBES LLENAR TODOS LOS CAMPOS", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            if (binding.btnAddUpdateP.text.equals("agregar")) {
                helado = Helado(
                    binding.etHelado.text.toString().trim(),
                    binding.etPrecioHelado.text.toString().trim(),

                    binding.etDescripcionP.text.toString().trim(),

                    codigoHeladeria

                )

                agregarHelado(room2, helado, codigoHeladeria)
            } else if(binding.btnAddUpdateP.text.equals("actualizar")) {
                helado.precioHelado = binding.etPrecioHelado.text.toString().trim()
                // sistema.galaxia =binding.etGalaxia.text.toString().trim()
                helado.descripcionP =binding.etDescripcionP.text.toString().trim()
                // planeta.masa = binding.etMasa.text.toString().trim()
                helado.codigoHeladeria = codigoHeladeria
                actualizarHelado(room2, helado, codigoHeladeria)
            }
        }

    }

    fun obtenerHelados(room: DBHelado, codigoHeladeria: Int) {
        lifecycleScope.launch {
            listaHelados = room.daoHelado().obtenerHeladoPorCodigoHelado(codigoHeladeria)
            adatador = AdaptadorHelados(listaHelados, this@MainActivity2)
            binding.rvHelados.adapter = adatador
        }
    }

    fun agregarHelado(room: DBHelado, helado: Helado, codigoHeladeria: Int) {
        lifecycleScope.launch {
            room.daoHelado().agregarHelado(helado)
            obtenerHelados(room, codigoHeladeria)
            limpiarCampos()
        }
    }

    fun actualizarHelado(room: DBHelado, helado: Helado, codigoHeladeria: Int) {
        lifecycleScope.launch {
            room.daoHelado().actualizarHelado(helado.helado, helado.precioHelado, helado.descripcionP,  codigoHeladeria)
            obtenerHelados(room, codigoHeladeria)
            limpiarCampos()
        }
    }

    fun limpiarCampos() {
        helado.helado = ""
        helado.precioHelado = ""
        helado.descripcionP=""
        //planeta.masa =""
        binding.etHelado.setText("")
        binding.etPrecioHelado.setText("")
        binding.etDescripcionP.setText("")



        if (binding.btnAddUpdateP.text.equals("actualizar")) {
            binding.btnAddUpdateP.setText("agregar")
            binding.etHelado.isEnabled = true
        }

    }

    override fun onEditItemClick(helado: Helado, codigoHeladeria: Int) {
        binding.btnAddUpdateP.setText("actualizar")
        binding.etHelado.isEnabled = false
        this.helado = helado
        binding.etHelado.setText(this.helado.helado)
        binding.etPrecioHelado.setText(this.helado.precioHelado)
        binding.etDescripcionP.setText(this.helado.descripcionP)

    }

    override fun onDeleteItemClick(helado: Helado, codigoHeladeria: Int) {
        lifecycleScope.launch {
            room2.daoHelado().borrarHelado(helado.helado)
            adatador.notifyDataSetChanged()
            obtenerHelados(room2, codigoHeladeria)
        }
    }
}