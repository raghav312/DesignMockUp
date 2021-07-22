package com.example.designactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.onboard_trial_1)

        val bt = findViewById<ImageView>(R.id.imageView6)
        bt.setOnClickListener {
            setContentView(R.layout.onboard_trial_2)
            val bt2 = findViewById<ImageView>(R.id.imageView7)
            bt2.setOnClickListener {
                setContentView(R.layout.onboard_trial_3)
            }
        }

    }

    override fun onBackPressed() {
        setContentView(R.layout.activity_main)
    }
}