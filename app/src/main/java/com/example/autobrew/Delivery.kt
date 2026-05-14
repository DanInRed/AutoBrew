package com.example.autobrew

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Delivery : AppCompatActivity() {

    private val deliveryFee = 45.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_delivery)



        // 1. Create your data (In a real app, this comes from a Cart)
        val myOrder = listOf(
            OrderItem("Signature Cappuccino", "Less Sugar", 120.0, 1),
            OrderItem("Iced Americano", "Extra Shot", 110.0, 1),
            OrderItem("Latte", "With Spit", 140.0, 1)
        )

        // 2. Set up RecyclerView
        val recyclerView = findViewById<RecyclerView>(R.id.rvOrderItems)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = OrderAdapter(myOrder)

        val btnBack = findViewById<TextView>(R.id.btnBack)
        val btnCancel = findViewById<Button>(R.id.btnCancel)
        val btnConfirm = findViewById<Button>(R.id.btnPlaceOrder)

        // 3. Automate Calculations
        calculateTotals(myOrder)

        // Back Arrow Logic
        btnBack.setOnClickListener {
            finish() // Closes this screen and returns to the previous one
        }

        // Cancel Button Logic
        btnCancel.setOnClickListener {
            // You could add a "Are you sure?" popup here later
            finish()
        }

        // Confirm Button Logic
        btnConfirm.setOnClickListener {
            // Handle payment logic here
            Toast.makeText(this, "Order Confirmed! Brewing your coffee...", Toast.LENGTH_SHORT).show()
        }
    }


    private fun calculateTotals(items: List<OrderItem>) {
        val tvSubtotal = findViewById<TextView>(R.id.tvSubtotal)
        val tvTotal = findViewById<TextView>(R.id.tvTotal)
        val tvFee = findViewById<TextView>(R.id.tvDeliveryFee)

        // Math logic
        val subtotal = items.sumOf { it.price * it.quantity }
        val total = subtotal + deliveryFee

        // Update UI
        tvSubtotal.text = "₱${String.format("%.2f", subtotal)}"
        tvFee.text = "₱${String.format("%.2f", deliveryFee)}"
        tvTotal.text = "₱${String.format("%.2f", total)}"
    }
}