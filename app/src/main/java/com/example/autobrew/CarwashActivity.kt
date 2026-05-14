package com.example.autobrew

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.autobrew.R.id.carwash_root

class CarwashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_carwash)

        val txtBack = findViewById<TextView>(R.id.btnBack)
        val btnBasic = findViewById<Button>(R.id.btnBasic)
        val btnInterior = findViewById<Button>(R.id.btnInterior)
        val btnPremium = findViewById<Button>(R.id.btnPremium)


        txtBack.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        btnBasic.setOnClickListener{
            val intent = Intent(this, ServiceWorkersActivity::class.java)
            startActivity(intent)
        }

        btnInterior.setOnClickListener{
            val intent = Intent(this, ServiceWorkersActivity::class.java)
            startActivity(intent)
        }

        btnPremium.setOnClickListener{
            val intent = Intent(this, ServiceWorkersActivity::class.java)
            startActivity(intent)
        }

    }
}