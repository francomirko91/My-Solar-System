package com.example.mysolarsystem

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val planetsList = getPlanetsList()
        val planetsAdaptor = PlanetsAdaptor(planetsList)
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.adapter = planetsAdaptor

    }

        private fun getPlanetsList(): ArrayList<Planets> {
            return ArrayList<Planets>().apply {

                add(Planets(image = R.drawable.mercurio, name = "Mercury", button = "Discover"))
                add(Planets(image = R.drawable.venere, name = "Venus",button = "Discover"))
                add(Planets(image = R.drawable.terra, name = "Earth",button = "Discover"))
                add(Planets(image = R.drawable.marte, name = "Mars",button = "Discover"))
                add(Planets(image = R.drawable.giove, name = "Jupiter",button = "Discover"))
                add(Planets(image = R.drawable.saturno, name = "Saturn",button = "Discover"))
                add(Planets(image = R.drawable.urano, name = "Uran",button = "Discover"))
                add(Planets(image = R.drawable.nettuno, name = "Neptune",button = "Discover"))
                add(Planets(image = R.drawable.pluto, name = "Pluto",button = "Discover"))
            }
        }
    }

