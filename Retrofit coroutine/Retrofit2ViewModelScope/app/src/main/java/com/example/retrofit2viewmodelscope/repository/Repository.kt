package com.example.retrofit2viewmodelscope.repository

import com.example.retrofit2viewmodelscope.api.MyApi
import com.example.retrofit2viewmodelscope.api.RetrofitInstance

class Repository {
    private  val client = RetrofitInstance.getInstance().create(MyApi::class.java)

    suspend fun getAllData() = client.getAllPlants()

}