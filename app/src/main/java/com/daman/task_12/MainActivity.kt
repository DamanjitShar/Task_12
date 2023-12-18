package com.daman.task_12

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.findNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    lateinit var navController : NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        navController = findNavController(R.id.container)
        val navView: BottomNavigationView = findViewById(R.id.bottom_navigation)
       // navView.setOnNavigationItemSelectedListener(onNavigationItemSelectedListener)
        navView.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.navigation_home -> {
                    navController.navigate(R.id.homeFragment)
                }
                R.id.navigation_search -> {
                    navController.navigate(R.id.searchFragment)
                }
                R.id.navigation_notifications -> {
                    navController.navigate(R.id.notificationsFragment)
                }
            }
            return@setOnItemSelectedListener  true
        }

    }


}
