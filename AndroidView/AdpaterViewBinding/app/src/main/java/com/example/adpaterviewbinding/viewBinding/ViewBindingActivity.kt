//package com.example.adpaterviewbinding.viewBinding
//
//import androidx.appcompat.app.AppCompatActivity
//import android.os.Bundle
//import androidx.recyclerview.widget.LinearLayoutManager
//import com.example.adpaterviewbinding.R
//import com.example.adpaterviewbinding.databinding.ActivityViewBindingBinding
//
//class ViewBindingActivity : AppCompatActivity() {
//
//    private lateinit var binding: ActivityViewBindingBinding
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
////        setContentView(R.layout.activity_view_binding)
//
//        binding = ActivityViewBindingBinding.inflate(layoutInflater)
//        val view = binding.root
//
//        setContentView(view)
//        val array = ArrayList<String>()
//
//        array.add("a")
//        array.add("b")
//        array.add("c")
//        array.add("a")
//        array.add("b")
//        array.add("c")
//        array.add("a")
//        array.add("b")
//        array.add("c")
//        array.add("a")
//        array.add("b")
//        array.add("c")
//        array.add("a")
//        array.add("b")
//        array.add("c")
//        array.add("a")
//        array.add("b")
//        array.add("c")
//
//        val customViewAdapter = CustomViewAdapter(array)
//
//        val rv = binding.rv
//
//        rv.adapter = customViewAdapter
//        rv.layoutManager = LinearLayoutManager(this)
//    }
//
//}