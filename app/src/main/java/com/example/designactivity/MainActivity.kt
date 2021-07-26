package com.example.designactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.registraation_page)

        /*val bt = findViewById<ImageView>(R.id.imageView6)
        bt.setOnClickListener {
            setContentView(R.layout.onboard_trial_2)
            val bt2 = findViewById<ImageView>(R.id.imageView7)
            bt2.setOnClickListener {
                setContentView(R.layout.onboard_trial_3)
                val bt3= findViewById<ImageView>(R.id.imageView9)
                bt3.setOnClickListener {
                    setContentView(R.layout.onboard_trial_final)
                    val ca = findViewById<LinearLayout>(R.id.btnCreateAccount)
                    ca.setOnClickListener{println("Create Account Clicked")}
                    val login = findViewById<LinearLayout>(R.id.btnLogin)
                    login.setOnClickListener { println("Login clicked") }
                }
            }
        }

        val bt_2 = findViewById<Button>(R.id.button2)
        bt_2.setOnClickListener {
            setContentView(R.layout.registraation_page)
        }*/

    }

    override fun onBackPressed() {
        setContentView(R.layout.activity_main)
    }
}