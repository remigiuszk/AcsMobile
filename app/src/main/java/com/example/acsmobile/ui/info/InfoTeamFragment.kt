package com.example.acsmobile.ui.info

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.acsmobile.R
import com.example.acsmobile.adapter.TeamMembersRecyclerViewAdapter

class InfoTeamFragment : Fragment() {

    companion object {
        fun newInstance() = InfoTeamFragment()
    }

    private lateinit var viewModel: InfoTeamViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.info_team_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        viewModel = ViewModelProvider(this).get(InfoTeamViewModel::class.java)
        val recyclerView = view.findViewById<RecyclerView>(R.id.recyclerViewTeam)
        recyclerView.adapter = TeamMembersRecyclerViewAdapter(viewModel.membersList)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.setHasFixedSize(true)
    }

}