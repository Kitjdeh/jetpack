package com.example.viewmodellivedata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {

    //    private var testMutableLiveData = MutableLiveData(0)
    private lateinit var viewModel : MainViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        findViewById<Button>(R.id.btnArea).setOnClickListener {
            viewModel.plusLiveDataValue()
        }

        viewModel.testLiveData.observe(this,{
            findViewById<TextView>(R.id.textArea).text = it.toString()
        })
        viewModel.testLiveData.value = 10
//        findViewById<Button>(R.id.btnArea).setOnClickListener {
//            viewModel.plusLiveDataValue()
//        }
//        viewModel.testMutableLiveData.observe(this,
//            {
//                findViewById<TextView>(R.id.textArea).text = it.toString()
////                findViewById<TextView>(R.id.textArea).text = viewModel.testMutableLiveData.value.toString()
//            })
//
//        viewModel.testMutableLiveData.value = 10


    }
}