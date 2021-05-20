package com.example.acsmobile.ui.info.exams

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.acsmobile.R

class ExamsOverviewFragment : Fragment() {

    companion object {
        fun newInstance() = ExamsOverviewFragment()
    }

    private lateinit var viewModel: ExamsOverviewViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.exams_overview_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(ExamsOverviewViewModel::class.java)
        // TODO: Use the ViewModel
    }

}