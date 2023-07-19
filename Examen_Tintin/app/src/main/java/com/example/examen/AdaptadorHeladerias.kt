package com.example.examen

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView

class AdaptadorHeladerias (
    val listaHeladerias: MutableList<Heladeria>,
    val listener: AdaptadorListener
): RecyclerView.Adapter<AdaptadorHeladerias.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val vista = LayoutInflater.from(parent.context).inflate(R.layout.item_rv_heladeria, parent, false)
        return ViewHolder(vista)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val heladeria = listaHeladerias[position]
        holder.tvCodigoHeladeria.text = heladeria.codigoHeladeria.toString()
        holder.tvHeladeria.text = heladeria.heladeria
        holder.tvPrecio.text = heladeria.precio
        holder.tvSabor.text =heladeria.sabor
        holder.tvDescripcion.text =heladeria.descripcion

        holder.cvHeladeria.setOnClickListener {
            listener.onEditItemClick(heladeria)
        }

        holder.btnBorrar.setOnClickListener {
            listener.onDeleteItemClick(heladeria)
        }
        holder.btnCrear.setOnClickListener {

            val intent = Intent(holder.itemView.context, MainActivity2::class.java)
            intent.putExtra("codigoHeladeria", heladeria.codigoHeladeria)
            holder.itemView.context.startActivity(intent)
        }
    }


    override fun getItemCount(): Int {
        return listaHeladerias.size
    }


    inner class ViewHolder(ItemView: View): RecyclerView.ViewHolder(ItemView) {

        val cvHeladeria= itemView.findViewById<CardView>(R.id.cvHeladeria)
        val tvCodigoHeladeria= itemView.findViewById<TextView>(R.id.tvCodigoHeladeria)
        val tvHeladeria = itemView.findViewById<TextView>(R.id.tvHeladeria)
        val tvPrecio = itemView.findViewById<TextView>(R.id.tvPrecio)
        val tvSabor = itemView.findViewById<TextView>(R.id.tvSabor)
        val tvDescripcion = itemView.findViewById<TextView>(R.id.tvDescripcion)
        val btnBorrar = itemView.findViewById<Button>(R.id.btnBorrar)
        val btnCrear = itemView.findViewById<Button>(R.id.btnCrear)
    }

}