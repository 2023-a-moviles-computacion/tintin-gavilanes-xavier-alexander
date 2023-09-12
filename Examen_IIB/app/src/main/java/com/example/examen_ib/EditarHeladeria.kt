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

class EditarHeladeria : AppCompatActivity() {
    var heladeriaSeleccionada = Heladeria("","","","",0.0,0)
    val db = Firebase.firestore
    val heladerias = db.collection("Heladeria")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("ciclo-vida", "onCreate")
        setContentView(R.layout.activity_editar_heladeria)
    }

    override fun onStart() {
        Log.i("ciclo-vida", "onStart")
        super.onStart()

        heladeriaSeleccionada = intent.getParcelableExtra<Heladeria>("PosHeladeria")!!

        val editNombre = findViewById<TextInputEditText>(R.id.txtIn_nombreHeladeria_editar)
        val editDireccion = findViewById<TextInputEditText>(R.id.txtIn_direccionHeladeria_editar)
        val editDescripcionHeladeria = findViewById<TextInputEditText>(R.id.txtIn_descripcionHeladeria_editar)
        val editAlquiler = findViewById<TextInputEditText>(R.id.txtIn_alquilerHeladeria_editar)
        val editCantidadEmpleados = findViewById<TextInputEditText>(R.id.txtIn_cantidadEmpleados_editar)

        editNombre.setText(heladeriaSeleccionada.nombreHeladeria.toString())
        editDireccion.setText(heladeriaSeleccionada.direccionHeladeria.toString())
        editDescripcionHeladeria.setText(heladeriaSeleccionada.descripcionHeladeria.toString())
        editAlquiler.setText(heladeriaSeleccionada.alquilerHeladeria.toString())
        editCantidadEmpleados.setText(heladeriaSeleccionada.cantidadEmpleados.toString())

        val btnGuardarCambios = findViewById<Button>(R.id.btn_editarHeladeria)
        btnGuardarCambios.setOnClickListener {
            heladerias.document("${heladeriaSeleccionada.idHeladeria}").update(
                "nombreHeladeria", editNombre.text.toString(),
                "direccionHeladeria", editDireccion.text.toString(),
                "descripcionHeladeria", editDescripcionHeladeria.text.toString(),
                "alquilerHeladeria", editAlquiler.text.toString().toDouble(),
                "cantidadEmpleados", editCantidadEmpleados.text.toString().toInt()
            )

            Toast.makeText(this,"Heladería actualizado con exito", Toast.LENGTH_SHORT).show()

            val intentEditSucces = Intent(this, HomeHeladerias::class.java)
            startActivity(intentEditSucces)
        }

        val btnCancelarEditar = findViewById<Button>(R.id.btn_cancelar_editarHeladeria)
        btnCancelarEditar.setOnClickListener{
            val intentEditCancel = Intent(this, HomeHeladerias::class.java)
            startActivity(intentEditCancel)
        }
    }

}