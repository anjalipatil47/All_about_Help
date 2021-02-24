package com.example.matri_help_new

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView

class profile_2 : AppCompatActivity() {

    var deafault: TextView?=null

    private lateinit var txt_profile1 : TextView

    private lateinit var txt_profile2 : TextView
    private lateinit var txt_profile3 : TextView
    private lateinit var txt_profile4 : TextView
    private lateinit var txt_profile5 : TextView
    private lateinit var txt_profile6 : TextView
    private lateinit var txt_profile7 : TextView
    private lateinit var txt_profile8 : TextView
    private lateinit var txt_profile9 : TextView
    private lateinit var txt_profile10 : TextView
    private lateinit var txt_profile11: TextView
    private lateinit var txt_profile12: TextView
    private lateinit var txt_profile13: TextView
    private lateinit var txt_profile14: TextView
    private lateinit var txt_profile15: TextView
    private lateinit var txt_profile16 : TextView
    private lateinit var txt_profile17: TextView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile_2)

        deafault=findViewById(R.id.Name)

        txt_profile1 = findViewById(R.id.txt_profile1)
        txt_profile2 = findViewById(R.id.txt_profile2)
        txt_profile3 = findViewById(R.id.txt_profile3)
        txt_profile4 = findViewById(R.id.txt_profile4)
        txt_profile5 = findViewById(R.id.txt_profile5)
        txt_profile6 = findViewById(R.id.txt_profile6)
        txt_profile7 = findViewById(R.id.txt_profile7)
        txt_profile8 = findViewById(R.id.txt_profile8)
        txt_profile9 = findViewById(R.id.txt_profile9)
        txt_profile10 = findViewById(R.id.txt_profile10)
        txt_profile11 = findViewById(R.id.txt_profile11)
        txt_profile12 = findViewById(R.id.txt_profile12)
        txt_profile13 = findViewById(R.id.txt_profile13)
        txt_profile14 = findViewById(R.id.txt_profile14)
        txt_profile15 = findViewById(R.id.txt_profile15)
        txt_profile16 = findViewById(R.id.txt_profile16)
        txt_profile17 = findViewById(R.id.txt_profile17)


        var msg=intent.getStringExtra("Message")
        deafault?.text = ":$msg"


        txt_profile1.setOnClickListener {

            val intent = Intent(this, Faq1::class.java)

            startActivity(intent)
        }

        txt_profile2.setOnClickListener {

            val intent = Intent(this, Faq2::class.java)

            startActivity(intent)
        }

        txt_profile3.setOnClickListener {

            val intent = Intent(this, Faq3::class.java)

            startActivity(intent)
        }

        txt_profile4.setOnClickListener {

            val intent = Intent(this, Faq4::class.java)

            startActivity(intent)
        }

        txt_profile5.setOnClickListener {

            val intent = Intent(this, Faq5::class.java)

            startActivity(intent)
        }

        txt_profile6.setOnClickListener {

            val intent = Intent(this, Faq6::class.java)

            startActivity(intent)
        }

        txt_profile7.setOnClickListener {

            val intent = Intent(this, Faq7::class.java)

            startActivity(intent)
        }

        txt_profile8.setOnClickListener {

            val intent = Intent(this, Faq8::class.java)

            startActivity(intent)
        }

        txt_profile9.setOnClickListener {

            val intent = Intent(this, Faq9::class.java)

            startActivity(intent)
        }

        txt_profile10.setOnClickListener {

            val intent = Intent(this, Faq10::class.java)

            startActivity(intent)
        }

        txt_profile11.setOnClickListener {

            val intent = Intent(this, Faq11::class.java)

            startActivity(intent)
        }

        txt_profile12.setOnClickListener {

            val intent = Intent(this, Faq12::class.java)

            startActivity(intent)
        }

        txt_profile13.setOnClickListener {

            val intent = Intent(this, Faq13::class.java)

            startActivity(intent)
        }

        txt_profile14.setOnClickListener {

            val intent = Intent(this, Faq14::class.java)

            startActivity(intent)
        }


        txt_profile15.setOnClickListener {

            val intent = Intent(this, Faq15::class.java)

            startActivity(intent)
        }


        txt_profile16.setOnClickListener {

            val intent = Intent(this, Faq16::class.java)

            startActivity(intent)
        }

        txt_profile17.setOnClickListener {

            val intent = Intent(this, Faq17::class.java)

            startActivity(intent)
        }

    }
}