package com.example.examen

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface DaoHeladeria {
    //Metodos del CRUD

    @Query("SELECT * FROM heladerias")
    suspend fun obtenerHeladerias(): MutableList<Heladeria>

    @Insert
    suspend fun agregarHeladeria(heladeria: Heladeria)

    @Query("UPDATE heladerias set heladeria=:heladeria,precio=:precio, sabor=:sabor, descripcion=:descripcion WHERE codigoHeladeria=:codigoHeladeria")
    suspend fun actualizarHeladeria(codigoHeladeria: Int,heladeria: String, precio: String, sabor: String, descripcion: String)

    @Query("DELETE FROM heladerias WHERE codigoHeladeria=:codigoHeladeria")
    suspend fun borrarHeladeria(codigoHeladeria: Int)

    @Query("SELECT codigoHeladeria FROM heladerias LIMIT 1")
    suspend fun obtenerCodigoActual(): Int?

}