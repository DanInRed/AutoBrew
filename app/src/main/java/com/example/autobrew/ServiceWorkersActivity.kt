package com.example.autobrew

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ServiceWorkersActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_service_workers)

        val btn1 = findViewById<Button>(R.id.btnHire1)
        val btn2 = findViewById<Button>(R.id.btnHire2)
        val btn3 = findViewById<Button>(R.id.btnHire3)
        val txtBack = findViewById<Button>(R.id.btnBack)


        txtBack.setOnClickListener {
            val intent = Intent(this, CarwashActivity::class.java)
            startActivity(intent)
        }

        btn1.setOnClickListener {
            Toast.makeText(this, "Hired John!", Toast.LENGTH_SHORT).show()
        }

        btn2.setOnClickListener {
            Toast.makeText(this, "Hired Mark!", Toast.LENGTH_SHORT).show()
        }

        btn3.setOnClickListener {
            Toast.makeText(this, "Hired Alex!", Toast.LENGTH_SHORT).show()
        }
    }
}