package com.example.acsmobile.ui.info.directorship

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.acsmobile.R
import com.example.acsmobile.adapter.DirectorshipLeadersRecyclerViewAdapter

class LeadersFragment : Fragment() {

    companion object {
        fun newInstance() = LeadersFragment()
    }

    private lateinit var viewModel: LeadersViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.leaders_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        viewModel = ViewModelProvider(this).get(LeadersViewModel::class.java)
        val recyclerView = view.findViewById<RecyclerView>(R.id.recyclerViewLeaders)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = DirectorshipLeadersRecyclerViewAdapter(viewModel.teamMemberList)
    }


}