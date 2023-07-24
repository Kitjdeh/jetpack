package com.example.fragmentviewmodel

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.fragmentviewmodel.databinding.FragmentTextBinding

class TestFragment : Fragment() {

    private lateinit var binding: FragmentTextBinding

    var countValue = 0

    private lateinit var viewmodel: TestFragmentViewModel

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d("TESTFRAGMENT","onAttach")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("TESTFRAGMENT","onCreate")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        Log.d("TESTFRAGMENT","onCreateView")

        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_text,container,false)

        viewmodel = ViewModelProvider(this).get(TestFragmentViewModel::class.java)
        binding.resultArea.text = viewmodel.getCount().toString()
        binding.plusBtn.setOnClickListener {
//            countValue ++
//            binding.resultArea.text = countValue.toString()
            viewmodel.plus()
            binding.resultArea.text = viewmodel.getCount().toString()
        }

        binding.minusBtn.setOnClickListener {
//            countValue --
//            binding.resultArea.text = countValue.toString()
            viewmodel.minus()
            binding.resultArea.text = viewmodel.getCount().toString()
        }
        return binding.root
    }

    override fun onResume() {
        super.onResume()
        Log.d("TESTFRAGMENT","onResume")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("TESTFRAGMENT","onDestroy")
    }

    override fun onDetach() {
        super.onDetach()
        Log.d("TESTFRAGMENT","onDetach")
    }


}