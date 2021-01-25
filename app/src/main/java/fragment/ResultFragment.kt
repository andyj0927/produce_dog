package fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.cattest.R
import kotlinx.android.synthetic.main.fragment_result.*

/*닉네임 출력 부분
class ResultFragment : Fragment() {

    var displayMessage: String? = ""

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_nick, container, false)

        displayMessage = arguments?.getString("message")

        view.displayMessage.text = displayMessage

        return view
    }

}
*/

class ResultFragment : Fragment() {

    var option = "cat"

    lateinit var navController: NavController

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment

        option = arguments?.getString("Data")?:"cat"

        return inflater.inflate(R.layout.fragment_result, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view)
        setResult(option)

        btn_ot.setOnClickListener{
            navController.navigate(R.id.action_resultFragment2_to_viewAllFragment)
        }
    }

    fun setResult(option : String){
        val resultImage: ImageView = iv_main
        when(option){
            "ISTJ" -> {
                tv_main.text = "@string/result_1"
                tv_sub.text = "@string/result_1_detail"
                iv_main.setImageResource(R.drawable.britishshorthair)
            }
            "ESTP" -> {
                tv_main.text = "@string/result_2"
                tv_sub.text = "@string/result_2_detail"
                iv_main.setImageResource(R.drawable.srasony)
            }
            "ISTP" -> {
                tv_main.text = "@string/result_3"
                tv_sub.text = "@string/result_3_detail"
                iv_main.setImageResource(R.drawable.bangal)
            }
            "ESTJ" -> {
                tv_main.text = "@string/result_4"
                tv_sub.text = "@string/result_4_detail"
                iv_main.setImageResource(R.drawable.dragonlee)
            }
            "INTJ" -> {
                tv_main.text = "@string/result_5"
                tv_sub.text = "@string/result_5_detail"
                iv_main.setImageResource(R.drawable.rusianblue)
            }
            "INTP" -> {
                tv_main.text = "@string/result_6"
                tv_sub.text = "@string/result_6_detail"
                iv_main.setImageResource(R.drawable.buman)
            }
            "ENTP" -> {
                tv_main.text = "@string/result_7"
                tv_sub.text = "@string/result_7_detail"
                iv_main.setImageResource(R.drawable.singapula)
            }
            "ENTJ" -> {
                tv_main.text = "@string/result_8"
                tv_sub.text = "@string/result_8_detail"
                iv_main.setImageResource(R.drawable.tongkiniz)
            }
            "INFJ" -> {
                tv_main.text = "@string/result_9"
                tv_sub.text = "@string/result_9_detail"
                iv_main.setImageResource(R.drawable.persian)
            }
            "ENFP" -> {
                tv_main.text = "@string/result_10"
                tv_sub.text = "@string/result_10_detail"
                iv_main.setImageResource(R.drawable.anatolian)
            }
            "INFP" -> {
                tv_main.text = "@string/result_11"
                tv_sub.text = "@string/result_11_detail"
                iv_main.setImageResource(R.drawable.spingks)
            }
            "ENFJ" -> {
                tv_main.text = "@string/result_12"
                tv_sub.text = "@string/result_12_detail"
                iv_main.setImageResource(R.drawable.jamunlex)
            }
            "ISFJ" -> {
                tv_main.text = "@string/result_13"
                tv_sub.text = "@string/result_13_detail"
                iv_main.setImageResource(R.drawable.norwayshop)
            }
            "ISFP" -> {
                tv_main.text = "@string/result_14"
                tv_sub.text = "@string/result_14_detail"
                iv_main.setImageResource(R.drawable.turkishban)
            }
            "ESFP" -> {
                tv_main.text = "@string/result_15"
                tv_sub.text = "@string/result_15_detail"
                iv_main.setImageResource(R.drawable.baliniz)
            }
            "ESFJ" -> {
                tv_main.text = "@string/result_16"
                tv_sub.text = "@string/result_16_detail"
                iv_main.setImageResource(R.drawable.shiap)
            }
        }
    }

}
