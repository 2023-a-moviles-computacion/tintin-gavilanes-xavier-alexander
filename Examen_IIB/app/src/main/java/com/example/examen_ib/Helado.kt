package com.example.examen_ib

import android.os.Parcel
import android.os.Parcelable

class Helado(
    var idHelado: String?,
    var idHeladeria_Helado: String?,
    var nombreHelado: String?,
    var descripcionHelado: String?,
    var esNatural: String?,
    var precioHelado: Double?,
    var unidadesHelado: Int?

) : Parcelable{
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readDouble(),
        parcel.readInt()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(idHelado)
        parcel.writeString(idHeladeria_Helado)
        parcel.writeString(nombreHelado)
        parcel.writeString(descripcionHelado)
        parcel.writeString(esNatural)
        parcel.writeDouble(precioHelado!!)
        parcel.writeInt(unidadesHelado!!)
    }

    override fun describeContents(): Int {
        return 0
    }

    override fun toString(): String {
        return "${nombreHelado}"
    }

    companion object CREATOR : Parcelable.Creator<Helado> {
        override fun createFromParcel(parcel: Parcel): Helado {
            return Helado(parcel)
        }

        override fun newArray(size: Int): Array<Helado?> {
            return arrayOfNulls(size)
        }
    }

}