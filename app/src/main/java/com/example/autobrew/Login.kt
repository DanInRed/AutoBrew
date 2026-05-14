package com.example.autobrew

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_login)
        enableEdgeToEdge()
        val btnLogin = findViewById<Button>(R.id.login_btnLogin)
        val txtSignup = findViewById<TextView>(R.id.login_tvSignUp)

        btnLogin.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        txtSignup.setOnClickListener{
            val intent = Intent(this, Signup::class.java)
            startActivity(intent)
        }
    }
}