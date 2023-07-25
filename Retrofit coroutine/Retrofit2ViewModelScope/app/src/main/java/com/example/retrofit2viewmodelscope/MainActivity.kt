package com.example.retrofit2viewmodelscope

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.retrofit2viewmodelscope.adapter.CustomAdatper
import com.example.retrofit2viewmodelscope.viewModel.MainViewModel

//https://raw.githubusercontent.com/googlecodelabs/kotlin-coroutines/master/advanced-coroutines-codelab/sunflower/src/main/assets/plants.json

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        viewModel.getAllData()

        val rv = findViewById<RecyclerView>(R.id.rv)

        viewModel.result.observe(this,{
            val customAdatper = CustomAdatper(this,it)
            rv.adapter = customAdatper
            rv.layoutManager = LinearLayoutManager(this)
        })

    }
}