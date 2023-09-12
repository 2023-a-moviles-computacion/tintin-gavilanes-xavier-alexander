package com.example.examen_ib


import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.ContextMenu
import android.view.MenuItem
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase


class HomeHeladerias :  AppCompatActivity() {
    val db = Firebase.firestore
    val heladerias = db.collection("Heladeria")
    var idSelectItem = 0
    var adaptador: ArrayAdapter<Heladeria>?=null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_heladeria)
        Log.i("ciclo-vida", "onCreate")

    }

    override fun onStart() {
        super.onStart()
        Log.i("ciclo-vida", "onStart")

        listarHeladerias()

        val btnAnadirHeladeria = findViewById<Button>(R.id.btn_crear_nueva_heladeria)
        btnAnadirHeladeria.setOnClickListener {
            val intentAddHeladeria = Intent(this, CrearHeladeria::class.java)
            startActivity(intentAddHeladeria)
        }

    }

    override fun onCreateContextMenu(
        menu: ContextMenu?,
        v: View?,
        menuInfo: ContextMenu.ContextMenuInfo?
    ) {
        super.onCreateContextMenu(menu, v, menuInfo)
        val inflater = menuInflater
        inflater.inflate(R.menu.menu, menu)
        val info = menuInfo as AdapterView.AdapterContextMenuInfo
        val id = info.position
        idSelectItem = id
        Log.i("context-menu", "ID ${id}")
    }

    override fun onContextItemSelected(item: MenuItem): Boolean {
        var heladeriaSeleccionada:Heladeria = adaptador!!.getItem(idSelectItem)!!

        return when (item.itemId) {
            R.id.mi_editar -> {
                Log.i("context-menu", "Edit position: ${heladeriaSeleccionada.idHeladeria}")
                val abrirEditarHeladeria = Intent(this,EditarHeladeria::class.java)
                abrirEditarHeladeria.putExtra("PosHeladeria",heladeriaSeleccionada)
                startActivity(abrirEditarHeladeria)
                return true
            }
            R.id.mi_eliminar -> {
                Log.i("context-menu", "Delete position: ${idSelectItem}")
                heladerias.document("${heladeriaSeleccionada.idHeladeria}").delete()
                    .addOnSuccessListener {
                        Log.i("Eliminar-Heladeria","Success")
                    }
                    .addOnFailureListener {
                        Log.i("Eliminar-Heladeria","Failed")
                    }
                listarHeladerias()
                return true
            }
            R.id.mi_helados -> {
                Log.i("context-menu", "Panes: ${idSelectItem}")
                val abrirHomeHelados = Intent(this, HomeHelados::class.java)
                abrirHomeHelados.putExtra("posicionHeladeria",heladeriaSeleccionada)
                startActivity(abrirHomeHelados)
                return true
            }
            else -> super.onContextItemSelected(item)
        }
    }


    fun listarHeladerias(){
        val lv_heladerias = findViewById<ListView>(R.id.lv_heladerias_lista)
        heladerias.get().addOnSuccessListener { result->
            var listHeladerias = arrayListOf<Heladeria>()
            for(document in result){
                listHeladerias.add(
                    Heladeria(
                        document.id.toString(),
                        document.get("nombreHeladeria").toString(),
                        document.get("direccionHeladeria").toString(),
                        document.get("descripcionHeladeria").toString(),
                        document.get("alquilerHeladeria").toString().toDouble(),
                        document.get("cantidadEmpleados").toString().toInt(),
                    )
                )
            }
            adaptador = ArrayAdapter(
                this,
                android.R.layout.simple_expandable_list_item_1,
                listHeladerias
            )
            lv_heladerias.adapter = adaptador
            adaptador!!.notifyDataSetChanged()
            registerForContextMenu(lv_heladerias)
        }.addOnFailureListener {
            Log.i("Error", "Creacion de lista de heladerias fallida")
        }
    }
}