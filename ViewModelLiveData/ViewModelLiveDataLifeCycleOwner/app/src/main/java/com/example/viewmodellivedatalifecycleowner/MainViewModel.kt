package com.example.viewmodellivedatalifecycleowner

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {
    private var _mutableLiveData = MutableLiveData("")
    val liveWord : LiveData<String>
        get()=_mutableLiveData

    private var _randommutableLiveData = MutableLiveData("")
    val randomliveWord : LiveData<String>
        get()=_randommutableLiveData

    val newData = Transformations.switchMap(liveWord){
        getRandomWordShuffled(it)
    }

    init {
        getNextData()
    }

    fun getNextData(){
        val currentWord = testDataList.random()
        val randomWord = currentWord.toCharArray()
        randomWord.shuffle()
        _mutableLiveData.value = currentWord
        _randommutableLiveData.value = String(randomWord)
    }

    fun getRandomWordShuffled(word:String): MutableLiveData<String>{
        val liveData = MutableLiveData("")
        val randomTextWord = word.toCharArray()
        randomTextWord.shuffle()
        liveData.value = String(randomTextWord)
        return liveData
    }

}