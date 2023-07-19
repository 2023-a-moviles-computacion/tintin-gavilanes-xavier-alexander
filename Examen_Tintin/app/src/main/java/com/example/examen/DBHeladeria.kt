package com.example.examen

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [Heladeria::class],
    version = 1
)
abstract class DBHeladeria: RoomDatabase() {
    abstract fun daoHeladeria(): DaoHeladeria
}