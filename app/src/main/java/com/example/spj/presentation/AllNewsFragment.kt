package com.example.spj.presentation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.spj.business.models.NewsModel
import com.example.spj.databinding.FragmentAllNewsBinding
import com.example.spj.presentation.adapter.PageAdapter
import com.example.spj.presentation.adapter.listener.PageListener
import com.example.spj.viewModel.AllNewsViewModel

class AllNewsFragment : Fragment(), PageListener {
    private var _binding : FragmentAllNewsBinding? = null
    private val binding get() = _binding!!
    private lateinit var allNewsViewModel : AllNewsViewModel
    private var position = 0

    private val adapter = PageAdapter(this)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentAllNewsBinding.inflate(inflater, container, false)

        allNewsViewModel = ViewModelProvider(requireActivity()).get(AllNewsViewModel::class.java)

        return binding.root
    }

    override fun onResume() {
        super.onResume()
        setPage()
        observeDataBasketball(position)
    }

    private fun observeDataBasketball(position : Int) {
        allNewsViewModel.getResultBasketball().observe(viewLifecycleOwner, Observer {basketball ->
            binding.tvTitleTopNews.text = basketball.get(position).title
            binding.tvDescTopNews.text = basketball.get(position).descTop
            binding.tvTag1.text = basketball.get(position).tag
            binding.tvTag2.text = basketball.get(position).tag
            binding.tvNewsParagraph1.text = basketball.get(position).paragraph_1
            binding.tvNewsParagraph2.text = basketball.get(position).paragraph_2
            binding.tvNewsParagraph3.text = basketball.get(position).paragraph_3
        })
    }

    private fun setPage() {
        binding.rvPage.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        binding.rvPage.adapter = adapter

        allNewsViewModel.getResultBasketball().observe(viewLifecycleOwner, Observer {
            adapter.setItem(it)
        })
    }

    override fun pageList(quiz: NewsModel) {
        position = quiz.id
        observeDataBasketball(position = position)
    }
}