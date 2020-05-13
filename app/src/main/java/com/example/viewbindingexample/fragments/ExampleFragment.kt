package com.example.viewbindingexample.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.viewbindingexample.R
import com.example.viewbindingexample.databinding.ExtraLayoutBinding
import com.example.viewbindingexample.dialogs.ExampleDialog
import kotlinx.android.synthetic.main.screen_example.*

/**
 *  Created by Ikromjonov Ma'rufjon
 *  data = 5/13/2020 , time = 16:54
 */

class ExampleFragment : Fragment() {
    private var _binding: ExtraLayoutBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        _binding = ExtraLayoutBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.buttonExtra.setOnClickListener {
            Toast.makeText(context, "Extra", Toast.LENGTH_SHORT).show()
            val dialog = ExampleDialog(requireContext())
            dialog.show()
            dialog.setOnCorrectListener {
//                dialog.cancel()
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}

/*
private var _binding: ResultProfileBinding? = null
// This property is only valid between onCreateView and
// onDestroyView.
private val binding get() = _binding!!

override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
): View? {
    _binding = ResultProfileBinding.inflate(inflater, container, false)
    val view = binding.root
    return view
}

override fun onDestroyView() {
    super.onDestroyView()
    _binding = null
}
* */