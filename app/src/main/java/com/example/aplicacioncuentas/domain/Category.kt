package com.example.aplicacioncuentas.domain

data class Category(var name: String, val inheritedCategory: Category)