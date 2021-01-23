package com.example.cattest.recyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.cattest.App
import com.example.cattest.Cat
import com.example.cattest.R

class CatGridRecyclerViewAdapter(private val context: Context) : RecyclerView.Adapter<CatItemViewHolder>(){
    var data = mutableListOf<Cat>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CatItemViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.layout_cat_item,
            parent, false)

        return CatItemViewHolder(view)
    }

    override fun getItemCount(): Int = data.size

    override fun onBindViewHolder(holder: CatItemViewHolder, position: Int) {
        holder.bindWithView(data[position])
    }
}

