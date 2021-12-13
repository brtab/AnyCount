package com.example.aplicacioncuentas

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.aplicacioncuentas.databinding.FragmentCreateProductBinding
import com.google.android.material.dialog.MaterialAlertDialogBuilder


class CreateProductFragment : Fragment() {

    lateinit var binding: FragmentCreateProductBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_create_product, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentCreateProductBinding.bind(view)
        setListeners()
    }

    private fun setListeners() {
        binding.tvCategory.setOnClickListener {
            val items = arrayOf("item 1", "item 2")
            MaterialAlertDialogBuilder(requireContext())
                .setTitle("Seleccionar categoria")
                .setItems(items) { dialog, which ->
                    binding.tvCategory.text = items[which]
                }
                .show()
        }
    }


}