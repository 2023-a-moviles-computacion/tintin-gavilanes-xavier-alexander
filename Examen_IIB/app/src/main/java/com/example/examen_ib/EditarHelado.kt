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

class EditarHelado : AppCompatActivity() {
    var heladeriaSeleccionada = Heladeria("","","","",0.0,0)
    var heladoSeleccionado = Helado("","","","","",0.0,0)
    val db = Firebase.firestore
    val heladerias = db.collection("Heladeria")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_editar_helado)
    }

    override fun onStart() {
        Log.i("ciclo-vida", "onStart")
        super.onStart()

        heladeriaSeleccionada = intent.getParcelableExtra<Heladeria>("posicionHeladeriaEditar")!!
        heladoSeleccionado = intent.getParcelableExtra<Helado>("helado")!!

        // ------------------ o ------------------

        val editNombreHelado = findViewById<TextInputEditText>(R.id.txtIn_nombreHelado_editar)
        val editDescripcionHelado = findViewById<TextInputEditText>(R.id.txtIn_descripcionHelado_editar)
        val editEsNatural = findViewById<TextInputEditText>(R.id.txtIn_esNatural_editar)
        val editPrecioHelado = findViewById<TextInputEditText>(R.id.txtIn_precioHelado_editar)
        val editUnidadesHelados = findViewById<TextInputEditText>(R.id.txtIn_unidadesHelado_editar)

        editNombreHelado.setText(heladoSeleccionado.nombreHelado.toString())
        editDescripcionHelado.setText(heladoSeleccionado.descripcionHelado.toString())
        editEsNatural.setText(heladoSeleccionado.esNatural.toString())
        editPrecioHelado.setText(heladoSeleccionado.precioHelado.toString())
        editUnidadesHelados.setText(heladoSeleccionado.unidadesHelado.toString())
        // ------------------ o ------------------

        val btnEditHelado = findViewById<Button>(R.id.btn_editarHelado)
        btnEditHelado.setOnClickListener {
            heladerias.document("${heladeriaSeleccionada.idHeladeria}")
                .collection("Helados")
                .document("${heladoSeleccionado.idHelado}")
                .update(
                    "nombreHelado", editNombreHelado.text.toString(),
                    "descripcionHelado", editDescripcionHelado.text.toString(),
                    "esNatural", editEsNatural.text.toString(),
                    "precioHelado", editPrecioHelado.text.toString().toDouble(),
                    "unidadesHelados", editUnidadesHelados.text.toString().toInt()
                )
                .addOnSuccessListener {
                    Toast.makeText(this, "Helado actualizada con éxito", Toast.LENGTH_SHORT).show()
                }
                .addOnFailureListener { e ->
                    Toast.makeText(this, "${heladeriaSeleccionada.idHeladeria}", Toast.LENGTH_SHORT).show()
                    Toast.makeText(this, "${heladoSeleccionado.idHelado}", Toast.LENGTH_SHORT).show()
                    Toast.makeText(this, "Error al actualizar el helado: ${e.message}", Toast.LENGTH_SHORT).show()
                }

            answer()
        }


        val btnCancelHelado = findViewById<Button>(R.id.btn_cancelar_editar_Helado)
        btnCancelHelado.setOnClickListener {
            answer()
        }


    }

    fun answer(){
        val intentReturnParameters = Intent()
        intentReturnParameters.putExtra("posicionHeladeriaEditar",heladeriaSeleccionada)
        setResult(
            RESULT_OK,
            intentReturnParameters
        )
        finish()
    }
}