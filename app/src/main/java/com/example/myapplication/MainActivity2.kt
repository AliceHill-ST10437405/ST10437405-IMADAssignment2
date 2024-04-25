package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.view.View as View1

class MainActivity2() : AppCompatActivity() {




        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main2)


            val coverImage: ImageView = findViewById(R.id.coverImage)
            val feed: Button = findViewById(R.id.feedButton)
            val clean: Button = findViewById(R.id.cleanButton)
            val play: Button = findViewById(R.id.playButton)

            feed.setOnClickListener(
                View1.OnClickListener() {
                    coverImage.setImageResource(R.drawable.download__1_);
                },
            )

            clean.setOnClickListener(
                View1.OnClickListener() {
                    coverImage.setImageResource(R.drawable.images__4_);
                },
            )

            play.setOnClickListener(
                View1.OnClickListener() {
                    coverImage.setImageResource(R.drawable.download__2_)
                },
            )


        }
    }







