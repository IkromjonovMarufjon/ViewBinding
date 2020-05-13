package com.example.viewbindingexample.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.viewbindingexample.adapter.ExampAdapter
import com.example.viewbindingexample.databinding.ScreenSecondBinding
import com.example.viewbindingexample.model.ExampData

/**
 *  Created by Ikromjonov Ma'rufjon
 *  data = 5/13/2020 , time = 17:31
 */
 
class SecondFragment : Fragment() {
    private var _binding : ScreenSecondBinding? = null
    private val binding get() = _binding!!
    private val adapter = ExampAdapter()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        _binding = ScreenSecondBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.list.layoutManager = LinearLayoutManager(requireContext())
        binding.list.adapter = adapter
        adapter.submitList(loadData())
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding.list.adapter = null
        _binding = null
    }

    private fun loadData() : ArrayList<ExampData>{
        val data = ArrayList<ExampData>()
        for (i in 0 until 100){
            data.add(ExampData(i,"text ${i*i}"))
        }
        return data
    }
}