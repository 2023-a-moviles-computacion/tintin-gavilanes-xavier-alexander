package com.example.examen_ib

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase

class CrearHelado : AppCompatActivity() {
    var heladeriaSeleccionada = Heladeria("","","","",0.0,0)
    val db = Firebase.firestore
    val heladerias = db.collection("Heladeria")


    override fun onCreate(savedInstanceState: Bundle?) {
        Log.i("ciclo-vida","onCreate")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_crear_helado)
    }

    override fun onStart() {
        super.onStart()
        Log.i("ciclo-vida","onStart")


        heladeriaSeleccionada = intent.getParcelableExtra<Heladeria>("posicionHeladeria")!!
        val heladeriaSubColeccion = heladerias.document("${heladeriaSeleccionada.idHeladeria}")
            .collection("Helados")


        var txtInNombre = findViewById<TextInputEditText>(R.id.txtIn_nombreHelado_crear)
        var txtInDescripcionHelado = findViewById<TextInputEditText>(R.id.txtIn_descripcionHelado_crear)
        var txtInEsNatural = findViewById<TextInputEditText>(R.id.txtIn_esNatural_crear)
        var txtInPrecioHelado = findViewById<TextInputEditText>(R.id.txtIn_precioHelado_crear)
        var txtInUnidades = findViewById<TextInputEditText>(R.id.txtIn_unidadesHelado_crear)

        Log.i("posHelado", "${heladeriaSeleccionada.idHeladeria}")

        var btnAddHelado = findViewById<Button>(R.id.btn_crearHelado)
        btnAddHelado.setOnClickListener {
            var helado = hashMapOf(
                "nombreHelado" to txtInNombre.text.toString(),
                "descripcionHelado" to txtInDescripcionHelado.text.toString(),
                "esNatural" to txtInEsNatural.text.toString(),
                "precioHelado" to txtInPrecioHelado.text.toString(),
                "unidadesHelados" to txtInUnidades.text.toString(),
                "idHeladeria_Helado" to heladeriaSeleccionada.idHeladeria,
            )
            heladeriaSubColeccion.add(helado).addOnSuccessListener {
                Toast.makeText(this, "Helado registrado con exito", Toast.LENGTH_SHORT).show();
                Log.i("Crear-Helado", "Success")
            }.addOnFailureListener {
                Log.i("Crear-Helado", "Failed")
            }

            answer()

        }


        var btnCancelarCrearHelado = findViewById<Button>(R.id.btn_cancelar_crear_helado)
        btnCancelarCrearHelado.setOnClickListener {
            answer()
        }


    }

    fun answer(){
        val intentReturnParameters = Intent()
        intentReturnParameters.putExtra("posicionHeladeria",heladeriaSeleccionada)
        setResult(
            RESULT_OK,
            intentReturnParameters
        )
        finish()
    }


}