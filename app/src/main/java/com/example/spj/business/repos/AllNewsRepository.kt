package com.example.spj.business.repos

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.spj.business.models.Constants
import com.example.spj.business.models.NewsModel

class AllNewsRepository {

    fun getBasketballListReading() : LiveData<MutableList<NewsModel>> {
        val basketballList = Constants.getBasketball()
        val mutableData = MutableLiveData<MutableList<NewsModel>>()
        val list = mutableListOf<NewsModel>()

        for (i in basketballList){
            val id = i.id
            val iconTop = i.iconTop
            val title = i.title
            val descTop = i.descTop
            val tag = i.tag
            val paragraph_1 = i.paragraph_1
            val paragraph_2 = i.paragraph_2
            val paragraph_3 = i.paragraph_3
            val iconParagraph = i.iconParagraph
            val page = i.page

            val listQuizModel = NewsModel(
               id = id, iconTop = iconTop, title = title,
                descTop = descTop, tag = tag, paragraph_1 = paragraph_1,
                paragraph_2 = paragraph_2, paragraph_3 = paragraph_3,
                iconParagraph = iconParagraph, page = page
            )
            list.add(listQuizModel)
        }

        mutableData.value = list

        return mutableData
    }
}