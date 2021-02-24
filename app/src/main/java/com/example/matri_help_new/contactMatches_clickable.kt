package com.example.matri_help_new

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class contactMatches_clickable : AppCompatActivity() {


    var deafault: TextView?=null

    private lateinit var txt_contact_match1 : TextView

    private lateinit var txt_contact_match2 : TextView
    private lateinit var txt_contact_match3 : TextView
    private lateinit var txt_contact_match4 : TextView
    private lateinit var txt_contact_match5 : TextView
    private lateinit var txt_contact_match6 : TextView
    private lateinit var txt_contact_match7 : TextView
    private lateinit var txt_contact_match8 : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact_matches_clickable)

        deafault=findViewById(R.id.Name)

        txt_contact_match1 = findViewById(R.id.txt_contact_match1)
        txt_contact_match2 = findViewById(R.id.txt_contact_match2)
        txt_contact_match3 = findViewById(R.id.txt_contact_match3)
        txt_contact_match4 = findViewById(R.id.txt_contact_match4)
        txt_contact_match5 = findViewById(R.id.txt_contact_match5)
        txt_contact_match6 = findViewById(R.id.txt_contact_match6)
        txt_contact_match7 = findViewById(R.id.txt_contact_match7)
        txt_contact_match8 = findViewById(R.id.txt_contact_match8)


        var msg=intent.getStringExtra("Message")
        deafault?.text = ":$msg"


        txt_contact_match1.setOnClickListener {

            val intent = Intent(this, ContactMatches1::class.java)

            startActivity(intent)
        }

        txt_contact_match2.setOnClickListener {

            val intent = Intent(this, ContactMatches2::class.java)

            startActivity(intent)
        }


        txt_contact_match3.setOnClickListener {

            val intent = Intent(this, ContactMatches3::class.java)

            startActivity(intent)
        }

        txt_contact_match4.setOnClickListener {

            val intent = Intent(this, ContactMatches4::class.java)

            startActivity(intent)
        }

        txt_contact_match5.setOnClickListener {

            val intent = Intent(this, ContactMatches5::class.java)

            startActivity(intent)
        }

        txt_contact_match6.setOnClickListener {

            val intent = Intent(this, ContactMatches6::class.java)

            startActivity(intent)
        }

        txt_contact_match7.setOnClickListener {

            val intent = Intent(this, ContactMatches7::class.java)

            startActivity(intent)
        }


        txt_contact_match8.setOnClickListener {

            val intent = Intent(this, ContactMatches8::class.java)

            startActivity(intent)
        }


    }
}