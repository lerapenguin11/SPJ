package com.example.spj.presentation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.bumptech.glide.Glide
import com.example.spj.R
import com.example.spj.business.models.NewsModel
import com.example.spj.databinding.FragmentBaseballBinding
import com.example.spj.databinding.FragmentBasketballBinding
import com.example.spj.presentation.adapter.PageAdapter
import com.example.spj.presentation.adapter.listener.PageListener
import com.example.spj.utilits.replaceFragmentMainActivitySPJ
import com.example.spj.viewModel.AllNewsViewModel

class BaseballFragment : Fragment(), PageListener {
    private var _binding : FragmentBaseballBinding? = null
    private val binding get() = _binding!!
    private lateinit var allNewsViewModel : AllNewsViewModel
    private var position = 0
    private val adapter = PageAdapter(this)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentBaseballBinding.inflate(inflater, container, false)

        allNewsViewModel = ViewModelProvider(requireActivity()).get(AllNewsViewModel::class.java)

        return binding.root
    }

    override fun onResume() {
        super.onResume()
        setPageBaseball()
        observeDataBaseball(position)
        onClick()
    }

    private fun onClick() {
        binding.icArrow.setOnClickListener {
            replaceFragmentMainActivitySPJ(HomeFragment())
        }
    }

    private fun observeDataBaseball(position: Int) {
        allNewsViewModel.getResultBaseball().observe(viewLifecycleOwner, Observer {baseball ->
            binding.tvTitleTopNews.text = baseball.get(position).title
            binding.tvDescTopNews.text = baseball.get(position).descTop
            binding.tvTag1.text = baseball.get(position).tag
            binding.tvTag2.text = baseball.get(position).tag
            binding.tvNewsParagraph1.text = baseball.get(position).paragraph_1
            binding.tvNewsParagraph2.text = baseball.get(position).paragraph_2
            binding.tvNewsParagraph3.text = baseball.get(position).paragraph_3
            Glide.with(requireContext())
                .load(baseball.get(position).iconTop)
                .into(binding.icTopNews)
            Glide.with(requireContext())
                .load(baseball.get(position).iconParagraph)
                .override(160, 90)
                .into(binding.icNews2)
        })
    }

    private fun setPageBaseball() {
        binding.rvPage.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        binding.rvPage.adapter = adapter

        allNewsViewModel.getResultBaseball().observe(viewLifecycleOwner, Observer {
            adapter.setItem(it)
        })
    }

    override fun pageList(page: NewsModel) {
        position = page.id
        observeDataBaseball(position = position)
    }
}