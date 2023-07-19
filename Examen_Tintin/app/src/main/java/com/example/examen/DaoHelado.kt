package com.example.examen

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface DaoHelado {

    @Query("SELECT * FROM helados WHERE codigoHeladeria =:codigoHeladeria")
    suspend fun obtenerHeladoPorCodigoHelado(codigoHeladeria: Int): MutableList<Helado>

    @Insert
    suspend fun agregarHelado(helado: Helado)

    @Query("UPDATE helados set precioHelado=:precioHelado, descripcionP=:descripcionP,codigoHeladeria=:codigoHeladeria WHERE helado=:helado")
    suspend fun actualizarHelado(helado: String, precioHelado: String, descripcionP: String, codigoHeladeria: Int)

    @Query("DELETE FROM helados WHERE helado=:helado")
    suspend fun borrarHelado(helado: String)
}
