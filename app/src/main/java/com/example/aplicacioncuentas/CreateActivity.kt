package com.example.aplicacioncuentas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.aplicacioncuentas.databinding.ActivityCreateBinding
import com.google.android.material.dialog.MaterialAlertDialogBuilder

class CreateActivity : AppCompatActivity() {
    lateinit var binding: ActivityCreateBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCreateBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setListeners()
    }

    private fun setListeners() {
        binding.tvCategory.setOnClickListener {
            val items = arrayOf("item 1", "item 2")
            MaterialAlertDialogBuilder(this)
                .setTitle("Seleccionar categoria")
                .setItems(items) { dialog, which ->
                    binding.tvCategory.text = items[which]
                }
                .show()
        }
    }
}