package com.example.viewbindingexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.viewbindingexample.databinding.ActivityNavBinding

class NavActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        val binding = ActivityNavBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_nav)
    }
}
