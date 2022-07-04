package com.example.cattest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import fragment.ResultFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        navController = navHostFragment.navController

        val bnv_main = findViewById<BottomNavigationView>(R.id.bnv_main)

        bnv_main.setOnNavigationItemSelectedListener { item ->
            changeFragment(
                when (item.itemId) {
                    R.id.contact -> {
                        //bnv_main.itemIconTintList = ContextCompat.getColorStateList(this, R.color.color_1)
                       // bnv_main.itemTextColor = ContextCompat.getColorStateList(this, R.color.color_1)
                        ContactFragment()

                    }
                    R.id.gallery -> {
//                        bnv_main.itemIconTintList = ContextCompat.getColorStateList(this, R.color.color_2)
//                        bnv_main.itemTextColor = ContextCompat.getColorStateList(this, R.color.color_2)
                        GalleryFragment()

                    }
                    else -> {
//                        bnv_main.itemIconTintList = ContextCompat.getColorStateList(this, R.color.color_3)
//                        bnv_main.itemTextColor = ContextCompat.getColorStateList(this, R.color.color_3)
                        LastFragment()

                    }
                }
            )
            true
        }
        bnv_main.selectedItemId = R.id.contact
    }
    private fun changeFragment(fragment: Fragment) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fl_con, fragment)
            .commit()
    }
}