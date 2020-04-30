package com.example.standroidtemplate

import android.app.Application
import com.example.standroidtemplate.dagger.DaggerServiceTitanComponent
import com.example.standroidtemplate.dagger.ServiceTitanComponent

class ServiceTitanApplication : Application() {

    lateinit var component: ServiceTitanComponent

    override fun onCreate() {
        super.onCreate()
        component = DaggerServiceTitanComponent.factory().create(this)
    }
}