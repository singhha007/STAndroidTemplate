package com.example.standroidtemplate.dagger

import android.app.Activity
import androidx.fragment.app.Fragment
import com.example.standroidtemplate.ServiceTitanApplication

fun Activity.provideComponent() =
    (application as? ServiceTitanApplication)?.component

fun Fragment.provideComponent() =
    (activity?.application as? ServiceTitanApplication)?.component