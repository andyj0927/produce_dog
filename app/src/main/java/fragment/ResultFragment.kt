package com.junga.cattest.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.junga.temptest.R
import kotlinx.android.synthetic.main.fragment_result.*

class ResultFragment : Fragment() {

    var option = -1

    lateinit var navController: NavController

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment

        option = arguments?.getInt("index")?:-1

        return inflater.inflate(R.layout.fragment_result, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view)
        setResult(option)

        btn_ot.setOnClickListener{
            navController.navigate(R.id.action_resultFragment_to_otherviewFragment)
        }
    }

    fun setResult(option : Int){
        val resultImage: ImageView = iv_main
        when(option){
            1 -> {
                tv_main.text = "@string/result_1"
                tv_sub.text = "@string/result_1_detail"
                iv_main.setImageResource(R.drawable.britishshorthair)
            }
            2 -> {
                tv_main.text = "@string/result_2"
                tv_sub.text = "@string/result_2_detail"
                iv_main.setImageResource(R.drawable.srasony)
            }
            3 -> {
                tv_main.text = "@string/result_3"
                tv_sub.text = "@string/result_3_detail"
                iv_main.setImageResource(R.drawable.bangal)
            }
            4 -> {
                tv_main.text = "@string/result_4"
                tv_sub.text = "@string/result_4_detail"
                iv_main.setImageResource(R.drawable.dragonlee)
            }
            5 -> {
                tv_main.text = "@string/result_5"
                tv_sub.text = "@string/result_5_detail"
                iv_main.setImageResource(R.drawable.rusianblue)
            }
            6 -> {
                tv_main.text = "@string/result_6"
                tv_sub.text = "@string/result_6_detail"
                iv_main.setImageResource(R.drawable.buman)
            }
            7 -> {
                tv_main.text = "@string/result_7"
                tv_sub.text = "@string/result_7_detail"
                iv_main.setImageResource(R.drawable.singapula)
            }
            8 -> {
                tv_main.text = "@string/result_8"
                tv_sub.text = "@string/result_8_detail"
                iv_main.setImageResource(R.drawable.tongkiniz)
            }
            9 -> {
                tv_main.text = "@string/result_9"
                tv_sub.text = "@string/result_9_detail"
                iv_main.setImageResource(R.drawable.persian)
            }
            10 -> {
                tv_main.text = "@string/result_10"
                tv_sub.text = "@string/result_10_detail"
                iv_main.setImageResource(R.drawable.anatolian)
            }
            11 -> {
                tv_main.text = "@string/result_11"
                tv_sub.text = "@string/result_11_detail"
                iv_main.setImageResource(R.drawable.spingks)
            }
            12 -> {
                tv_main.text = "@string/result_12"
                tv_sub.text = "@string/result_12_detail"
                iv_main.setImageResource(R.drawable.jamunlex)
            }
            13 -> {
                tv_main.text = "@string/result_13"
                tv_sub.text = "@string/result_13_detail"
                iv_main.setImageResource(R.drawable.norwayshop)
            }
            14 -> {
                tv_main.text = "@string/result_14"
                tv_sub.text = "@string/result_14_detail"
                iv_main.setImageResource(R.drawable.turkishban)
            }
            15 -> {
                tv_main.text = "@string/result_15"
                tv_sub.text = "@string/result_15_detail"
                iv_main.setImageResource(R.drawable.baliniz)
            }
            16 -> {
                tv_main.text = "@string/result_16"
                tv_sub.text = "@string/result_16_detail"
                iv_main.setImageResource(R.drawable.shiap)
            }
        }
    }

}
