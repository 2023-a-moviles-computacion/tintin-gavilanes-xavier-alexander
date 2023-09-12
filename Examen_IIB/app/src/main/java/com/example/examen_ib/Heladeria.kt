package com.example.examen_ib

import android.os.Parcel
import android.os.Parcelable

class Heladeria(
    var idHeladeria: String?,
    var nombreHeladeria: String?,
    var direccionHeladeria: String?,
    var descripcionHeladeria: String?,
    var alquilerHeladeria: Double?,
    var cantidadEmpleados: Int?
) :Parcelable{
    override fun toString(): String {
        return "${nombreHeladeria}"
    }

    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readDouble(),
        parcel.readInt()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(idHeladeria)
        parcel.writeString(nombreHeladeria)
        parcel.writeString(direccionHeladeria)
        parcel.writeString(descripcionHeladeria)
        parcel.writeDouble(alquilerHeladeria!!)
        parcel.writeInt(cantidadEmpleados!!)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Heladeria> {
        override fun createFromParcel(parcel: Parcel): Heladeria {
            return Heladeria(parcel)
        }

        override fun newArray(size: Int): Array<Heladeria?> {
            return arrayOfNulls(size)
        }
    }
}