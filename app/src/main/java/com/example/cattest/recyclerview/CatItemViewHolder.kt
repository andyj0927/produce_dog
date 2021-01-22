package com.example.cattest.recyclerview

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.cattest.App
import com.example.cattest.Cat
import com.example.cattest.R
import kotlinx.android.synthetic.main.layout_cat_item.view.*

class CatItemViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
    private val catImageView = itemView.cat_image
    private val catName = itemView.cat_name
    private val catInfo = itemView.cat_info
    fun bindWithView(photoItem: Cat){
        catName.text = photoItem.catname
        catInfo.text = photoItem.desc

        // 이미지를 설정한다.
        Glide.with(App.instance)
            .load(photoItem.thumbnail)
            .placeholder(R.drawable.ic_baseline_insert_photo_24)
            .into(catImageView)
    }


}