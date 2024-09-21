package com.example.testapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var minimumInput: EditText

    private lateinit var maximumInput: EditText

    private lateinit var resultText: TextView

    private lateinit var button: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        minimumInput = findViewById(R.id.minEditText)
        maximumInput = findViewById(R.id.maxEditText)
        resultText = findViewById(R.id.resultText)
        button = findViewById(R.id.button)

        button.setOnClickListener {
            resultText.text = "It works!"

        }



    }
}