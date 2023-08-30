package com.example.spj.presentation.onBoarding

import android.annotation.SuppressLint
import android.annotation.TargetApi
import android.app.Activity
import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.Window
import android.view.WindowManager
import android.widget.ImageView
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.example.spj.R
import com.example.spj.presentation.MainActivity
import com.example.spj.presentation.onBoarding.onBoardingAdapter.OnBoardingAdapter
import com.tbuonomo.viewpagerdotsindicator.DotsIndicator

class OnBoardingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_on_boarding)
        setViewPager()
        setStatusBarGradiantOnBoardingActivity(this)
    }

    private fun setViewPager() {
        val fragList = ArrayList<Fragment>()
        fragList.add(ThirstStartFragment())
        fragList.add(SecondFinishFragment())
        val adapterVP = OnBoardingAdapter(
            fragList,
            this.supportFragmentManager,
            lifecycle
        )
        val vr = findViewById<ViewPager2>(R.id.view_pager)
        vr.adapter = adapterVP
        val indicator = findViewById<DotsIndicator>(R.id.dots_indicator)
        indicator.attachTo(vr)
        val close = findViewById<ImageView>(R.id.finish)
        close.setOnClickListener { v: View? ->
            val intent = Intent(
                this@OnBoardingActivity,
                MainActivity::class.java
            )
            startActivity(intent)
            finish()
        }
    }

    @SuppressLint("ObsoleteSdkInt")
    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    fun setStatusBarGradiantOnBoardingActivity(activity: Activity) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            val window: Window = activity.window
            val background = ContextCompat.getDrawable(activity, R.color.background)
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)

            window.statusBarColor = ContextCompat.getColor(activity,android.R.color.transparent)
            window.setBackgroundDrawable(background)
            val indicator = findViewById<DotsIndicator>(R.id.dots_indicator)
        }
    }
}