package com.example.retrofit2viewmodelscope.viewModel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.retrofit2viewmodelscope.api.MyApi
import com.example.retrofit2viewmodelscope.api.RetrofitInstance
import com.example.retrofit2viewmodelscope.model.Plant
import com.example.retrofit2viewmodelscope.repository.Repository
import kotlinx.coroutines.launch

class MainViewModel : ViewModel() {


//    val retrofitInstance = RetrofitInstance.getInstance().create(MyApi::class.java)
//
    private val respository = Repository()
    private val _result = MutableLiveData<List<Plant>>()
    val result : LiveData<List<Plant>>
        get() = _result

    fun getAllData() = viewModelScope.launch {
        Log.d("MainViewModelTAG",respository.getAllData().toString())
        respository.getAllData().toString()
        _result.value = respository.getAllData()
    }

}