package com.example.cattest.recyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.cattest.App
import com.example.cattest.Cat
import com.example.cattest.R

class CatGridRecyclerViewAdapter : RecyclerView.Adapter<CatItemViewHolder>(){
    private var catList = ArrayList<Cat>()

    // 뷰홀더와 레이아웃 연결
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CatItemViewHolder {
        val catItemViewHolder = CatItemViewHolder(LayoutInflater
                                        .from(parent.context)
                                        .inflate(R.layout.layout_cat_item, parent, false))
        return catItemViewHolder
    }

    // 보여줄 목록의 개수
    override fun getItemCount(): Int {
        return this.catList.size
    }
    // 뷰가 묶였을때 데이터를 뷰홀더에 넘겨준다.
    override fun onBindViewHolder(holder: CatItemViewHolder, position: Int) {
        holder.bindWithView(this.catList[position])
    }
    // 외부에서 어답터에 데이터 배열을 넣어준다.
    fun submitList(catList: ArrayList<Cat>){
        this.catList = catList
    }
}