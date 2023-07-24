package com.example.coroutineviewmodelscope

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val goToSecond = findViewById<Button>(R.id.goTosecond)
        goToSecond.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
//        Log.d("TEST","Start")
//        CoroutineScope(Dispatchers.IO).launch {
//            a()
//            b()
//
//        }
//        Log.d("TEST","End")
    }

    suspend fun a() {
        delay(1000)
        Log.d("TEST", "API1")
        delay(1000)
        Log.d("TEST", "API2")
    }

    suspend fun b() {
        delay(1000)
        Log.d("TEST", "BP1")
        delay(1000)
        Log.d("TEST", "BP2")
    }
}