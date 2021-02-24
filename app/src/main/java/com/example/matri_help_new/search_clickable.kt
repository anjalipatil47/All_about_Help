package com.example.matri_help_new

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class search_clickable : AppCompatActivity() {

    var deafault: TextView?=null

    private lateinit var txt_search1 : TextView
    private lateinit var txt_search2 : TextView
    private lateinit var txt_search3 : TextView
    private lateinit var txt_search4 : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search_clickable)

        deafault=findViewById(R.id.Name)

        txt_search1 = findViewById(R.id.txt_search1)
        txt_search2 = findViewById(R.id.txt_search2)
        txt_search3 = findViewById(R.id.txt_search3)
        txt_search4 = findViewById(R.id.txt_search4)

        var msg=intent.getStringExtra("Message")
        deafault?.text = ":$msg"


        txt_search1.setOnClickListener {

            val intent = Intent(this, Search1::class.java)

            startActivity(intent)
        }

        txt_search2.setOnClickListener {

            val intent = Intent(this, Search2::class.java)

            startActivity(intent)
        }

        txt_search3.setOnClickListener {

            val intent = Intent(this, Search3::class.java)

            startActivity(intent)
        }

        txt_search4.setOnClickListener {

            val intent = Intent(this, Search4::class.java)

            startActivity(intent)
        }
    }
}