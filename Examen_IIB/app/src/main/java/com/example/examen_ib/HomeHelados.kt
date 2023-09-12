package com.example.examen_ib

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.ContextMenu
import android.view.MenuItem
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import android.widget.TextView
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase

class HomeHelados : AppCompatActivity() {
    var heladeriaSeleccionada = Heladeria("","","","",0.0,0)
    val db = Firebase.firestore
    val heladerias = db.collection("Heladeria")
    var idSelectItem = 0
    var adaptador: ArrayAdapter<Helado>?=null
    var heladoSeleccionado: Helado? = Helado("","","","","",0.0,0)


    var resultAddHelado = registerForActivityResult(
        ActivityResultContracts.StartActivityForResult()
    ) { result ->
        if (result.resultCode == Activity.RESULT_OK){
            if(result.data != null){
                val data = result.data
                heladeriaSeleccionada = intent.getParcelableExtra<Heladeria>("posicionHeladeria")!!
            }
        }
    }

    var resultEditHelado = registerForActivityResult(
        ActivityResultContracts.StartActivityForResult()
    ) { result ->
        if (result.resultCode == Activity.RESULT_OK){
            if(result.data != null){
                val data = result.data
                heladeriaSeleccionada = intent.getParcelableExtra<Heladeria>("posicionHeladeria")!!
            }
        }
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_helados)
    }


    override fun onStart() {
        super.onStart()
        Log.i("ciclo-vida", "onStart")

        heladeriaSeleccionada = intent.getParcelableExtra<Heladeria>("posicionHeladeria")!!
        listViewHelados()

        val txtNombreHeladeria = findViewById<TextView>(R.id.tv_nombreHeladeria)
        txtNombreHeladeria.setText("Heladería: "+heladeriaSeleccionada.nombreHeladeria)


        val btnNewHelado = findViewById<Button>(R.id.btn_crear_new_helado)
        btnNewHelado.setOnClickListener {
            abrirActividadAddHelado(CrearHelado::class.java)
        }

        val btnBack = findViewById<Button>(R.id.btn_volver_helado)
        btnBack.setOnClickListener {
            val intentBackPan = Intent(this, HomeHeladerias::class.java)
            startActivity(intentBackPan)
        }

    }


    override fun onCreateContextMenu(
        menu: ContextMenu?,
        v: View?,
        menuInfo: ContextMenu.ContextMenuInfo?
    ) {
        super.onCreateContextMenu(menu, v, menuInfo)
        val inflater = menuInflater
        inflater.inflate(R.menu.menu_helados, menu)
        val info = menuInfo as AdapterView.AdapterContextMenuInfo
        idSelectItem = info.position
        Log.i("context-menu", "ID Helado ${idSelectItem}")
    }


    override fun onContextItemSelected(item: MenuItem): Boolean {
        heladoSeleccionado = adaptador!!.getItem(idSelectItem)
        return when (item.itemId) {
            R.id.mi_editarHelado -> {
                Log.i("context-menu", "Edit position: ${idSelectItem}")
                abrirActividadEditHelado(EditarHelado::class.java)
                return true
            }
            R.id.mi_eliminarHelado -> {
                Log.i("context-menu", "Delete position: ${idSelectItem}")
                val panaderiaSubColeccion = heladerias.document("${heladeriaSeleccionada.idHeladeria}")
                    .collection("Panes")
                    .document("${heladoSeleccionado!!.idHelado}")
                    .delete()
                    .addOnSuccessListener {
                        Log.i("Eliminar-Helado","Success")
                    }
                    .addOnFailureListener{
                        Log.i("Eliminar-Helado","Failed")
                    }
                listViewHelados()
                return true
            }
            else -> super.onContextItemSelected(item)
        }
    }

    fun listViewHelados(){
        val heladeriaSubColeccion = heladerias.document("${heladeriaSeleccionada.idHeladeria}")
            .collection("Helados")
            .whereEqualTo("idHeladeria_Helado","${heladeriaSeleccionada.idHeladeria}")

        val lv_helados = findViewById<ListView>(R.id.lv_helados_lista)
        heladeriaSubColeccion.get().addOnSuccessListener { result->
            var listaHelados = arrayListOf<Helado>()
            for(document in result){
                listaHelados.add(
                    Helado(
                        document.id.toString(),
                        document.data.get("idHeladeria_Helado").toString(),
                        document.data.get("nombreHelado").toString(),
                        document.data.get("descripcionHelado").toString(),
                        document.data.get("esNatural").toString(),
                        document.data.get("precioHelado").toString().toDouble(),
                        document.data.get("unidadesHelados").toString().toInt()
                    )
                )
            }
            adaptador = ArrayAdapter(
                this,
                android.R.layout.simple_expandable_list_item_1,
                listaHelados
            )
            lv_helados.adapter = adaptador
            adaptador!!.notifyDataSetChanged()

            registerForContextMenu(lv_helados)
        }


    }

    fun abrirActividadAddHelado(
        clase: Class<*>
    ) {
        val intentAddNewPan = Intent(this, clase)
        intentAddNewPan.putExtra("posicionHeladeria",heladeriaSeleccionada)
        resultAddHelado.launch(intentAddNewPan)
    }

    fun abrirActividadEditHelado(
        clase: Class<*>
    ) {
        val intentEditPan = Intent(this, clase)
        intentEditPan.putExtra("helado", heladoSeleccionado)
        intentEditPan.putExtra("posicionHeladeriaEditar", heladeriaSeleccionada)
        resultEditHelado.launch(intentEditPan)
    }
}