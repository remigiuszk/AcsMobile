package com.example.acsmobile.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.acsmobile.model.news.NewsResponseModel
import com.example.acsmobile.R
import com.example.acsmobile.databinding.RecyclerviewPostBinding

class NewsRecyclerViewAdapter(
    private val news : NewsResponseModel
): RecyclerView.Adapter<NewsRecyclerViewAdapter.NewsViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsViewHolder  =
        NewsViewHolder(
            DataBindingUtil.inflate(
                LayoutInflater.from(parent.context),
                R.layout.recyclerview_post,
                parent,
                false
            )
        )


    override fun onBindViewHolder(holder: NewsViewHolder, position: Int) {
        holder.recyclerViewPostBinding.post = news[position]
    }

    override fun getItemCount(): Int {
        return news.size
    }


    inner class NewsViewHolder(
        val recyclerViewPostBinding: RecyclerviewPostBinding
    ) : RecyclerView.ViewHolder(recyclerViewPostBinding.root)

}