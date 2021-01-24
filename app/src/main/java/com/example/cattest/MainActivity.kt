package com.example.cattest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.findNavController
import kotlinx.android.synthetic.main.activity_main.*
import fragment.NickFragment
import fragment.ResultFragment

/*닉넴 입출력
class MainActivity : AppCompatActivity(), Communicator {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragment_nick = NickFragment()
        supportFragmentManager.beginTransaction().replace(R.id.fragment_container, fragment_nick).commit()
    }

    override fun passDataCom(editTextInput: String){
        val bundle = Bundle()
        bundle.putString("message", editTextInput)

        val transaction = this.supportFragmentManager.beginTransaction()
        val fragment_result = ResultFragment()
        fragment_result.arguments = bundle
        transaction.replace(R.id.fragment_container, fragment_result)
        transaction.commit()
    }
}
*/

class MainActivity : AppCompatActivity() {

    lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navController = nav_host_fragment.findNavController()
    }
}