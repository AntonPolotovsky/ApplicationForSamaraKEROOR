package com.example.myapplication.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.example.myapplication.R
import com.example.myapplication.databinding.ActivityMainBinding
import com.example.myapplication.presentation.aboutkeroor.view.FragmentAboutKeroor
import com.example.myapplication.presentation.children.view.FragmentChildren
import com.example.myapplication.presentation.donation.view.FragmentDonation
import com.example.myapplication.presentation.mainpage.view.FragmentMainPage
import com.example.myapplication.presentation.medTourism.view.FragmentMedTourism
import com.example.myapplication.presentation.pensioners.view.FragmentPensioners
import com.example.myapplication.presentation.traditions.view.FragmentTraditions
import com.example.myapplication.presentation.volonteering.view.FragmentVolonteering
import com.example.myapplication.presentation.women.view.FragmentWomen
import com.example.myapplication.presentation.сafe.view.FragmentCafe
import com.google.android.material.navigation.NavigationView
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    lateinit var actionBarDrawerToggle: ActionBarDrawerToggle
    lateinit var drawerLayout: DrawerLayout
    lateinit var navigationView: NavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
//        setContentView(R.layout.activity_main)

        setSupportActionBar(binding.toolBar.toolBarApp)

        drawerLayout = findViewById(R.id.my_drawer_layout)
        navigationView = findViewById(R.id.navigation)
        actionBarDrawerToggle =
            ActionBarDrawerToggle(this, drawerLayout, R.string.nav_open, R.string.nav_close)
        drawerLayout.addDrawerListener(actionBarDrawerToggle)
        actionBarDrawerToggle.syncState()
        supportActionBar?.setDisplayHomeAsUpEnabled(true)



        navigationView.setNavigationItemSelectedListener { menuItem ->
            val id = menuItem.itemId
            drawerLayout.closeDrawer(GravityCompat.START)
            when (id) {
                R.id.mainFragment -> {
                    Toast.makeText(this, "На главную", Toast.LENGTH_SHORT).show()
                    supportFragmentManager.commit {
                        replace<FragmentMainPage>(R.id.fragment_container_view)
                        setReorderingAllowed(true)
                        addToBackStack("frag3")
                    }

                    true
                }
                R.id.about -> {
                    Toast.makeText(this, "О нас", Toast.LENGTH_SHORT).show()
                    supportFragmentManager.commit {
                        replace<FragmentAboutKeroor>(R.id.fragment_container_view)
                        setReorderingAllowed(true)
                        addToBackStack("frag4")
                    }


                    true
                }
                R.id.traditions -> {
                    Toast.makeText(this, "Наши традиции", Toast.LENGTH_SHORT).show()
                    supportFragmentManager.commit {
                        replace<FragmentTraditions>(R.id.fragment_container_view)
                        setReorderingAllowed(true)
                        addToBackStack("frag5")
                    }


                    true
                }
                R.id.women -> {
                    Toast.makeText(this, "Женский клуб", Toast.LENGTH_SHORT).show()
                    supportFragmentManager.commit {
                        replace<FragmentWomen>(R.id.fragment_container_view)
                        setReorderingAllowed(true)
                        addToBackStack("frag6")
                    }


                    true
                }
                R.id.children -> {
                    Toast.makeText(this, "Подростковый клуб", Toast.LENGTH_SHORT).show()
                    supportFragmentManager.commit {
                        replace<FragmentChildren>(R.id.fragment_container_view)
                        setReorderingAllowed(true)
                        addToBackStack("frag7")
                    }


                    true
                }

                R.id.pensioners -> {
                    Toast.makeText(this, "Пожилым", Toast.LENGTH_SHORT).show()
                    supportFragmentManager.commit {
                        replace<FragmentPensioners>(R.id.fragment_container_view)
                        setReorderingAllowed(true)
                        addToBackStack("frag7")
                    }


                    true
                }
                R.id.volunteering -> {
                    Toast.makeText(this, "Благотворительность", Toast.LENGTH_SHORT).show()
                    supportFragmentManager.commit {
                        replace<FragmentVolonteering>(R.id.fragment_container_view)
                        setReorderingAllowed(true)
                        addToBackStack("frag7")
                    }


                    true
                }
                R.id.medTourism -> {
                    Toast.makeText(this, "Медицинский туризм", Toast.LENGTH_SHORT).show()
                    supportFragmentManager.commit {
                        replace<FragmentMedTourism>(R.id.fragment_container_view)
                        setReorderingAllowed(true)
                        addToBackStack("frag8")
                    }


                    true
                }
               R.id.сafe -> {
                   Toast.makeText(this, "Кафе", Toast.LENGTH_SHORT).show()
                   supportFragmentManager.commit{
                       replace<FragmentCafe>(R.id.fragment_container_view)
                       setReorderingAllowed(true)
                       addToBackStack("frag9")
                   }
                   true
               }


                else -> {
                    false
                }

            }
        }
        binding.toolBar.donationAct.setOnClickListener {
            supportFragmentManager.commit {
                replace<FragmentDonation>(R.id.fragment_container_view)
                setReorderingAllowed(true)
                addToBackStack("fragD")
            }
        }

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        if (actionBarDrawerToggle.onOptionsItemSelected(item)) {
            return true
        }
        return super.onOptionsItemSelected(item)
    }

    override fun onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }






    }

