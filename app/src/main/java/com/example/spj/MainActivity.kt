package com.example.spj

import android.annotation.SuppressLint
import android.annotation.TargetApi
import android.app.Activity
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import androidx.core.content.ContextCompat
import com.example.spj.databinding.ActivityMainBinding
import com.example.spj.presentation.HomeFragment
import com.example.spj.utilits.replaceFragmentMainActivitySPJ

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        APP_MAIN_ACTIVITY_SPJ = this
    }

    @SuppressLint("ObsoleteSdkInt")
    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    fun setStatusBarQuizAppActivityGradiant(activity: Activity) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            val backgroundActivity = ContextCompat.getDrawable(activity, R.color.white)
            val windowActivity: Window = activity.window
            windowActivity.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
            windowActivity.statusBarColor = ContextCompat.getColor(activity,android.R.color.transparent)
            windowActivity.setBackgroundDrawable(backgroundActivity)
        }
    }

    override fun onStart() {
        super.onStart()
        setStatusBarQuizAppActivityGradiant(this)
        replaceFragmentMainActivitySPJ(HomeFragment())
    }
}