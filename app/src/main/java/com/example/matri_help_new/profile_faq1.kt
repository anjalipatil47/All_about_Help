package com.example.matri_help_new

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.GridLayout
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

class profile_faq1 : AppCompatActivity() {

    private lateinit var cardPrivacy1: CardView
    private lateinit var cardProfile: CardView
    private lateinit var cardMembership: CardView
    private lateinit var cardOtherServices: CardView
    private lateinit var cardSearch: CardView
    private lateinit var cardContactMtches: CardView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile_faq1)


       cardPrivacy1 = findViewById(R.id.card_cardPrivacy1)
        cardProfile = findViewById(R.id.cardProfile)
        cardMembership = findViewById(R.id.cardMembership)
        cardOtherServices = findViewById(R.id.cardOtherServices)
        cardSearch = findViewById(R.id.cardSearch)
        cardContactMtches = findViewById(R.id.cardContactMtches)

        cardPrivacy1.setOnClickListener {
            val intent = Intent(this, privacy_clickable::class.java)
            startActivity(intent)
        }

          cardSearch.setOnClickListener {
            val intent = Intent(this, search_clickable::class.java)

            startActivity(intent)
           }

        cardProfile.setOnClickListener {
            val intent = Intent(this, profile_2::class.java)

            startActivity(intent)
        }

        cardMembership.setOnClickListener {
            val intent = Intent(this, membership_clickable::class.java)

            startActivity(intent)
        }

        cardOtherServices.setOnClickListener {
            val intent = Intent(this, otherServices_clickable::class.java)

            startActivity(intent)
        }

        cardContactMtches.setOnClickListener {
            val intent = Intent(this, contactMatches_clickable::class.java)

            startActivity(intent)
        }

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        var itemView = item.itemId
        when (itemView) {
            R.id.menu_search -> Toast.makeText(
                applicationContext,
                "Search Clicked",
                Toast.LENGTH_SHORT
            ).show()
            R.id.menu_chat -> Toast.makeText(applicationContext, "Chat Clicked", Toast.LENGTH_SHORT)
                .show()
        }
        return false
    }
}
