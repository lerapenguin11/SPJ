package com.example.spj.presentation

import android.annotation.SuppressLint
import android.annotation.TargetApi
import android.app.Activity
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import androidx.appcompat.app.AppCompatDelegate
import androidx.core.content.ContextCompat
import androidx.lifecycle.ViewModelProvider
import com.example.spj.APP_MAIN_ACTIVITY_SPJ
import com.example.spj.R
import com.example.spj.databinding.ActivityMainBinding
import com.example.spj.utilits.replaceFragmentMainActivitySPJ
import com.example.spj.viewModel.ThemeViewModel
import com.example.spj.viewModel.ThemeViewModelFactory

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var themeViewModel : ThemeViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        APP_MAIN_ACTIVITY_SPJ = this

        themeViewModel = ViewModelProvider(
            this,
            ThemeViewModelFactory(applicationContext.getSharedPreferences("MyPrefs", MODE_PRIVATE))
        ).get(
            ThemeViewModel::class.java
        )
        updateTheme()
    }

    override fun onStart() {
        super.onStart()
        replaceFragmentMainActivitySPJ(HomeFragment())
    }

    private fun updateTheme() {
        val isDarkThemeEnabled = themeViewModel.isDarkThemeEnabled()
        if (isDarkThemeEnabled) {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
        } else {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        }
    }
}