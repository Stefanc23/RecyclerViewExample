package com.example.recyclerviewexample.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewexample.R
import com.example.recyclerviewexample.model.Coffee

class CoffeeAdapter(
    private val context: Context,
    private val dataset: List<Coffee>
) : RecyclerView.Adapter<CoffeeAdapter.ItemViewHolder>() {

    class ItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        val imageView: ImageView = view.findViewById<ImageView>(R.id.coffee_image)
        val nameTextView: TextView = view.findViewById<TextView>(R.id.coffee_name)
        val descriptionTextView: TextView = view.findViewById<TextView>(R.id.coffee_description)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)
        return ItemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val coffee = dataset[position]
        holder.imageView.setImageResource(coffee.imageResourceId)
        holder.nameTextView.text = coffee.name
        holder.descriptionTextView.text = coffee.description
    }

    override fun getItemCount() = dataset.size
}