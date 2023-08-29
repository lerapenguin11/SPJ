package com.example.spj.presentation.adapter

import android.annotation.SuppressLint
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.example.spj.R
import com.example.spj.business.models.NewsModel
import com.example.spj.presentation.adapter.listener.PageListener

class PageAdapter(val listener : PageListener) : RecyclerView.Adapter<PageAdapter.PageViewHolder>() {

    private val pageList = mutableListOf<NewsModel>()
    private var selectedItem = 0

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PageViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_page, parent, false)

        return PageViewHolder(view)
    }

    override fun getItemCount(): Int = pageList.size

    @SuppressLint("NotifyDataSetChanged")
    override fun onBindViewHolder(holder: PageViewHolder, @SuppressLint("RecyclerView") position: Int) {
        val page : NewsModel = pageList[position]

        holder.pageNumber.text = page.page.toString()

        if (selectedItem == page.id) {
            holder.itemView.setBackgroundResource(R.drawable.bg_page_click)
            holder.pageNumber.setTextColor(Color.WHITE)
        } else {
            holder.page.setBackgroundResource(R.drawable.bg_page)
            holder.pageNumber.setTextColor(Color.BLACK)
        }

        holder.itemView.setOnClickListener {
            selectedItem = position
            selectedItem = page.id
            notifyDataSetChanged()
            listener.pageList(page)
        }
    }

    @SuppressLint("NotifyDataSetChanged")
    fun setItem(resultPageList : List<NewsModel>){
        this.pageList.clear()
        this.pageList.addAll(resultPageList)
        notifyDataSetChanged()
    }

    class PageViewHolder(view : View) : RecyclerView.ViewHolder(view) {
        val pageNumber : TextView = view.findViewById(R.id.tv_number_page)
        val page : ConstraintLayout = view.findViewById(R.id.page)
    }
}