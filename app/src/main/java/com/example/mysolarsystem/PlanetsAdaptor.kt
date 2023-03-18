package com.example.mysolarsystem

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class PlanetsAdaptor(
    private val data: ArrayList<Planets>,
    private val planetsInterface: PlanetsInterface
) :
    RecyclerView.Adapter<PlanetsAdaptor.PlanetsViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlanetsViewHolder {
        return PlanetsViewHolder(parent)
    }

    override fun onBindViewHolder(holder: PlanetsAdaptor.PlanetsViewHolder, position: Int) {
        holder.onBind(data[position],planetsInterface)
    }

    override fun getItemCount(): Int {
        return data.size
    }


    inner class PlanetsViewHolder(parent: ViewGroup) : RecyclerView.ViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.recycle_view_row, parent, false)
    ) {

        private val image: ImageView = itemView.findViewById(R.id.iv_planet)
        private val name: TextView = itemView.findViewById(R.id.tv_planet)
        private val button: Button = itemView.findViewById(R.id.button)

        fun onBind(planets: Planets,planetsInterface: PlanetsInterface) {

            image.setImageResource(planets.image)
            name.text = planets.name
            button.setOnClickListener {
                planetsInterface.onLearnMoreButton(adapterPosition)
            }

        }

    }
}
