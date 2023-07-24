package com.example.sharingviewmodel_activiyfragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.activityViewModels
import com.example.sharingviewmodel_activiyfragment.databinding.FragmentTestBinding


class TestFragment : Fragment() {

    private lateinit var binding : FragmentTestBinding
    private val viewmodel : MainViewModel by activityViewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_test, container,false)
        binding.fragmentText.text = viewmodel.getCount().toString()

        return binding.root
    }
}