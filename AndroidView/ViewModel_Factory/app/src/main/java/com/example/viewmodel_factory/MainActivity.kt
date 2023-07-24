package com.example.viewmodel_factory

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider


// ViewModelFactory

class MainActivity : AppCompatActivity() {

    lateinit var viewmodel : MainViewModel
    lateinit var viewModelFactory: MainViewModelFactory

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModelFactory = MainViewModelFactory(5000)
        viewmodel = ViewModelProvider(this, viewModelFactory).get(MainViewModel::class.java)
    }
}