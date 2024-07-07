package com.example.constrainedtextviewapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.ImageView
import com.k.memeapptask.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageView1: ImageView = findViewById(R.id.imageView)
        imageView1.setImageResource(R.drawable.download)
        val imageView2: ImageView = findViewById(R.id.imageView)
        imageView2.setImageResource(R.drawable.download2)

    }
}
