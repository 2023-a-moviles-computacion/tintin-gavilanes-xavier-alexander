package com.example.examen

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView

class AdaptadorHelados(
    val listaHelados: MutableList<Helado>,
    val listener: AdaptadorListener2
): RecyclerView.Adapter<AdaptadorHelados.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val vista = LayoutInflater.from(parent.context).inflate(R.layout.item_rv_helado, parent, false)
        return ViewHolder(vista)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val helado = listaHelados[position]

        holder.tvHelado.text = helado.helado
        holder.tvPrecioHelado.text = helado.precioHelado.toString()
        holder.tvDescripcionP.text = helado.descripcionP
        // holder.tvMasa.text = planeta.masa
        holder.tvCodigoHeladeriaHelado.text = helado.codigoHeladeria.toString()

        holder.cvHelado.setOnClickListener {
            listener.onEditItemClick(helado, helado.codigoHeladeria)
        }

        holder.btnBorrarP.setOnClickListener {
            listener.onDeleteItemClick(helado, helado.codigoHeladeria)
        }
    }

    override fun getItemCount(): Int {
        return listaHelados.size
    }

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val cvHelado = itemView.findViewById<CardView>(R.id.cvHelado)
        val tvCodigoHeladeriaHelado = itemView.findViewById<TextView>(R.id.tvCodigoHeladeria)
        val tvHelado= itemView.findViewById<TextView>(R.id.tvHelado)
        val tvPrecioHelado = itemView.findViewById<TextView>(R.id.tvPrecioHelado)
        val tvDescripcionP = itemView.findViewById<TextView>(R.id.tvDescripcionP)

        val btnBorrarP = itemView.findViewById<Button>(R.id.btnBorrarP)
    }
}