package com.example.examen


import androidx.room.ColumnInfo
import androidx.room.PrimaryKey
import androidx.room.Entity

@Entity(tableName = "heladerias")
data class Heladeria(
    @PrimaryKey var codigoHeladeria: Int =0,
    @ColumnInfo(name ="heladeria") var heladeria: String,
    @ColumnInfo(name = "precio") var precio: String,
    @ColumnInfo(name = "sabor") var sabor:String,
    @ColumnInfo(name = "descripcion") var descripcion: String

)

