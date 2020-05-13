package com.example.viewbindingexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.viewbindingexample.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.text
    }
}
