package com.example.converter.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.converter.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottomNavigation.setOnNavigationItemSelectedListener { menuItem ->

            when (menuItem.itemId) {
                R.id.menu_list -> mostra(ListFragment())

                R.id.menu_convert -> mostra(ConvertFragment())
            }
            return@setOnNavigationItemSelectedListener true
        }

        bottomNavigation.selectedItemId = R.id.menu_list
    }
    private fun mostra(fragment: Fragment) {
        val transaction = supportFragmentManager.beginTransaction()

        transaction.replace(R.id.frame, fragment)

        transaction.commit()
    }
}
