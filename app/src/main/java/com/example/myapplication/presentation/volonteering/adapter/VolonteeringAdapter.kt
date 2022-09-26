package com.example.myapplication.presentation.volonteering.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.databinding.ItemDescriptionLayoutBinding

class VolonteeringAdapter( private val volData:List<String?>): RecyclerView.Adapter<VolonteeringAdapter.CustomViewHolder>() {

    class CustomViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val binding = ItemDescriptionLayoutBinding.bind(itemView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(
            R.layout.item_description_layout,parent,false
        )
        return CustomViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        holder.binding.topText.text = volData[position]
    }

    override fun getItemCount(): Int = volData.size


}