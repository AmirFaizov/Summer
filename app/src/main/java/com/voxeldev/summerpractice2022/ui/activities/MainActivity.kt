package com.voxeldev.summerpractice2022.ui.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import com.voxeldev.summerpractice2022.R
import com.voxeldev.summerpractice2022.data.models.Taxi
import com.voxeldev.summerpractice2022.data.models.TaxiRepository


class MainActivity : AppCompatActivity() {

    lateinit var taxists: List<Taxi>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val taxiRepository = TaxiRepository()
        taxists = taxiRepository.getTaxisits()

        setContentView(R.layout.activity_main)

        val navController = findNavController(R.id.main_nav_host_fragment)

        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.navigation_list,
                R.id.navigation_details
            )
        )

        setupActionBarWithNavController(navController, appBarConfiguration)
    }
}