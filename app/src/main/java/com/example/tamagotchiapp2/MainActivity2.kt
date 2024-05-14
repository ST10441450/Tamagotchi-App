package com.example.tamagotchiapp2

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.tamagotchiapp2.R.drawable.feed
import com.example.tamagotchiapp2.R.drawable.happy

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)


        val feed: Button = findViewById<Button>(R.id.btnFeed)
        val clean: Button = findViewById<Button>(R.id.btnClean)
        val play: Button = findViewById<Button>(R.id.btnPlay)
        val image = findViewById<ImageView>(R.id.imageView2)

        feed.setOnClickListener {
            val image = (R.drawable.feed);

            clean.setOnClickListener {
                val image = (R.drawable.wash);

                play.setOnClickListener {
                   val image = (R.drawable.happy)
                }

            }
        }
    }
}