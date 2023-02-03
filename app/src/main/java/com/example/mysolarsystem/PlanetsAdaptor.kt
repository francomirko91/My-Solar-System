package com.example.mysolarsystem

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mysolarsystem.databinding.RecycleViewRowBinding

class PlanetsAdaptor(val items : MutableList<Planets>):
    RecyclerView.Adapter<PlanetsAdaptor.ViewHolder>() {

    private lateinit var binding: RecycleViewRowBinding

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlanetsAdaptor.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        binding= RecycleViewRowBinding.inflate(inflater,parent,false)
        return ViewHolder(binding)

    }

    override fun onBindViewHolder(holder: PlanetsAdaptor.ViewHolder, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemCount() = items.size


    inner class ViewHolder (itemView : RecycleViewRowBinding) : RecyclerView.ViewHolder(itemView.root){
        fun bind (item : Planets){
            binding.apply {
                tvDistance.text = item.distance.toString()
                tvKm.text = item.km.toString()
                tvMercury.text = item.name.toString()
            }



        }
    }
}