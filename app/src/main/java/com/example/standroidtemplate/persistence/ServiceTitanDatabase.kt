package com.example.standroidtemplate.persistence

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import androidx.room.migration.Migration

@Database(entities = [ServiceTitan::class], version = 1, exportSchema = false)
@TypeConverters(Converter::class)
abstract class ServiceTitanDatabase : RoomDatabase() {
    abstract val serviceTitanDao: ServiceTitanDao

    companion object {
        fun getMigrations(): Array<Migration> {
            return emptyArray<Migration>()
        }
    }
}