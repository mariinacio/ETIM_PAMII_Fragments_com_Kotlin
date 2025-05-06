package com.example.etimpamiifragmentscomkotlin

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.tabs.TabLayout
import com.example.etimpamiifragmentscomkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view= binding.root
        enableEdgeToEdge()
        setContentView(view)

        binding.tableLayout.addOnTabSelectedListener(
            object:TabLayout.OnTabSelectedListener{
                override fun onTabSelected(tab: TabLayout.Tab?) {
                   when(tab?.position){
                       0 -> supportFragmentManager
                           .beginTransaction()
                           .replace(R.id.fragmentContainerView, FirstFragment())
                           .commit()

                       1 -> supportFragmentManager
                           .beginTransaction()
                           .replace(R.id.fragmentContainerView, SecondFragment())
                           .commit()

                       2 -> supportFragmentManager
                           .beginTransaction()
                           .replace(R.id.fragmentContainerView, ThirdFragment())
                           .commit()
                   }
                }

                override fun onTabUnselected(tab: TabLayout.Tab?) {
                   // TODO("Not yet implemented")
                }

                override fun onTabReselected(tab: TabLayout.Tab?) {
                   // TODO("Not yet implemented")
                }
            }
        )
    }
}