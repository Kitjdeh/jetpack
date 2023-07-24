package com.example.viewmodel_factory

import android.util.Log
import androidx.lifecycle.ViewModel

class MainViewModel(num : Int) : ViewModel()  {

        init {
            Log.d("MAINVIEWMODELTAG",num.toString())
        }

}