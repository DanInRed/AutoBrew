package com.example.autobrew

import android.os.Bundle
import android.widget.Button
import android.widget.RatingBar
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Review : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_review)

        val ratingBar = findViewById<RatingBar>(R.id.ratingBar)
        val btnSubmit = findViewById<Button>(R.id.btnSubmitReview)
        val btnSkip = findViewById<TextView>(R.id.btnSkipReview)

        btnSubmit.setOnClickListener {
            val rating = ratingBar.rating
            if (rating > 0) {
                Toast.makeText(this, "Thank you for the $rating star review!", Toast.LENGTH_SHORT).show()
                finish() // Go back to home
            } else {
                Toast.makeText(this, "Please select a rating", Toast.LENGTH_SHORT).show()
            }
        }

        btnSkip.setOnClickListener {
            finish()
        }
    }
}