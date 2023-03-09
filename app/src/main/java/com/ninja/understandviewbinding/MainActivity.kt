package com.ninja.understandviewbinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.ninja.understandviewbinding.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root

        binding.title.text = "View Binding";
        binding.subtitle.text = "Use view binding to replace findViewById";
        binding.imageButton.setOnClickListener{
            Toast.makeText(applicationContext,"Thumb Up!",Toast.LENGTH_LONG).show()
        }
        setContentView(view)
    }
}