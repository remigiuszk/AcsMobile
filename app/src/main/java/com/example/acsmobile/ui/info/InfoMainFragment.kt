package com.example.acsmobile.ui.info

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.acsmobile.R
import com.example.acsmobile.databinding.InfoMainFragmentBinding

class InfoMainFragment : Fragment() {

    companion object {
        fun newInstance() = InfoMainFragment()
    }

    private lateinit var viewModel: InfoMainViewModel
    private var _binding:InfoMainFragmentBinding? = null
    private val binding
        get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = InfoMainFragmentBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(InfoMainViewModel::class.java)
        binding.infoMainTextFirst = viewModel.infoMainFirstText
        binding.infoMainTextSecond = viewModel.infoMainSecondText
        // TODO: Use the ViewModel
    }

}