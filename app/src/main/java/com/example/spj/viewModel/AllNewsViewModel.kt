package com.example.spj.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.spj.business.models.NewsModel
import com.example.spj.business.repos.AllNewsRepository

class AllNewsViewModel : ViewModel() {

    private val repository  = AllNewsRepository()

    fun getResultBasketball() : LiveData<MutableList<NewsModel>> {
        val mutableData = MutableLiveData<MutableList<NewsModel>>()
        repository.getBasketballListReading().observeForever {list ->
            mutableData.value = list
        }

        return mutableData
    }

    fun getResultFootball() : LiveData<MutableList<NewsModel>>{
        val mutableData = MutableLiveData<MutableList<NewsModel>>()
        repository.getFootballListReading().observeForever {list ->
            mutableData.value = list
        }

        return mutableData
    }

    fun getResultTennis() : LiveData<MutableList<NewsModel>>{
        val mutableData = MutableLiveData<MutableList<NewsModel>>()
        repository.getTennisListReading().observeForever {list ->
            mutableData.value = list
        }

        return mutableData
    }

    fun getResultBaseball() : LiveData<MutableList<NewsModel>>{
        val mutableData = MutableLiveData<MutableList<NewsModel>>()
        repository.getBaseballListReading().observeForever {list ->
            mutableData.value = list
        }

        return mutableData
    }
}