package com.example.autobrew

import android.content.Intent
import android.os.Bundle
import android.service.credentials.BeginCreateCredentialRequest
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val btnBeverage = findViewById<Button>(R.id.btnCoffee)
        val btnCarwash = findViewById<Button>(R.id.btnCarwash)
        val btnTrack = findViewById<Button>(R.id.btnTrack)
        val btnRev = findViewById<Button>(R.id.btnReview)


        btnBeverage.setOnClickListener{
            val intent = Intent(this, BeverageActivity::class.java)
            startActivity(intent)
        }

        btnCarwash.setOnClickListener {
            val intent = Intent(this, CarwashActivity::class.java)
            startActivity(intent)
        }

        btnTrack.setOnClickListener{
            val intent = Intent(this, TrackOrder::class.java)
            startActivity(intent)
        }

        btnRev.setOnClickListener{
            val intent = Intent(this, Review::class.java)
            startActivity(intent)
        }

    }
}