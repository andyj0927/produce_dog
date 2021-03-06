package com.example.cattest

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class RecyclerViewAdapter(private val dataset: TelData): RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.listview_item,parent,false)
        return ViewHolder(view)
    }

    interface OnItemClickListener{
        fun onItemClick(v:View, data: phoneData, pos : Int)
    }
    private var listener : OnItemClickListener? = null
    fun setOnItemClickListener(listener : OnItemClickListener) {
        this.listener = listener
    }

    inner class ViewHolder(view: View): RecyclerView.ViewHolder(view) {
        private val photoImageView : ImageView = itemView.findViewById(R.id.photo)
        private val nametxt : TextView = itemView.findViewById(R.id.nameText)
        private val phonetxt: TextView = itemView.findViewById(R.id.phoneText)

        fun bind(item: phoneData) {
            Glide.with(itemView).load(item.photo).into(photoImageView)
            nametxt.text = item.name
            phonetxt.text = item.phone

            val pos = adapterPosition
            if(pos!= RecyclerView.NO_POSITION)
            {
                itemView.setOnClickListener {
                    listener?.onItemClick(itemView,item,pos)
                }
            }
        }
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind((dataset[position]))
    }

    override fun getItemCount(): Int = dataset.size
}