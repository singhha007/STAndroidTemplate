package com.example.standroidtemplate.persistence

import android.content.Context
import androidx.room.Room
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class PersistenceModule {

    private val DATABASE_NAME = "service_titan_database"

    @Singleton
    @Provides
    fun provideDatabase(context: Context): ServiceTitanDatabase =
        Room.databaseBuilder(
            context.applicationContext,
            ServiceTitanDatabase::class.java,
            DATABASE_NAME
        ).addMigrations(*ServiceTitanDatabase.getMigrations()).build()

    @Provides
    @Singleton
    fun provideServiceTitanDao(database: ServiceTitanDatabase): ServiceTitanDao =
        database.serviceTitanDao
}