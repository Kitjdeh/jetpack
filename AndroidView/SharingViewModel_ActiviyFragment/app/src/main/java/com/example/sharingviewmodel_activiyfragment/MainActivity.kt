package com.example.sharingviewmodel_activiyfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.sharingviewmodel_activiyfragment.databinding.ActivityMainBinding


// ViewModel -> Activity / Fragment 공유
// 이유-> Activity 값을 Fragment에서 쓰고 싶거나
// Fragment에서 값이 변경 되는걸 방지(ex회전)위해 ViewModel 값을 사용하기 위해서


class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    lateinit var viewmodel: MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        viewmodel = ViewModelProvider(this).get(MainViewModel::class.java)

        binding.resultArea.text = viewmodel.getCount().toString()

        binding.plus.setOnClickListener {
            viewmodel.plus()
            binding.resultArea.text = viewmodel.getCount().toString()
        }

        binding.minus.setOnClickListener {
            viewmodel.minus()
            binding.resultArea.text = viewmodel.getCount().toString()
        }

        val manager = supportFragmentManager
        binding.showFragment.setOnClickListener {
            val transaction = manager.beginTransaction()
            val fragment = TestFragment()
            transaction.replace(R.id.fragmeArea,fragment)
            transaction.addToBackStack(null)
            transaction.commit()

        }
    }


}