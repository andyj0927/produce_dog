package fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.cattest.R
import com.junga.cattest.fragment.Algorithm
import kotlinx.android.synthetic.main.fragment_question12.*


class QuestionFragment12 : Fragment(), View.OnClickListener {
    var tmp = Algorithm(0,0,0,0)

    lateinit var navController: NavController

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        tmp.ei = arguments?.getInt("Data1")?:-1
        tmp.sn = arguments?.getInt("Data2")?:-1
        tmp.tf = arguments?.getInt("Data3")?:-1
        tmp.jp = arguments?.getInt("Data4")?:-1
        return inflater.inflate(R.layout.fragment_question12, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?){
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view)

        next.setOnClickListener(this)
        option12_1.setOnClickListener(this)
        option12_2.setOnClickListener(this)
        back.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.next -> {
                navController.navigate(R.id.action_questionFragment12_to_nickFragment2)
            }
            R.id.option12_1 -> {
                tmp.incrementSn()
                navigationWithData(tmp.evaluateMBTI())
            }
            R.id.option12_2 -> {
                navigationWithData(tmp.evaluateMBTI())
            }
            R.id.back -> {
                navController.popBackStack()
            }
        }
    }

    fun navigationWithData(data: String){
        val bundle: Bundle = bundleOf("Data" to data)
        navController.navigate(R.id.action_questionFragment12_to_nickFragment2, bundle)
    }
}
