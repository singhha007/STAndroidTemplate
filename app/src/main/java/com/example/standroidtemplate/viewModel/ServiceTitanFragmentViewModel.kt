package com.example.standroidtemplate.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.MutableLiveData

class ServiceTitanFragmentViewModel : ViewModel() {

    val example by lazy { MutableLiveData<Boolean>() }
}
