package com.example.tamagotchiapp2

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        val image = findViewById<ImageView>(R.id.imageView3)


        val secondActbtn = findViewById<Button>(R.id.Start)
        secondActbtn.setOnClickListener {
            val Intent = Intent(this,MainActivity2::class.java)
            startActivity(Intent)


            }

        }
    }
