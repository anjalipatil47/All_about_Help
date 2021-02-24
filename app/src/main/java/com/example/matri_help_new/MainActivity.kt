package com.example.matri_help_new

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : AppCompatActivity() {

   var deafault: TextView?=null

    private lateinit var Faq_details_card_view :LinearLayout
    private lateinit var feedback_details_card_view : LinearLayout
    private lateinit var chat_details_card_view :LinearLayout
    private lateinit var sotre_details_card_view :LinearLayout
    private lateinit var queries_details_card_view: LinearLayout




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        deafault=findViewById(R.id.Name)



        Faq_details_card_view = findViewById(R.id.Faq_details_card_view)

        feedback_details_card_view = findViewById(R.id.feedback_details_card_view)

        chat_details_card_view = findViewById(R.id.chat_details_card_view)

        sotre_details_card_view = findViewById(R.id.sotre_details_card_view)
        queries_details_card_view = findViewById(R.id.queries_details_card_view)



        var msg=intent.getStringExtra("Message")
        deafault?.text = ":$msg"


        Faq_details_card_view.setOnClickListener {

            val intent = Intent(this, profile_faq1::class.java)

            startActivity(intent)
        }

        feedback_details_card_view.setOnClickListener {
            val intent = Intent(this, feedback_2::class.java)

            startActivity(intent)
        }

        chat_details_card_view.setOnClickListener {
            val intent = Intent(this, chat_2::class.java)

            startActivity(intent)
        }

        sotre_details_card_view.setOnClickListener {
            val intent = Intent(this, retail_store_2::class.java)

            startActivity(intent)
        }

        queries_details_card_view.setOnClickListener {
            val intent = Intent(this, "Queries"::class.java)

            startActivity(intent)
        }

    }
}
