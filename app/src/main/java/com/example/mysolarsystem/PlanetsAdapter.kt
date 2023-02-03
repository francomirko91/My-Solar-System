package com.example.mysolarsystem

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class PlanetsAdapter(
    var planets: List<Planets>
) : RecyclerView.Adapter<PlanetsAdapter.PlanetsViewHolder>() {
    inner class PlanetsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)


    @SuppressLint("ResourceType")
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlanetsViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.id.recycle_view_row,parent,false)
        return PlanetsViewHolder(view)

    }

    override fun onBindViewHolder(holder: PlanetsViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return planets.size
    }
}