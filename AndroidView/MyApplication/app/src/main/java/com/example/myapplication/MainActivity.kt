package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.databinding.DataBindingUtil
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
//데이터 결합
    private lateinit var binding : ActivityMainBinding

    var testCount = 20


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // setContentView(R.layout.activity_main)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        //기존의 방법
        //binding.dataBindingEx.text = "데이터 변경"

        //데이터 결합
        val person = Person("철수",20)
        binding.user1 = person
    }

    fun myClick(view:View){
        Log.d("MainActivity","onCLick")
        testCount++
        val person = Person("철수",testCount)
        binding.user1 = person
    }
}