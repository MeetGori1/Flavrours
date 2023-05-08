package com.example.flavrours

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.flavrours.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
//        binding.text.text = applicationContext.applicationInfo.name
    }
}