package com.example.spj.presentation

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatDelegate
import androidx.lifecycle.ViewModelProvider
import com.example.spj.R
import com.example.spj.databinding.FragmentHomeBinding
import com.example.spj.utilits.replaceFragmentMainActivitySPJ
import com.example.spj.viewModel.AllNewsViewModel
import com.example.spj.viewModel.ThemeViewModel
import com.example.spj.viewModel.ThemeViewModelFactory

class HomeFragment : Fragment() {
    private var _binding : FragmentHomeBinding? = null
    private val binding get() = _binding!!
    private lateinit var themeViewModel : ThemeViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentHomeBinding.inflate(inflater, container, false)

        themeViewModel = ViewModelProvider(this, ThemeViewModelFactory(requireContext().getSharedPreferences("MyPrefs", Context.MODE_PRIVATE))).get(
            ThemeViewModel::class.java
        )

        binding.switchCompat.isChecked = themeViewModel.isDarkThemeEnabled()

        binding.switchCompat.setOnCheckedChangeListener { _, isChecked ->
            themeViewModel.setDarkThemeEnabled(isChecked)
            updateTheme()
        }

        return binding.root
    }

    private fun updateTheme() {
        val isDarkThemeEnabled = themeViewModel.isDarkThemeEnabled()
        if (isDarkThemeEnabled) {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
        } else {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        }
    }

    override fun onResume() {
        super.onResume()
        binding.navAllNews.setOnClickListener {
            replaceFragmentMainActivitySPJ(AllNewsFragment())
        }

        binding.navFootball.setOnClickListener {
            replaceFragmentMainActivitySPJ(FootballFragment())
        }

        binding.navTennis.setOnClickListener {
            replaceFragmentMainActivitySPJ(TennisFragment())
        }

        binding.navBasketball.setOnClickListener {
            replaceFragmentMainActivitySPJ(BasketballFragment())
        }

        binding.navBaseball.setOnClickListener {
            replaceFragmentMainActivitySPJ(BaseballFragment())
        }

        binding.navChampions.setOnClickListener {
            replaceFragmentMainActivitySPJ(ChampionsFragment())
        }
    }
}