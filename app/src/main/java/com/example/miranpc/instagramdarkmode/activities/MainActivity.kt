package com.example.miranpc.instagramdarkmode.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupWithNavController
import com.example.miranpc.instagramdarkmode.R
import kotlinx.android.synthetic.main.main_activity.*

class MainActivity : AppCompatActivity() {

    lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        navController = Navigation.findNavController(this, R.id.container)
        bottom_nav.setupWithNavController(navController)
        /* val toolbar = findViewById<androidx.appcompat.widget.Toolbar>(R.id.toolbar)
         setSupportActionBar(toolbar)
         val igHome= toolbar.findViewById<View>(R.id.ig_icon)
         val dmHome= toolbar.findViewById<View>(R.id.dm_icon)

         igHome.setOnClickListener{
             Toast.makeText(this, "IG", Toast.LENGTH_SHORT).show()
         }
         dmHome.setOnClickListener{
             Toast.makeText(this, "Direct Message", Toast.LENGTH_SHORT).show()
         }*/

//        bottom_nav.itemIconTintList = null;

    }
/*
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        MenuInflater(this).inflate(R.menu.main_menu, menu)
        return true
    }*/

    override fun onNavigateUp(): Boolean {
        return NavigationUI.navigateUp(navController, null)
    }
/*
    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when (item!!.itemId) {
            R.id.navigation_message-> Toast.makeText(this, "DM", Toast.LENGTH_SHORT).show()
            R.id.navigation_home -> Toast.makeText(this, "IG", Toast.LENGTH_SHORT).show()
        }
        return super.onOptionsItemSelected(item)
    }*/
}
