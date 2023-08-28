package com.example.spj.utilits

import androidx.fragment.app.Fragment
import com.example.spj.APP_MAIN_ACTIVITY_SPJ
import com.example.spj.R

fun replaceFragmentMainActivitySPJ(fragment: Fragment, check: Boolean = true) {
    if (check) {
        APP_MAIN_ACTIVITY_SPJ.supportFragmentManager.beginTransaction()
            .addToBackStack(null)
            .replace(
                R.id.main_layout,
                fragment
            ).commit()
    } else {
        APP_MAIN_ACTIVITY_SPJ.supportFragmentManager.beginTransaction()
            .replace(
                R.id.main_layout,
                fragment
            ).commit()
    }
}