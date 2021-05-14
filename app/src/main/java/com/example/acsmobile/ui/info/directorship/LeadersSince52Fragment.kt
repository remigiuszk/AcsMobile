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
import com.example.acsmobile.adapter.DirectorshipLeaders52RecyclerViewAdapter
import com.example.acsmobile.databinding.LeadersSince52FragmentBinding

class LeadersSince52Fragment : Fragment() {

    companion object {
        fun newInstance() = LeadersSince52Fragment()
    }

    private lateinit var viewModel: LeadersSince52ViewModel
    private lateinit var binding: LeadersSince52FragmentBinding
    private lateinit var recyclerView: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewModel = ViewModelProvider(this).get(LeadersSince52ViewModel::class.java)
        binding = LeadersSince52FragmentBinding.inflate(inflater, container, false)
        binding.imageUrl = viewModel.imageUrl
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        recyclerView = view.findViewById(R.id.recyclerViewLeaders52)
        recyclerView.adapter = DirectorshipLeaders52RecyclerViewAdapter(viewModel.leaders)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.setHasFixedSize(true)
    }

}