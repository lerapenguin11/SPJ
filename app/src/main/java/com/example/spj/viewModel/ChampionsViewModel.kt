package com.example.spj.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.spj.business.models.ChampionsModel
import com.example.spj.business.repos.ChampionsRepository

class ChampionsViewModel : ViewModel() {

    private val repository = ChampionsRepository()

    fun getResultChampionsBasketball() : LiveData<MutableList<ChampionsModel>> {
        val mutableData = MutableLiveData<MutableList<ChampionsModel>>()
        repository.getChampionsBasketballListReading().observeForever {list ->
            mutableData.value = list
        }

        return mutableData
    }

    fun getResultChampionsFootball() : LiveData<MutableList<ChampionsModel>> {
        val mutableData = MutableLiveData<MutableList<ChampionsModel>>()
        repository.getChampionsFootballReading().observeForever {list ->
            mutableData.value = list
        }

        return mutableData
    }

    fun getResultChampionsTennis() : LiveData<MutableList<ChampionsModel>> {
        val mutableData = MutableLiveData<MutableList<ChampionsModel>>()
        repository.getChampionsTennisReading().observeForever {list ->
            mutableData.value = list
        }

        return mutableData
    }

    fun getResultChampionsBaseball() : LiveData<MutableList<ChampionsModel>> {
        val mutableData = MutableLiveData<MutableList<ChampionsModel>>()
        repository.getChampionsBaseballReading().observeForever {list ->
            mutableData.value = list
        }

        return mutableData
    }
}