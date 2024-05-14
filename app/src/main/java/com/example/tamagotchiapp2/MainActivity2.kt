package com.example.tamagotchiapp2

import android.os.Bundle
import android.os.Handler
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.tamagotchiapp2.R.drawable.feed
import com.example.tamagotchiapp2.R.drawable.happy
import kotlinx.coroutines.Runnable

class MainActivity2 : AppCompatActivity() {

    private var hungerStat = 0
    private var cleanStat= 0
    private var happyStat = 0

    private lateinit var handler: Handler

    private lateinit var runnable: Runnable


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)


        val btnFeed: Button = findViewById<Button>(R.id.btnFeed)
        val btnClean: Button = findViewById<Button>(R.id.btnClean)
        val btnPlay: Button = findViewById<Button>(R.id.btnPlay)
        val hunger = findViewById<TextView>(R.id.textView4)
        val clean = findViewById<TextView>(R.id.textView5)
        val happy = findViewById<TextView>(R.id.textView6)
        val image = findViewById<ImageView>(R.id.imageView2)

        btnFeed.setOnClickListener {
            image.setImageResource(R.drawable.feed)
            if (hungerStat <10){
                hungerStat++
                hunger.text = "$hungerStat"
            }

            btnClean.setOnClickListener {
                image.setImageResource(R.drawable.wash);
                if (cleanStat <10 ){
                    cleanStat++
                    clean.text="$cleanStat"
                }

                btnPlay.setOnClickListener {
                   image.setImageResource(R.drawable.happy)
                    if (happyStat <10){
                        happyStat++
                        happy.text= "$happyStat"
                    }
                }

            }
            handler = Handler()
            runnable = object : Runnable{
                override fun run() {
                    if (hungerStat >0) {
                        hungerStat--
                        hunger.text = "$hungerStat"

                    }

                    if (cleanStat > 0 ) {
                        cleanStat--
                        clean.text = "$cleanStat"
                    }
                    if (happyStat <10) {
                        happyStat--
                        happy.text = "$happyStat"




                    }
                }
            }
        }
    }
}