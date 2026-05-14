package com.example.autobrew

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Signup : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_signup)
        val btnSignup = findViewById<Button>(R.id.signup_btnSignup)
        val txtLogin = findViewById<TextView>(R.id.signup_tvLogin)

        btnSignup.setOnClickListener{
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
        }

        txtLogin.setOnClickListener{
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
        }
    }
}