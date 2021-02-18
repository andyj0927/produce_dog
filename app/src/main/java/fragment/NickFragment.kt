package fragment


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.cattest.R
import kotlinx.android.synthetic.main.fragment_nick.*

class NickFragment : Fragment(){
    var option = "cat"

    lateinit var navController: NavController

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        option = arguments?.getString("Data")?:"cat"

        return inflater.inflate(R.layout.fragment_nick, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view)

        sendBtn.setOnClickListener{
            navigationWithData(option)
        }

    }

    fun navigationWithData(data: String){
        val bundle: Bundle = bundleOf("Data" to data)
        navController.navigate(R.id.action_nickFragment2_to_resultFragment2, bundle)
    }
}
