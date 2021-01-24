package fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.cattest.Communicator
import com.example.cattest.R
import kotlinx.android.synthetic.main.fragment_nick.view.*
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


class NickFragment : Fragment() {

    private lateinit var communicator: Communicator
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_nick, container, false)

        communicator = activity as Communicator

        view.sendBtn.setOnClickListener {
            communicator.passDataCom(view.messageInput.text.toString())
        }
        return view
    }

}