package com.example.aplicacioncuentas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.aplicacioncuentas.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setListeners()
    }

    private fun setListeners() {
        binding.fabAdd.setOnClickListener {

        }
    }
}