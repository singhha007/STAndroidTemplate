package com.example.standroidtemplate.fragment

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.standroidtemplate.R
import com.example.standroidtemplate.viewModel.ServiceTitanFragmentViewModel
import com.example.standroidtemplate.dagger.provideComponent
import javax.inject.Inject
import com.example.standroidtemplate.api.ServiceTitanApi
import com.example.standroidtemplate.persistence.ServiceTitanDao

fun navigateToServiceTitanFragment() = ServiceTitanFragment()

class ServiceTitanFragment : Fragment() {

    @Inject
    lateinit var example: String

    @Inject
    lateinit var api: ServiceTitanApi

    @Inject
    lateinit var serviceTitanDao: ServiceTitanDao

    private lateinit var viewModel: ServiceTitanFragmentViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        provideComponent()?.inject(this)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_service_titan, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(ServiceTitanFragmentViewModel::class.java)
    }
}