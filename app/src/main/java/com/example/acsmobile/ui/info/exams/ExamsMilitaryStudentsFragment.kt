package com.example.acsmobile.ui.info.exams

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.acsmobile.R
import com.example.acsmobile.databinding.ExamsMilitaryStudentsFragmentBinding

class ExamsMilitaryStudentsFragment : Fragment() {

    companion object {
        fun newInstance() = ExamsMilitaryStudentsFragment()
    }

    private lateinit var viewModel: ExamsMilitaryStudentsViewModel
    private lateinit var binding: ExamsMilitaryStudentsFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewModel = ViewModelProvider(this).get(ExamsMilitaryStudentsViewModel::class.java)
        binding = ExamsMilitaryStudentsFragmentBinding.inflate(inflater, container, false)
        binding.photoUrl1 = viewModel.photoUrl
        binding.photoUrl2 = viewModel.photoUrl2
        binding.photoUrl3 = viewModel.photoUrl3
        binding.photoUrl4 = viewModel.photoUrl4
        binding.photoUrl5 = viewModel.photoUrl5
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(ExamsMilitaryStudentsViewModel::class.java)
    }

}