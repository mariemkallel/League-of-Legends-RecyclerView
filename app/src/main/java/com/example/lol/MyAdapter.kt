package com.example.lol

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(val champions:ArrayList<Champion>,val context:Context? ): RecyclerView.Adapter<MyAdapter.MyViewHolder>() {
    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var name: TextView = itemView.findViewById(R.id.name)
        var role: TextView = itemView.findViewById(R.id.role)
        var img: ImageView = itemView.findViewById(R.id.img)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        var view:View= LayoutInflater.from(parent.context).inflate(R.layout.single_item,parent,false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.name.text=champions[position].name
        holder.role.text=champions[position].role
        holder.img.setImageResource(champions[position].img)

    }

    override fun getItemCount(): Int {
        return champions.size
    }
}