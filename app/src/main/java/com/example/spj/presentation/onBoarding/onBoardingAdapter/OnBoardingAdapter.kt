package com.example.spj.presentation.onBoarding.onBoardingAdapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

class OnBoardingAdapter (arrL : ArrayList<Fragment>, manager : FragmentManager, lifecycle : Lifecycle)
    : FragmentStateAdapter(manager, lifecycle) {

    private val fragmentListOnBoarding = arrL

    override fun getItemCount(): Int = fragmentListOnBoarding.size

    override fun createFragment(position: Int): Fragment = fragmentListOnBoarding[position]
}