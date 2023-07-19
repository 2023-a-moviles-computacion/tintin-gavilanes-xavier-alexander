package com.example.examen
import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [Helado::class],
    version = 1
)
abstract class DBHelado: RoomDatabase() {
    abstract fun daoHelado(): DaoHelado
}