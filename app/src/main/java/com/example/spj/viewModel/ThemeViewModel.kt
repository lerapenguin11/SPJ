package com.example.spj.viewModel

import android.content.SharedPreferences
import androidx.lifecycle.ViewModel

class ThemeViewModel (private val sharedPreferences: SharedPreferences) : ViewModel() {
    companion object {
        private const val DARK_THEME_ENABLED_KEY = "dark_theme_enabled"
    }

    fun isDarkThemeEnabled(): Boolean {
        return sharedPreferences.getBoolean(DARK_THEME_ENABLED_KEY, false)
    }

    fun setDarkThemeEnabled(enabled: Boolean) {
        sharedPreferences.edit().putBoolean(DARK_THEME_ENABLED_KEY, enabled).apply()
    }
}