package com.example.spj.business.repos

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.spj.business.models.ChampionsModel
import com.example.spj.business.models.Constants

class ChampionsRepository {

    fun getChampionsBasketballListReading() : LiveData<MutableList<ChampionsModel>> {
        val championsBasketballList = Constants.getChampionsBasketball()
        val mutableData = MutableLiveData<MutableList<ChampionsModel>>()
        val list = mutableListOf<ChampionsModel>()

        for (i in championsBasketballList){
            val countTop = i.countTop
            val name = i.name
            val flag = i.flag

            val listQuizModel = ChampionsModel(
                countTop = countTop, name = name, flag = flag
            )
            list.add(listQuizModel)
        }

        mutableData.value = list

        return mutableData
    }

    fun getChampionsFootballReading() : LiveData<MutableList<ChampionsModel>>{
        val championsBasketballList = Constants.getChampionsFootball()
        val mutableData = MutableLiveData<MutableList<ChampionsModel>>()
        val list = mutableListOf<ChampionsModel>()

        for (i in championsBasketballList){
            val countTop = i.countTop
            val name = i.name
            val flag = i.flag

            val listQuizModel = ChampionsModel(
                countTop = countTop, name = name, flag = flag
            )
            list.add(listQuizModel)
        }

        mutableData.value = list

        return mutableData
    }

    fun getChampionsTennisReading() : LiveData<MutableList<ChampionsModel>>{
        val championsBasketballList = Constants.getChampionsTennis()
        val mutableData = MutableLiveData<MutableList<ChampionsModel>>()
        val list = mutableListOf<ChampionsModel>()

        for (i in championsBasketballList){
            val countTop = i.countTop
            val name = i.name
            val flag = i.flag

            val listQuizModel = ChampionsModel(
                countTop = countTop, name = name, flag = flag
            )
            list.add(listQuizModel)
        }

        mutableData.value = list

        return mutableData
    }

    fun getChampionsBaseballReading() : LiveData<MutableList<ChampionsModel>>{
        val championsBasketballList = Constants.getChampionsBaseball()
        val mutableData = MutableLiveData<MutableList<ChampionsModel>>()
        val list = mutableListOf<ChampionsModel>()

        for (i in championsBasketballList){
            val countTop = i.countTop
            val name = i.name
            val flag = i.flag

            val listQuizModel = ChampionsModel(
                countTop = countTop, name = name, flag = flag
            )
            list.add(listQuizModel)
        }

        mutableData.value = list

        return mutableData
    }
}