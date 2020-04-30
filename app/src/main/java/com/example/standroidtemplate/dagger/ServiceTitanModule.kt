package com.example.standroidtemplate.dagger

import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class ServiceTitanModule {

    @Provides
    @Singleton
    fun provideExampleString() = "Example"
}