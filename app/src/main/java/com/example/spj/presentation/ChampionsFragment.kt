package com.example.spj.presentation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.content.res.ResourcesCompat
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.spj.R
import com.example.spj.databinding.FragmentChampionsBinding
import com.example.spj.presentation.adapter.ChampionsAdapter
import com.example.spj.utilits.replaceFragmentMainActivitySPJ
import com.example.spj.viewModel.ChampionsViewModel

class ChampionsFragment : Fragment(){
    private var _binding : FragmentChampionsBinding? = null
    private val binding get() = _binding!!
    private val adapter = ChampionsAdapter()
    private lateinit var championsViewModel: ChampionsViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentChampionsBinding.inflate(inflater, container, false)

        championsViewModel = ViewModelProvider(requireActivity()).get(ChampionsViewModel::class.java)

        return binding.root
    }

    override fun onResume() {
        super.onResume()
        setAdapterChampionsBasketball()
        onClick()
    }

    private fun onClick() {
        binding.tvNavFootball.setOnClickListener {
            setAdapterChampionsFootball()
        }

        binding.tvNavTennis.setOnClickListener {
            setAdapterChampionsTennis()
        }

        binding.tvNavBaseball.setOnClickListener {
            setAdapterChampionsBaseball()
        }

        binding.tvNavBasketball.setOnClickListener {
            setFontMedium(binding.tvNavTennis, binding.tvNavFootball, binding.tvNavBaseball)
            setFontExtraBold(binding.tvNavBasketball)
            setAdapterChampionsBasketball()
        }

        binding.icArrow.setOnClickListener {
            replaceFragmentMainActivitySPJ(HomeFragment())
        }
    }

    private fun setAdapterChampionsBaseball() {
        setFontMedium(binding.tvNavFootball, binding.tvNavBasketball, binding.tvNavTennis)
        setFontExtraBold(binding.tvNavBaseball)

        championsViewModel.getResultChampionsBaseball().observe(viewLifecycleOwner, Observer {
            adapter.setItem(it)
        })
    }

    private fun setAdapterChampionsTennis() {
        setFontMedium(binding.tvNavFootball, binding.tvNavBasketball, binding.tvNavBaseball)
        setFontExtraBold(binding.tvNavTennis)

        championsViewModel.getResultChampionsTennis().observe(viewLifecycleOwner, Observer {
            adapter.setItem(it)
        })
    }

    private fun setAdapterChampionsFootball() {
        setFontMedium(binding.tvNavTennis, binding.tvNavBasketball, binding.tvNavBaseball)
        setFontExtraBold(binding.tvNavFootball)

        championsViewModel.getResultChampionsFootball().observe(viewLifecycleOwner, Observer {
            adapter.setItem(it)
        })
    }

    private fun setAdapterChampionsBasketball() {
        binding.rvChampions.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        binding.rvChampions.adapter = adapter

        championsViewModel.getResultChampionsBasketball().observe(viewLifecycleOwner, Observer {
            adapter.setItem(it)
        })
    }

    private fun setFontMedium(textView: TextView, textView1: TextView, textView2: TextView){
        val typeface = ResourcesCompat.getFont(requireContext(), R.font.inter_medium)
        textView.typeface = typeface
        textView1.typeface = typeface
        textView2.typeface = typeface
    }

    private fun setFontExtraBold(textView: TextView){
        val typeface = ResourcesCompat.getFont(requireContext(), R.font.inter_extrabold)
        textView.typeface = typeface
    }
}