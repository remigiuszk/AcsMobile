package com.example.acsmobile.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.acsmobile.R
import com.example.acsmobile.databinding.RecyclerviewLeaderBinding
import com.example.acsmobile.model.info.TeamMemberModel

class DirectorshipLeadersRecyclerViewAdapter(
    private val teamMembers: ArrayList<TeamMemberModel>
) : RecyclerView.Adapter<DirectorshipLeadersRecyclerViewAdapter.LeadersViewHolder>() {

    inner class LeadersViewHolder(val binding: RecyclerviewLeaderBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LeadersViewHolder {
        return LeadersViewHolder(
            DataBindingUtil.inflate(
                LayoutInflater.from(parent.context),
                R.layout.recyclerview_leader,
                parent,
                false
            ))
    }

    override fun onBindViewHolder(holder: LeadersViewHolder, position: Int) {
        holder.binding.leader = teamMembers[position]
    }

    override fun getItemCount(): Int = teamMembers.size

}