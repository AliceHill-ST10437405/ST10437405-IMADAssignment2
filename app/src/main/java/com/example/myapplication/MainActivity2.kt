package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView

class MainActivity2() : AppCompatActivity() {

    private fun onClick() {


        fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main2)


            val coverImage: ImageView = findViewById(R.id.coverImage)
            val feed: Button = findViewById(R.id.feedButton)
            val clean: Button = findViewById(R.id.cleanButton)
            val play: Button = findViewById(R.id.playButton)

            feed.setOnClickListener(
                View.OnClickListener() {
                    coverImage.setImageResource(R.drawable.download__1_);
                },
            )

            clean.setOnClickListener(
                View.OnClickListener() {
                    coverImage.setImageResource(R.drawable.images__4_);
                },
            )

            play.setOnClickListener(
                View.OnClickListener() {
                    coverImage.setImageResource(R.drawable.download__2_)
                },
            )


        }
    }
}






