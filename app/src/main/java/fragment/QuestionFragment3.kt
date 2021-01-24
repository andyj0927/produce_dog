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
import com.junga.temptest.fragment.algorithm
import kotlinx.android.synthetic.main.fragment_question3.*


class QuestionFragment3 : Fragment(), View.OnClickListener {

    lateinit var navController: NavController

    var user = algorithm(0, 0, 0, 0)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_question3, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view)

        next.setOnClickListener(this)
        back.setOnClickListener(this)
        option3_1.setOnClickListener(this)
        option3_2.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.next -> {
                navController.navigate(R.id.action_questionFragment3_to_questionFragment4)
            }

            R.id.back -> {
                navController.popBackStack()
            }

            R.id.option3_1 -> {
                var user = algorithm(0, 0, 0, 0)
                user.incrementEi()
            }

            R.id.option3_2 -> {
                var user = algorithm(1, 0, 0, 0)
                user.incrementEi()
            }
        }
    }

    fun navigationWithIndex(index: Int) {
        val bundle: Bundle = bundleOf("index" to index)
        navController.navigate(R.id.action_questionFragment3_to_questionFragment4, bundle)
    }
}