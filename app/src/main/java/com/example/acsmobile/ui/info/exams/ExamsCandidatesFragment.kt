package com.example.acsmobile.ui.info.exams

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.acsmobile.R

class ExamsCandidatesFragment : Fragment() {

    companion object {
        fun newInstance() = ExamsCandidatesFragment()
    }

    private lateinit var viewModel: ExamsCandidatesViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.exams_candidates_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(ExamsCandidatesViewModel::class.java)
        // TODO: Use the ViewModel
    }

}