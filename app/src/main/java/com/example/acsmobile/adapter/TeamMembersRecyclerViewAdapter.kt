package com.example.acsmobile.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.acsmobile.R
import com.example.acsmobile.databinding.RecyclerviewTeamMemberBinding
import com.example.acsmobile.model.info.TeamMemberModel

class TeamMembersRecyclerViewAdapter(
    private val members: ArrayList<TeamMemberModel>
) : RecyclerView.Adapter<TeamMembersRecyclerViewAdapter.TeamMembersViewHolder>() {

    inner class TeamMembersViewHolder(val binding: RecyclerviewTeamMemberBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TeamMembersViewHolder {
        return TeamMembersViewHolder(
            DataBindingUtil.inflate(
                LayoutInflater.from(parent.context),
                R.layout.recyclerview_team_member,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: TeamMembersViewHolder, position: Int) {
        holder.binding.teamMember = members[position]
    }

    override fun getItemCount(): Int = members.size
}