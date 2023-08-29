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
    private var checkBasketball = true
    private var checkFootball = false
    private var checkTennis = false
    private var checkBaseball = false

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
        setPageBasketball()
        observeDataBasketball(position)
        onClick()
    }

    private fun onClick() {
        binding.tvNavFootball.setOnClickListener {
            checkFootball = true
            checkBasketball = false
            checkTennis = false
            setFontExtraBold(binding.tvNavFootball)
            setFontMedium(binding.tvNavBasketball, binding.tvNavBaseball, binding.tvNavTennis)
            position = 0
            setPageFootball()
            observeDataFootball(position)
        }

        binding.tvNavBasketball.setOnClickListener {
            checkBasketball = true
            checkFootball = false
            checkTennis = false
            setFontExtraBold(binding.tvNavBasketball)
            setFontMedium(binding.tvNavBaseball, binding.tvNavTennis, binding.tvNavFootball)
            position = 0
            setPageBasketball()
            observeDataBasketball(position)
        }

        binding.tvNavTennis.setOnClickListener {
            checkTennis = true
            checkFootball = false
            checkBasketball = false
            setFontMedium(binding.tvNavBaseball, binding.tvNavBasketball, binding.tvNavFootball)
            setFontExtraBold(binding.tvNavTennis)
            setPageTennis()
            observeDataTennis(position)
        }

        binding.tvNavBaseball.setOnClickListener {
            checkBaseball = true
            checkFootball = false
            checkTennis = false
            checkBasketball = false
            setFontMedium(binding.tvNavTennis, binding.tvNavBasketball, binding.tvNavFootball)
            setFontExtraBold(binding.tvNavBaseball)
            setPageBaseball()
            observeDataBaseball(position)
        }
    }

    private fun observeDataBaseball(position: Int){
        allNewsViewModel.getResultBaseball().observe(viewLifecycleOwner, Observer {tennis ->
            binding.tvTitleTopNews.text = tennis.get(position).title
            binding.tvDescTopNews.text = tennis.get(position).descTop
            binding.tvTag1.text = tennis.get(position).tag
            binding.tvTag2.text = tennis.get(position).tag
            binding.tvNewsParagraph1.text = tennis.get(position).paragraph_1
            binding.tvNewsParagraph2.text = tennis.get(position).paragraph_2
            binding.tvNewsParagraph3.text = tennis.get(position).paragraph_3
        })
    }

    private fun setPageBaseball(){
        binding.rvPage.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        binding.rvPage.adapter = adapter

        allNewsViewModel.getResultBaseball().observe(viewLifecycleOwner, Observer {
            adapter.setItem(it)
        })
    }

    private fun observeDataTennis(position: Int){
        allNewsViewModel.getResultTennis().observe(viewLifecycleOwner, Observer {tennis ->
            binding.tvTitleTopNews.text = tennis.get(position).title
            binding.tvDescTopNews.text = tennis.get(position).descTop
            binding.tvTag1.text = tennis.get(position).tag
            binding.tvTag2.text = tennis.get(position).tag
            binding.tvNewsParagraph1.text = tennis.get(position).paragraph_1
            binding.tvNewsParagraph2.text = tennis.get(position).paragraph_2
            binding.tvNewsParagraph3.text = tennis.get(position).paragraph_3
        })
    }

    private fun setPageTennis(){
        binding.rvPage.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        binding.rvPage.adapter = adapter

        allNewsViewModel.getResultTennis().observe(viewLifecycleOwner, Observer {
            adapter.setItem(it)
        })
    }

    private fun observeDataFootball(position: Int) {
        allNewsViewModel.getResultFootball().observe(viewLifecycleOwner, Observer {football ->
            binding.tvTitleTopNews.text = football.get(position).title
            binding.tvDescTopNews.text = football.get(position).descTop
            binding.tvTag1.text = football.get(position).tag
            binding.tvTag2.text = football.get(position).tag
            binding.tvNewsParagraph1.text = football.get(position).paragraph_1
            binding.tvNewsParagraph2.text = football.get(position).paragraph_2
            binding.tvNewsParagraph3.text = football.get(position).paragraph_3
        })
    }

    private fun setPageFootball() {
        binding.rvPage.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        binding.rvPage.adapter = adapter

        allNewsViewModel.getResultFootball().observe(viewLifecycleOwner, Observer {
            adapter.setItem(it)
        })
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

    private fun setPageBasketball() {
        binding.rvPage.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        binding.rvPage.adapter = adapter

        allNewsViewModel.getResultBasketball().observe(viewLifecycleOwner, Observer {
            adapter.setItem(it)
        })
    }

    override fun pageList(quiz: NewsModel) {
        position = quiz.id
        if (checkFootball){
            observeDataFootball(position = position)
        }
        if (checkBasketball){
            observeDataBasketball(position = position)
        }
        if (checkTennis){
            observeDataTennis(position = position)
        }
        if (checkBaseball){
            observeDataBaseball(position = position)
        }
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