package com.example.retrofit2viewmodelscope.api

import com.google.gson.Gson
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {

    val BASE_URL =
        "https://raw.githubusercontent.com/"
    val client = Retrofit
        .Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()
    fun getInstance() : Retrofit  {
        return client
    }

}