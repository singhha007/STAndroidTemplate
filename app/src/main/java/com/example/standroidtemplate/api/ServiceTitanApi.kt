package com.example.standroidtemplate.api

import io.reactivex.Single
import retrofit2.http.GET

interface ServiceTitanApi {


    @GET("example/Endpoint")
    fun example(): Single<String>
}