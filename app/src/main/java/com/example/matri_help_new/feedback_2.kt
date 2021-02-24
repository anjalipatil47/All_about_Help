package com.example.matri_help_new

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class feedback_2 : AppCompatActivity() {

    private lateinit var img_chat_1: ImageView
    private lateinit var SubmitBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feedback_2)

        img_chat_1 = findViewById(R.id.img_chat_1)
        SubmitBtn = findViewById(R.id.SubmitBtn)
        img_chat_1.setOnClickListener {

            val intent = Intent(this, Chat_with_cust::class.java)
            startActivity(intent)
        }

        SubmitBtn.setOnClickListener {

            val intent = Intent(this, SubmitBtn::class.java)
            startActivity(intent)
        }

    }
}