package com.example.kotlin_intent_lesson

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        var tvMessage = findViewById<TextView>(R.id.tvMessage)
        val i = intent
        i?.let {
            tvMessage.text = i.getCharSequenceExtra("Intent")
        }
    }
}