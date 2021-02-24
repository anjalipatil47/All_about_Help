package com.example.matri_help_new

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class membership_clickable : AppCompatActivity() {

    var deafault: TextView?=null

    private lateinit var txt_mem1 : TextView
    private lateinit var txt_mem2 : TextView
    private lateinit var txt_mem3 : TextView
    private lateinit var txt_mem4 : TextView
    private lateinit var txt_mem5 : TextView
    private lateinit var txt_mem6 : TextView
    private lateinit var txt_mem7 : TextView
    private lateinit var txt_mem8 : TextView
    private lateinit var txt_mem9 : TextView
    private lateinit var txt_mem10 : TextView
    private lateinit var txt_mem11 : TextView
    private lateinit var txt_mem12 : TextView
    private lateinit var txt_mem13 : TextView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_membership_clickable)


        deafault=findViewById(R.id.Name)

        txt_mem1 = findViewById(R.id.txt_mem1)
        txt_mem2 = findViewById(R.id.txt_mem2)
        txt_mem3 = findViewById(R.id.txt_mem3)
        txt_mem4 = findViewById(R.id.txt_mem4)
        txt_mem5 = findViewById(R.id.txt_mem5)
        txt_mem6 = findViewById(R.id.txt_mem6)
        txt_mem7 = findViewById(R.id.txt_mem7)
        txt_mem8 = findViewById(R.id.txt_mem8)
        txt_mem9 = findViewById(R.id.txt_mem9)
        txt_mem10 = findViewById(R.id.txt_mem10)
        txt_mem11 = findViewById(R.id.txt_mem11)
        txt_mem12 = findViewById(R.id.txt_mem12)
        txt_mem13 = findViewById(R.id.txt_mem13)


        var msg=intent.getStringExtra("Message")
        deafault?.text = ":$msg"


        txt_mem1.setOnClickListener {

            val intent = Intent(this, Membership1::class.java)

            startActivity(intent)
        }


        txt_mem2.setOnClickListener {

            val intent = Intent(this, Membership2::class.java)

            startActivity(intent)
        }


        txt_mem3.setOnClickListener {

            val intent = Intent(this, Membership3::class.java)

            startActivity(intent)
        }
        txt_mem4.setOnClickListener {

            val intent = Intent(this, Membership4::class.java)

            startActivity(intent)
        }

        txt_mem5.setOnClickListener {

            val intent = Intent(this, Membership5::class.java)

            startActivity(intent)
        }

        txt_mem6.setOnClickListener {

            val intent = Intent(this, Membership6::class.java)

            startActivity(intent)
        }

        txt_mem7.setOnClickListener {

            val intent = Intent(this, Membership7::class.java)

            startActivity(intent)
        }

        txt_mem8.setOnClickListener {

            val intent = Intent(this, Membership8::class.java)

            startActivity(intent)
        }

        txt_mem9.setOnClickListener {

            val intent = Intent(this, Membership9::class.java)

            startActivity(intent)
        }

        txt_mem10.setOnClickListener {

            val intent = Intent(this, Membership10::class.java)

            startActivity(intent)
        }

        txt_mem11.setOnClickListener {

            val intent = Intent(this, Membership11::class.java)

            startActivity(intent)
        }

        txt_mem12.setOnClickListener {

            val intent = Intent(this, Membership12::class.java)

            startActivity(intent)
        }

        txt_mem13.setOnClickListener {

            val intent = Intent(this, Membership13::class.java)

            startActivity(intent)
        }



    }
}