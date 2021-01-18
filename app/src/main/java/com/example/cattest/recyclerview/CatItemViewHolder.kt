package com.example.cattest.recyclerview

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.cattest.Cat
import kotlinx.android.synthetic.main.layout_cat_item.view.*

class CatItemViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
    private val catImageView = itemView.cat_image
    private val catName = itemView.cat_name
    private val catInfo = itemView.cat_info
    fun bindWithView(photoItem: Cat){
        catName.text = photoItem.catname
        catInfo.text = photoItem.desc
    }
}