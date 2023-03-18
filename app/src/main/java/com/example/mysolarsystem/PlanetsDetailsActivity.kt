package com.example.mysolarsystem

import android.os.Bundle
import android.view.MenuItem
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class PlanetsDetailsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_planets_details)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val planets = intent.getSerializableExtra("planets") as? Planets

        val image: ImageView = findViewById(R.id.iv_planet)
        val name: TextView = findViewById(R.id.tv_planet)


    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            android.R.id.home -> {
                finish()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}