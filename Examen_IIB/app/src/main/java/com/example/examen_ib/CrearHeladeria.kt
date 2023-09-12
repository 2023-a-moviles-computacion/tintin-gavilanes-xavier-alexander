package com.example.examen_ib

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase

class CrearHeladeria : AppCompatActivity() {

    val db = Firebase.firestore
    val heladerias = db.collection("Heladeria")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_crear_heladeria)
    }

    override fun onStart() {
        super.onStart()

        var txtInNombre = findViewById<TextInputEditText>(R.id.txtIn_nombreHeladeria_crear)
        var txtInDireccion = findViewById<TextInputEditText>(R.id.txtIn_direccionHeladeria_crear)
        var txtInDescripcion = findViewById<TextInputEditText>(R.id.txtIn_descripcionHeladeria_crear)
        var txtInAlquiler = findViewById<TextInputEditText>(R.id.txtIn_alquilerHeladeria_crear)
        var txtInCantidadEmpleados = findViewById<TextInputEditText>(R.id.txtIn_cantidadEmpleados_crear)

        var btnCrearHeladeria = findViewById<Button>(R.id.btn_crearHeladeria)

        btnCrearHeladeria.setOnClickListener {
            var heladeria = hashMapOf(
                "nombreHeladeria" to txtInNombre.text.toString(),
                "direccionHeladeria" to txtInDireccion.text.toString(),
                "descripcionHeladeria" to txtInDescripcion.text.toString(),
                "alquilerHeladeria" to txtInAlquiler.text.toString(),
                "cantidadEmpleados" to txtInCantidadEmpleados.text.toString()
            )

            heladerias.add(heladeria).addOnSuccessListener {
                txtInNombre.text!!.clear()
                txtInDireccion.text!!.clear()
                txtInDescripcion.text!!.clear()
                txtInAlquiler.text!!.clear()
                txtInCantidadEmpleados.text!!.clear()

                Toast.makeText(this,"Heladería registrado con exito", Toast.LENGTH_SHORT).show();
                Log.i("Crear-Heladeria","Success")
            }.addOnSuccessListener {
                Log.i("Crear-Heladeria","Failed")
            }


            val intentAddSucces = Intent(this, HomeHeladerias::class.java)
            startActivity(intentAddSucces)

        }

        var btnCancelarCrearHeladeria = findViewById<Button>(R.id.btn_cancelar_crear)
        btnCancelarCrearHeladeria.setOnClickListener {
            val intentAddCancel = Intent(this, HomeHeladerias::class.java)
            startActivity(intentAddCancel)
        }

    }
}