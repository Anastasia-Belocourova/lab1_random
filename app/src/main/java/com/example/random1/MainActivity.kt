package com.example.random1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlin.random.Random


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById<Button>(R.id.btn)
        val textView = findViewById<TextView>(R.id.textView)

        btn.setOnClickListener {
            val random = Random.nextInt(10, 99) +1
            textView.text = random.toString()
        }
    }
}