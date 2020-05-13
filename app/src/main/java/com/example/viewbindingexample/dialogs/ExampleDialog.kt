package com.example.viewbindingexample.dialogs

import android.app.Dialog
import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AlertDialog
import com.example.viewbindingexample.databinding.DialogExampleBinding

/**
 *  Created by Ikromjonov Ma'rufjon
 *  data = 5/13/2020 , time = 17:12
 */
 
class ExampleDialog(context: Context) : AlertDialog(context){
    private var listener : (() -> Unit)? =null
    private var _binding : DialogExampleBinding? =null
    private val binding get() = _binding!!

    init {
        Log.d("TTT","init")
        _binding = DialogExampleBinding.inflate(layoutInflater)
        setView(binding.root)
        binding.text.text = "Hello world!!"
        setButton(Dialog.BUTTON_POSITIVE,"Ok") { _, _ ->
            listener?.invoke()
        }
        setButton(Dialog.BUTTON_NEGATIVE, "Cancel", { _, _ -> })
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("TTT","onCreate")
    }

    fun setOnCorrectListener(f:()->Unit){
        listener = f
    }

    override fun onDetachedFromWindow() {
        super.onDetachedFromWindow()
        _binding = null
        Log.d("TTT","onDetachedFromWindow")
    }
}
/*
class PasswordDialog(context: Context) : AlertDialog(context) {
    private var listener: (() -> Unit)? = null

    init {
        val v = LayoutInflater.from(context).inflate(R.layout.dialog_password, null, false)
        setView(v)
        setButton(Dialog.BUTTON_POSITIVE, "Ok") { dialog, which ->
            if (v.inputPassword.text.toString() == "145236") {
                listener?.invoke()
            } else{
                v.inputPassword.error = "Wrong password"
            }
        }
        setButton(Dialog.BUTTON_NEGATIVE, "Cancel", { dialog, which -> })
    }

    fun setOnCorrectListener(f:()->Unit){
        listener = f
    }
}
* */