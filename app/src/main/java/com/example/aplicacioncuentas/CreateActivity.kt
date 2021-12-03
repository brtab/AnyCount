package com.example.aplicacioncuentas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.aplicacioncuentas.databinding.ActivityCreateBinding

class CreateActivity : AppCompatActivity() {
    lateinit var binding: ActivityCreateBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCreateBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }
}