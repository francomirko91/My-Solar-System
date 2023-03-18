package com.example.mysolarsystem

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity(), PlanetsInterface {

    private lateinit var planetsList: ArrayList<Planets>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        planetsList = getPlanetsList()

        val planetsAdaptor = PlanetsAdaptor(planetsList, this)
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.adapter = planetsAdaptor

    }

    override fun onLearnMoreButton(position: Int) {
        val planets = planetsList[position]
        val intent = Intent(this, PlanetsDetailsActivity::class.java).apply {
        }
        startActivity(intent)
    }

    private fun getPlanetsList(): ArrayList<Planets> {
        return ArrayList<Planets>().apply {

            add(Planets(image = R.drawable.mercurio, name = "Mercury", button = "Discover"))
            add(Planets(image = R.drawable.venere, name = "Venus", button = "Discover"))
            add(Planets(image = R.drawable.terra, name = "Earth", button = "Discover"))
            add(Planets(image = R.drawable.marte, name = "Mars", button = "Discover"))
            add(Planets(image = R.drawable.giove, name = "Jupiter", button = "Discover"))
            add(Planets(image = R.drawable.saturno, name = "Saturn", button = "Discover"))
            add(Planets(image = R.drawable.urano, name = "Uran", button = "Discover"))
            add(Planets(image = R.drawable.nettuno, name = "Neptune", button = "Discover"))
            add(Planets(image = R.drawable.pluto, name = "Pluto", button = "Discover"))
        }
    }
}

