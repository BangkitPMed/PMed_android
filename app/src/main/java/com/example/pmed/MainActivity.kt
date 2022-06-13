package com.example.pmed

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

       val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottom_navigation)
        val navController = findNavController(R.id.fragment_main)
        val appAppBarConfiguration = AppBarConfiguration(setOf(R.id.fragment_home,R.id.fragment_camera,R.id.fragment_profile))
        setupActionBarWithNavController(navController,appAppBarConfiguration)

        bottomNavigationView.setupWithNavController(navController)
    }
}