package com.example.mapswitchmap

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.mapswitchmap.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var viewmodel: MainViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        viewmodel = ViewModelProvider(this).get(MainViewModel::class.java)

//        viewmodel.liveCount.observe(this, {
//            binding.resultArea1.text = (it+it).toString()
//            binding.resultArea2.text =(it*it).toString()
//        })
        viewmodel.mapLiveData.observe(this, {
            binding.resultArea1.text = it.toString()
        })
        viewmodel.switchMapLiveData.observe(this, {
            binding.resultArea2.text = it.toString()
        })
        binding.btnArea.setOnClickListener {
            val count = binding.inputArea.text.toString().toInt()
            viewmodel.setLiveDataValue(count)
        }
    }
}