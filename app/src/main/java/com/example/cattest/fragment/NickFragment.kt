package com.example.cattest.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.cattest.R
import kotlinx.android.synthetic.main.fragment_nick.*

class NickFragment : Fragment() {
//    private var data = "cat"
    lateinit var navController: NavController

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        //주석처리한 부분은 QuestionFragment12에서 결과값을 받아오기 위한 부분을 임시로 코딩한 것입니다.
        // 유저에게 입력받을 닉네임 데이터와 함께 결과 값을 resultFragment 에서 쓰려면 어떻게 해야할 지 아직 몰라서 임시로 주석처리 해두었습니다.
  //      data = arguments?.getString("Data")?:"cat"
        return inflater.inflate(R.layout.fragment_nick, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        navController = Navigation.findNavController(view)
        btn_next.setOnClickListener {
    //        val bundle: Bundle = bundleOf("Data" to data)
            navController.navigate(R.id.action_nickFragment2_to_resultFragment2)
    //      navController.navigate(R.id.action_nickFragment2_to_resultFragment2, bundle)
        }
    }
}
