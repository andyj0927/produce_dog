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
import kotlinx.android.synthetic.main.fragment_question9.*


class QuestionFragment9 : Fragment(), View.OnClickListener {
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
        return inflater.inflate(R.layout.fragment_question9, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?){
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view)

        next.setOnClickListener(this)
        option9_1.setOnClickListener(this)
        option9_2.setOnClickListener(this)
        back.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.next -> {
                navController.navigate(R.id.action_questionFragment9_to_questionFragment10)
            }
            R.id.option9_1 -> {
                tmp.incrementTf()
                navigationWithData(tmp.getEi(), tmp.getSn(), tmp.getTf(), tmp.getJp())
            }
            R.id.option9_2 -> {
                navigationWithData(tmp.getEi(), tmp.getSn(), tmp.getTf(), tmp.getJp())
            }
            R.id.back -> {
                navController.popBackStack()
            }
        }

    }

    fun navigationWithData(data1: Int, data2: Int, data3: Int, data4: Int){
        val bundle: Bundle = bundleOf("Data1" to data1,"Data2" to data2,"Data3" to data3,"Data4" to data4)
        navController.navigate(R.id.action_questionFragment9_to_questionFragment10, bundle)
    }
}
