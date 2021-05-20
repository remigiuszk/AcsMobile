package com.example.acsmobile.ui.info.exams

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import android.text.method.LinkMovementMethod
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.acsmobile.R
import com.example.acsmobile.databinding.ExamMilitariesFragmentBinding

class ExamMilitariesFragment : Fragment() {

    companion object {
        fun newInstance() = ExamMilitariesFragment()
    }

    private lateinit var viewModel: ExamMilitariesViewModel
    private lateinit var binding: ExamMilitariesFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = ExamMilitariesFragmentBinding.inflate(inflater, container, false)
        binding.examMilitariesHyperlink.movementMethod = LinkMovementMethod.getInstance()
        return binding.root
    }

}