package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       val getStartedButton = findViewById<View>(R.id.getStartedButton)
        getStartedButton.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
                startActivity(intent)
            }

        }
    }


