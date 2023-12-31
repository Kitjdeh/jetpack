package com.example.fragmentviewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    val manager = supportFragmentManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if(savedInstanceState == null){
            val transaction = manager.beginTransaction()
            val fragment = TestFragment()
            transaction.replace(R.id.frameArea,fragment)
            transaction.addToBackStack(null)
            transaction.commit()
        }


    }
}