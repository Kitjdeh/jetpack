package com.example.coroutineviewmodelscope

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


class SecondViewModel : ViewModel() {

    fun a() {
        CoroutineScope(Dispatchers.IO).launch {
            for (i in 0..10) {
                delay(1000)
                Log.d("SecondViewModelA", i.toString())
            }
        }
    }

    fun b() {
        viewModelScope.launch {
            for (i in 0..10) {
                delay(1000)
                Log.d("SecondViewModelB", i.toString())
            }
        }
    }
}