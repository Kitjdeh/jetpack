package com.example.livedata

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    var testMutableLiveData = MutableLiveData(0)

    fun plusLiveDataValue(){
        testMutableLiveData.value = testMutableLiveData.value!!.plus(1)
    }
}