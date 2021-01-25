package com.example.cattest.fragment


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.OneShotPreDrawListener.add
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.cattest.Cat
import com.example.cattest.R
import com.example.cattest.recyclerview.CatGridRecyclerViewAdapter
import kotlinx.android.synthetic.main.fragment_view_all.*

class viewAllFragment : Fragment() {
    val mDatas = mutableListOf<Cat>()
    lateinit var navController: NavController

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_view_all, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        navController = Navigation.findNavController(view)
        btn_home.setOnClickListener {
            navController.navigate(R.id.action_viewAllFragment_to_mainFragment)
        }
        var myAdapter = CatGridRecyclerViewAdapter(view.context)
        mDatas.add(Cat(R.drawable.britishshorthair,"브리티쉬 숏헤어","#내성적       #현실적\n#ISTJ         #기억력갑"))
        mDatas.add(Cat(R.drawable.bangal,"뱅갈","#자신감       #활동적\n#ESTP         #호기심多"))
        mDatas.add(Cat(R.drawable.srasony,"스라소니","#과묵함       #독립적\n#ISTP         #적응력갑"))
        mDatas.add(Cat(R.drawable.dragonlee,"드래곤 리","#체계적       #사업가\n#ESTJ         #책임감多"))
        mDatas.add(Cat(R.drawable.norwayshop,"노르웨이 숲","#독립적       #호기심\n#INTJ         #똑똑함"))
        mDatas.add(Cat(R.drawable.turkishban,"터키쉬 반","#창의적       #논리적\n#INTP         #연구가"))
        mDatas.add(Cat(R.drawable.baliniz,"발리니즈","#통찰력       #모험심\n#ENTP         #다재다능"))
        mDatas.add(Cat(R.drawable.shiap,"샴","#솔직함       #지도자\n#ENTJ         #영리함"))
        mDatas.add(Cat(R.drawable.rusianblue,"러시안블루","#눈치빠름       #다정함\n#INFJ         #내성적"))
        mDatas.add(Cat(R.drawable.singapula,"싱가푸라","#활기참       #사교적\n#ENFP         #호기심多"))
        mDatas.add(Cat(R.drawable.buman,"버만","#침착함       #조용함\n#INFP         #애정多"))
        mDatas.add(Cat(R.drawable.tongkiniz,"통키니즈","#활기참       #사교적\n#ENFJ         #충성심多"))
        mDatas.add(Cat(R.drawable.persian,"페르시안","#차분함       #성실\n#ISFJ         #충실함"))
        mDatas.add(Cat(R.drawable.anatolian,"아나톨리안","#조용함       #배려심\n#ISFP         #온화함"))
        mDatas.add(Cat(R.drawable.spingks,"스핑크스","#사교적       #장난기\n#ESFP         #애정多"))
        mDatas.add(Cat(R.drawable.jamunlex,"저먼 렉스","#사람좋아       #애정\n#ESFJ         #친절함"))

        myAdapter.data = mDatas
        myAdapter.notifyDataSetChanged()
        my_photo_recycler_view.adapter = myAdapter
    }


}

