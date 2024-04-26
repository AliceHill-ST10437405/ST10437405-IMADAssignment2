package com.example.myapplication

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity2() : AppCompatActivity() {

    private lateinit var pet: Pet
    private lateinit var playTextView3: TextView
    private lateinit var cleanTextView2: TextView
    private lateinit var hungerTextView: TextView
    private lateinit var coverImage: ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main2)

        pet = Pet()
        playTextView3 = findViewById(R.id.playTextView3)
        cleanTextView2 = findViewById(R.id.cleanTextView2)
        hungerTextView = findViewById(R.id.hungerTextView)
        coverImage = findViewById(R.id.coverImage)

        val feedButton: Button = findViewById(R.id.feedButton)
        val cleanButton: Button = findViewById(R.id.cleanButton)
        val playButton: Button = findViewById(R.id.playButton)


        feedButton.setOnClickListener {
            pet.feed()
            updatePetStatus()
        }

        cleanButton.setOnClickListener {
            pet.clean
            updatePetStatus()
        }

        playButton.setOnClickListener {
            pet.play
            updatePetStatus()
        }
    }

    @SuppressLint("SetTextI18n")
    private fun updatePetStatus() {
        hungerTextView.text = "feed: ${pet.feed}"
        cleanTextView2.text = "Clean: ${pet.clean}"
        playTextView3.text = "Play: ${pet.play}"
        coverImage.setImageResource(getPetImageResource())
    }
    private fun getPetImageResource(): Int {
        return when {
            pet.isFeed() as Boolean -> R.drawable.download__1_
            pet.isClean() as Boolean -> R.drawable.images__4_
            else -> R.drawable.download__2_
        }



} }








