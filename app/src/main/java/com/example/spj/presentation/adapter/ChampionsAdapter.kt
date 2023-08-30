package com.example.spj.presentation.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.spj.R
import com.example.spj.business.models.ChampionsModel
import com.example.spj.business.models.NewsModel

class ChampionsAdapter : RecyclerView.Adapter<ChampionsAdapter.ChampionsViewHolder>(){

    private val championsList = mutableListOf<ChampionsModel>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChampionsViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_champions, parent, false)

        return ChampionsViewHolder(view)
    }

    override fun getItemCount(): Int = championsList.size

    override fun onBindViewHolder(holder: ChampionsViewHolder, position: Int) {
        val champions : ChampionsModel = championsList[position]

        holder.countTop.text = champions.countTop
        holder.name.text = champions.name
        Glide.with(holder.itemView)
            .load(champions.flag)
            .override(92, 92)
            .into(holder.flag)
    }

    @SuppressLint("NotifyDataSetChanged")
    fun setItem(resultChampionsList : List<ChampionsModel>){
        this.championsList.clear()
        this.championsList.addAll(resultChampionsList)
        notifyDataSetChanged()
    }

    class ChampionsViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val countTop : TextView = view.findViewById(R.id.tv_top)
        val name : TextView = view.findViewById(R.id.tv_name)
        val flag : ImageView = view.findViewById(R.id.ic_flag_champions)
    }
}