package com.example.matri_help_new

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class otherServices_clickable : AppCompatActivity() {


    var deafault: TextView?=null

    private lateinit var txt_other_services1 : TextView
    private lateinit var txt_other_services2 : TextView
    private lateinit var txt_other_services3 : TextView
    private lateinit var txt_other_services4 : TextView
    private lateinit var txt_other_services5 : TextView
    private lateinit var txt_other_services6 : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_other_services_clickable)

        deafault=findViewById(R.id.Name)

        txt_other_services1 = findViewById(R.id.txt_other_services1)
        txt_other_services2 = findViewById(R.id.txt_other_services2)
        txt_other_services3 = findViewById(R.id.txt_other_services3)
        txt_other_services4 = findViewById(R.id.txt_other_services4)
        txt_other_services5 = findViewById(R.id.txt_other_services5)
        txt_other_services6 = findViewById(R.id.txt_other_services6)

        var msg=intent.getStringExtra("Message")
        deafault?.text = ":$msg"


        txt_other_services1.setOnClickListener {

            val intent = Intent(this, OtherServices1::class.java)

            startActivity(intent)
        }

        txt_other_services2.setOnClickListener {

            val intent = Intent(this, OtherServices2::class.java)

            startActivity(intent)
        }


        txt_other_services3.setOnClickListener {

            val intent = Intent(this, OtherServices3::class.java)

            startActivity(intent)
        }

        txt_other_services4.setOnClickListener {

            val intent = Intent(this, OtherServices4::class.java)

            startActivity(intent)
        }

        txt_other_services5.setOnClickListener {

            val intent = Intent(this, OtherServices5::class.java)

            startActivity(intent)
        }

        txt_other_services6.setOnClickListener {

            val intent = Intent(this, OtherServices6::class.java)

            startActivity(intent)
        }


    }
}