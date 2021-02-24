package com.example.matri_help_new

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class privacy_clickable : AppCompatActivity() {

    var deafault: TextView?=null

    private lateinit var txt_privacy1 : TextView
    private lateinit var txt_privacy2 : TextView
    private lateinit var txt_privacy3 : TextView
    private lateinit var txt_privacy4 : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_privacy_clickable)

        deafault=findViewById(R.id.Name)

        txt_privacy1 = findViewById(R.id.txt_privacy1)
        txt_privacy2 = findViewById(R.id.txt_privacy2)
        txt_privacy3 = findViewById(R.id.txt_privacy3)
        txt_privacy4 = findViewById(R.id.txt_privacy4)

        var msg=intent.getStringExtra("Message")
        deafault?.text = ":$msg"


        txt_privacy1.setOnClickListener {

            val intent = Intent(this, Privacy1::class.java)

            startActivity(intent)
        }

        txt_privacy2.setOnClickListener {

            val intent = Intent(this, Privacy2::class.java)

            startActivity(intent)
        }

        txt_privacy3.setOnClickListener {

            val intent = Intent(this, Privacy3::class.java)

            startActivity(intent)
        }

        txt_privacy4.setOnClickListener {

            val intent = Intent(this, Privacy4::class.java)

            startActivity(intent)
        }
    }
}