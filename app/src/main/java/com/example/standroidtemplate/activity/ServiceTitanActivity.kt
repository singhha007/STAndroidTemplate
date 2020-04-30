package com.example.standroidtemplate.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.standroidtemplate.R
import com.example.standroidtemplate.fragment.navigateToServiceTitanFragment
import com.example.standroidtemplate.dagger.provideComponent
import javax.inject.Inject
import com.example.standroidtemplate.api.ServiceTitanApi
import com.example.standroidtemplate.persistence.ServiceTitanDao

class ServiceTitanActivity : AppCompatActivity() {

    @Inject
    lateinit var example: String

    @Inject
    lateinit var api: ServiceTitanApi

    @Inject
    lateinit var serviceTitanDao: ServiceTitanDao

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_service_titan)
        provideComponent()?.inject(this)



        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, navigateToServiceTitanFragment())
                .commitNow()
        }
    }
}
