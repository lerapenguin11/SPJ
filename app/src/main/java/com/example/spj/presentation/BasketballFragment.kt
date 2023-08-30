package com.example.spj.presentation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.spj.R
import com.example.spj.business.models.NewsModel
import com.example.spj.databinding.FragmentBasketballBinding
import com.example.spj.databinding.FragmentFootballBinding
import com.example.spj.presentation.adapter.PageAdapter
import com.example.spj.presentation.adapter.listener.PageListener
import com.example.spj.utilits.replaceFragmentMainActivitySPJ
import com.example.spj.viewModel.AllNewsViewModel

class BasketballFragment : Fragment(), PageListener {
    private var _binding : FragmentBasketballBinding? = null
    private val binding get() = _binding!!
    private lateinit var allNewsViewModel : AllNewsViewModel
    private var position = 0
    private val adapter = PageAdapter(this)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentBasketballBinding.inflate(inflater, container, false)

        allNewsViewModel = ViewModelProvider(requireActivity()).get(AllNewsViewModel::class.java)

        return binding.root
    }

    override fun onResume() {
        super.onResume()
        setPageBasketball()
        observeDataBasketball(position)
        onClick()
    }

    private fun onClick() {
        binding.icArrow.setOnClickListener {
            replaceFragmentMainActivitySPJ(HomeFragment())
        }
    }

    private fun observeDataBasketball(position: Int) {
        allNewsViewModel.getResultBasketball().observe(viewLifecycleOwner, Observer {football ->
            binding.tvTitleTopNews.text = football.get(position).title
            binding.tvDescTopNews.text = football.get(position).descTop
            binding.tvTag1.text = football.get(position).tag
            binding.tvTag2.text = football.get(position).tag
            binding.tvNewsParagraph1.text = football.get(position).paragraph_1
            binding.tvNewsParagraph2.text = football.get(position).paragraph_2
            binding.tvNewsParagraph3.text = football.get(position).paragraph_3
        })
    }

    private fun setPageBasketball() {
        binding.rvPage.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        binding.rvPage.adapter = adapter

        allNewsViewModel.getResultBasketball().observe(viewLifecycleOwner, Observer {
            adapter.setItem(it)
        })
    }

    override fun pageList(page: NewsModel) {
        position = page.id
        observeDataBasketball(position = position)
    }
}