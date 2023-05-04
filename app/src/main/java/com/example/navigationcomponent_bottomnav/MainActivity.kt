package com.example.navigationcomponent_bottomnav

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.annotation.NavigationRes
import androidx.navigation.NavController
import androidx.navigation.NavDestination
import androidx.navigation.NavGraph
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.navigationcomponent_bottomnav.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlin.properties.Delegates

class MainActivity : AppCompatActivity(){

    lateinit var binding: ActivityMainBinding
    private lateinit var navController:NavController
    private lateinit var appBarConfiguration: AppBarConfiguration



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        navController = findNavController(R.id.fragmentContainerView)
//        appBarConfiguration =  AppBarConfiguration(setOf(R.id.nav_profile,R.id.nav_profile,R.id.nav_setting))
//        setupActionBarWithNavController(navController,appBarConfiguration)

        binding.bottomNavigationView.setupWithNavController(navController)

    }
      //  navController.addOnDestinationChangedListener(this)
//        binding.bottomNavigationView.setOnItemSelectedListener { item ->
//            when (item.itemId) {
//                R.id.menu_home -> {
//                    (homeNav)
//
//                    true
//                }
//                R.id.menu_profile -> {
//                    setSelectedNavGraphId(profileNav)
//
//                    true
//                }
//                R.id.menu_setting -> {
//                    setSelectedNavGraphId(settingNav)
//                    true
//                }
//                else -> {
//                    println(item.itemId)
//                    false
//                }
//            }
//        }
//





//    override fun onDestinationChanged(
//        controller: NavController,
//        destination: NavDestination,
//        arguments: Bundle?
//    ) {
//        val menuItem = binding.bottomNavigationView.menu.findItem(destination.id)
//        menuItem?.isChecked = true
//    }
//    override fun onSupportNavigateUp(): Boolean {
//        return navController.navigateUp(appBarConfiguration)
//    }
}