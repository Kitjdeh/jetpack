package com.example.retrofit2viewmodelscope.api

import com.example.retrofit2viewmodelscope.model.Plant
import retrofit2.http.GET

interface MyApi {

    @GET(
        "https://raw.githubusercontent.com/googlecodelabs/kotlin-coroutines/master/advanced-coroutines-codelab/sunflower/src/main/assets/plants.json"
    )suspend fun getAllPlants() : List<Plant>
}