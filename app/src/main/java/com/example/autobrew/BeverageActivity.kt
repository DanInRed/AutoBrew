package com.example.autobrew

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class BeverageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_beverage)

        val btnCappuccino = findViewById<Button>(R.id.btnCappuccino)
        val btnAmericano = findViewById<Button>(R.id.btnAmericano)
        val btnLatte = findViewById<Button>(R.id.btnLatte)
        val btnGoPromo = findViewById<Button>(R.id.btnGoPromo)
        val btnDelivery = findViewById<Button>(R.id.btnDelivery)
        val txtBack = findViewById<TextView>(R.id.btnBack)

        txtBack.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        btnCappuccino.setOnClickListener {
            Toast.makeText(this, "Cappuccino selected", Toast.LENGTH_SHORT).show()
        }

        btnAmericano.setOnClickListener {
            Toast.makeText(this, "Americano selected", Toast.LENGTH_SHORT).show()
        }

        btnLatte.setOnClickListener {
            Toast.makeText(this, "Latte selected", Toast.LENGTH_SHORT).show()
        }

        btnGoPromo.setOnClickListener {
            val intent = Intent(this, PromoActivity::class.java)
            startActivity(intent)
        }
        btnDelivery.setOnClickListener {
            val intent = Intent(this, Delivery::class.java)
            startActivity(intent)
        }
    }
}