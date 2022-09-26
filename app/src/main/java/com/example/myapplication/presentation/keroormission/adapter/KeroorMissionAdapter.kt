package com.example.myapplication.presentation.keroormission.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.databinding.ItemDescriptionLayoutBinding

class KeroorMissionAdapter(private val listMockData:List<String?>):RecyclerView.Adapter<KeroorMissionAdapter.CustomViewHolder>() {

    class CustomViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        val binding = ItemDescriptionLayoutBinding.bind(itemView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
       val itemView = LayoutInflater.from(parent.context).inflate(
           R.layout.item_description_layout,parent,false
       )
        return CustomViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        holder.binding.topText.text = listMockData[position]
    }

    override fun getItemCount(): Int = listMockData.size


}