package com.example.examen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.room.Room
import com.example.examen.databinding.ActivityMainBinding
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity(), AdaptadorListener {

    lateinit var binding: ActivityMainBinding
    var listaHeladerias: MutableList<Heladeria> = mutableListOf()
    lateinit var adatador: AdaptadorHeladerias
    lateinit var room: DBHeladeria
    lateinit var heladeria: Heladeria

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.rvHeladerias.layoutManager = LinearLayoutManager(this)

        room = Room.databaseBuilder(this, DBHeladeria::class.java, "dbHeladeria").build()

        obtenerHeladerias(room)

        binding.btnAddUpdate.setOnClickListener {
            if(binding.etHeladeria.text.isNullOrEmpty() || binding.etPrecio.text.isNullOrEmpty() || binding.etSabor.text.isNullOrEmpty()|| binding.etDescripcion.text.isNullOrEmpty()) {
                Toast.makeText(this, "DEBES LLENAR TODOS LOS CAMPOS", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            if (binding.btnAddUpdate.text.equals("agregar")) {
                heladeria = Heladeria(
                    binding.etCodigoHeladeria.text.toString().toInt(),
                    binding.etHeladeria.text.toString().trim(),
                    binding.etPrecio.text.toString().trim(),
                    binding.etSabor.text.toString().trim(),
                    binding.etDescripcion.text.toString().trim()

                )

                agregarHeladeria(room, heladeria)
            } else if(binding.btnAddUpdate.text.equals("actualizar")) {
                heladeria.precio = binding.etPrecio.text.toString().trim()
                heladeria.sabor =binding.etSabor.text.toString().trim()
                heladeria.descripcion =binding.etDescripcion.text.toString().trim()
                heladeria.codigoHeladeria = binding.etCodigoHeladeria.text.toString().toInt()
                actualizarHeladeria(room, heladeria)
            }
        }

    }

    fun obtenerHeladerias(room: DBHeladeria) {
        lifecycleScope.launch {
            listaHeladerias = room.daoHeladeria().obtenerHeladerias()
            adatador = AdaptadorHeladerias(listaHeladerias, this@MainActivity)
            binding.rvHeladerias.adapter = adatador
        }
    }

    fun agregarHeladeria(room: DBHeladeria, heladeria: Heladeria) {
        lifecycleScope.launch {
            room.daoHeladeria().agregarHeladeria(heladeria)
            obtenerHeladerias(room)
            limpiarCampos()
        }
    }

    fun actualizarHeladeria(room: DBHeladeria, heladeria: Heladeria) {
        lifecycleScope.launch {
            room.daoHeladeria().actualizarHeladeria(heladeria.codigoHeladeria, heladeria.heladeria, heladeria.precio, heladeria.sabor,heladeria.descripcion)
            obtenerHeladerias(room)
            limpiarCampos()
        }
    }

    fun limpiarCampos() {
        heladeria.codigoHeladeria = 0
        heladeria.heladeria =""
        heladeria.precio = ""
        heladeria.sabor =""
        heladeria.descripcion =""

        binding.etCodigoHeladeria.setText("")
        binding.etHeladeria.setText("")
        binding.etPrecio.setText("")
        binding.etSabor.setText("")
        binding.etDescripcion.setText("")


        if (binding.btnAddUpdate.text.equals("actualizar")) {
            binding.btnAddUpdate.setText("agregar")
            binding.etCodigoHeladeria.isEnabled = true
        }

    }

    override fun onEditItemClick(heladeria: Heladeria) {
        binding.btnAddUpdate.setText("actualizar")
        binding.etCodigoHeladeria.isEnabled = false
        this.heladeria = heladeria
        binding.etCodigoHeladeria.setText(this.heladeria.codigoHeladeria.toString())
        binding.etHeladeria.setText(this.heladeria.heladeria)
        binding.etPrecio.setText(this.heladeria.precio)
        binding.etSabor.setText(this.heladeria.sabor)
        binding.etDescripcion.setText(this.heladeria.descripcion)

    }
    override fun onDeleteItemClick(heladeria: Heladeria) {
        lifecycleScope.launch {
            room.daoHeladeria().borrarHeladeria(heladeria.codigoHeladeria)
            adatador.notifyDataSetChanged()
            obtenerHeladerias(room)
        }
    }
}