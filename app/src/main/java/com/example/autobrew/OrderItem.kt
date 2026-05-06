package com.example.autobrew

data class OrderItem(
    val name: String,
    val details: String,
    val price: Double,
    val quantity: Int
)