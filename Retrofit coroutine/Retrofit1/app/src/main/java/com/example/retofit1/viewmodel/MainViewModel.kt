package com.example.retofit1.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.retofit1.api.MyApi
import com.example.retofit1.api.RetrofitInstance
import com.example.retofit1.model.Post
import kotlinx.coroutines.launch

class MainViewModel : ViewModel() {

    private val retrofitInstance = RetrofitInstance.getInstance().create(MyApi::class.java)

    private var _mutableWord1 = MutableLiveData<String>()
    val liveWord1: LiveData<String>
        get() = _mutableWord1

    private var _mutableWord2 = MutableLiveData<String>()
    val liveWord2: LiveData<String>
        get() = _mutableWord2



    fun getPost1() = viewModelScope.launch {
        val post = retrofitInstance.getPost1()
        _mutableWord1.value = post.title
        Log.d("MainViewModel", post.toString())
    }

    fun getPostNumber(number: Int) = viewModelScope.launch {
        val post = retrofitInstance.getPostNumber(number)
        _mutableWord2.value = post.title
        Log.d("MainViewModel", post.toString())


    }

    private var _mutableWordList = MutableLiveData<List<Post>>()
    val liveWordList: LiveData<List<Post>>
        get() = _mutableWordList
    fun getPostAlll() = viewModelScope.launch {
        val postAll = retrofitInstance.getPostAll()
        Log.d("MainViewModel", postAll.toString())

        _mutableWordList.value = postAll
    }

}