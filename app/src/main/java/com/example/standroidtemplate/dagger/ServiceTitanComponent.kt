package com.example.standroidtemplate.dagger

import android.content.Context
import com.example.standroidtemplate.activity.ServiceTitanActivity
import com.example.standroidtemplate.fragment.ServiceTitanFragment
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton
import com.example.standroidtemplate.dagger.ServiceTitanModule
import com.example.standroidtemplate.api.ApiModule
import com.example.standroidtemplate.persistence.PersistenceModule

@Singleton
@Component(modules = [ServiceTitanModule::class, ApiModule::class, PersistenceModule::class])
interface ServiceTitanComponent {

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance context: Context): ServiceTitanComponent
    }

    fun inject(activity: ServiceTitanActivity)
    fun inject(fragment: ServiceTitanFragment)
}