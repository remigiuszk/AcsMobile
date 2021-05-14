package com.example.acsmobile.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.acsmobile.R
import com.example.acsmobile.databinding.RecyclerviewHistoricalLeaderBinding
import com.example.acsmobile.model.info.HistoricalLeaderModel
import java.util.*

class DirectorshipLeaders52RecyclerViewAdapter(
    private val leaders: List<HistoricalLeaderModel>
) : RecyclerView.Adapter<DirectorshipLeaders52RecyclerViewAdapter.HistoricalLeadersViewHolder>() {

    inner class HistoricalLeadersViewHolder(val binding: RecyclerviewHistoricalLeaderBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): DirectorshipLeaders52RecyclerViewAdapter.HistoricalLeadersViewHolder {
        return HistoricalLeadersViewHolder(
            DataBindingUtil.inflate(
                LayoutInflater.from(parent.context),
                R.layout.recyclerview_historical_leader,
                parent,
                false
            ))
    }

    override fun getItemCount(): Int {
        return leaders.size
    }

    override fun onBindViewHolder(holder: HistoricalLeadersViewHolder, position: Int) {
        holder.binding.leader = leaders[position]
    }

}