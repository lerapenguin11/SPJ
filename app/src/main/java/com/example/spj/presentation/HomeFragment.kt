package com.example.spj.presentation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.spj.R
import com.example.spj.databinding.FragmentHomeBinding
import com.example.spj.utilits.replaceFragmentMainActivitySPJ

class HomeFragment : Fragment() {
    private var _binding : FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentHomeBinding.inflate(inflater, container, false)

        return binding.root
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