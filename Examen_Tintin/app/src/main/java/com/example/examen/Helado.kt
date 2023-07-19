package com.example.examen
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "helados")
class Helado(
    @PrimaryKey var helado: String,
    @ColumnInfo(name = "precioHelado") var precioHelado: String,

    @ColumnInfo(name = "descripcionP") var descripcionP: String,

    @ColumnInfo(name ="codigoHeladeria") var codigoHeladeria: Int,

    )
