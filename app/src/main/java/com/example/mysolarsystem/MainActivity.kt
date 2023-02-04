package com.example.mysolarsystem

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mysolarsystem.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    private var nameList : MutableList<Planets> = mutableListOf()
    private lateinit var planetsAdaptor : PlanetsAdaptor


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        loadData()
        planetsAdaptor = PlanetsAdaptor(nameList)
        binding.apply {
            rvPlanets.apply {
                layoutManager = LinearLayoutManager(this@MainActivity)
                adapter=planetsAdaptor

            }
        }

    }


    fun loadData(){
        nameList.add(Planets(R.drawable.mercurio, "Mercury"))
        nameList.add(Planets(R.drawable.venere, "Venus"))
        nameList.add(Planets(R.drawable.terra, "Earth"))
        nameList.add(Planets(R.drawable.marte, "Mars"))
        nameList.add(Planets(R.drawable.giove, "Jupiter"))
        nameList.add(Planets(R.drawable.saturno, "Saturn"))
        nameList.add(Planets(R.drawable.urano, "Uran"))
        nameList.add(Planets(R.drawable.nettuno, "Neptun"))
        nameList.add(Planets(R.drawable.pluto, "Pluton"))
    }
}