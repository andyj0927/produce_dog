package com.example.cattest.recyclerview

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.cattest.App
import com.example.cattest.Cat
import com.example.cattest.R
import kotlinx.android.synthetic.main.layout_cat_item.view.*

class CatItemViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
    val catImageView = itemView.findViewById<ImageView>(R.id.cat_image) // itemView.cat_image
    val catName = itemView.findViewById<TextView>(R.id.cat_name)
    val catInfo = itemView.findViewById<TextView>(R.id.cat_info)
    fun bindWithView(photoItem: Cat){
        Glide.with(itemView).load(photoItem.thumbnail).into(catImageView)
        catName.text = photoItem.catname
        catInfo.text = photoItem.desc
    }
}
        // 이미지를 설정한다.
//        Glide.with(App.instance)
//            .load(photoItem.thumbnail)
//            .placeholder(R.drawable.ic_baseline_insert_photo_24)
//            .into(catImageView)


//    //View와 데이터를 연결시키는 함수
//    fun bind(layoutData : LayoutData){
//        //Glide 라이브러리를 사용해서 외부 링크를 ImageView에 넣을 수 있음
//        Glide.with(itemView).load(layoutData.img_goods).into(img_goods)
//        tv_goods.text = layoutData.tv_goods
//        ...
//    }