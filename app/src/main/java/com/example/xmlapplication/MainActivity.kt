package com.example.xmlapplication

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val randomNumberView: TextView = findViewById(R.id.numberView)
        val randomNumberButton: Button = findViewById(R.id.randomButton)

        randomNumberButton.setOnClickListener {
            val randomNumber = Random.nextInt(0, 101)
            randomNumberView.text = randomNumber.toString()
        }
    }
}