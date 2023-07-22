package com.example.viewviewmodel

import android.util.Log
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    private var countValue = 0

    fun plus(){
        countValue++
        Log.d("MainViewModel",countValue.toString())
    }
    fun minus(){
        countValue--
        Log.d("MainViewModel",countValue.toString())
    }

    fun getCountValue() : Int {
        return countValue
    }
}