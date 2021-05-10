package com.example.acsmobile.ui.info.Sections

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.example.acsmobile.R
import com.example.acsmobile.databinding.SectionTableTennisFragmentBinding
import com.example.acsmobile.ui.info.InfoSectionsFragmentArgs

class SectionTableTennisFragment : Fragment() {

    companion object {
        fun newInstance() = SectionTableTennisFragment()
    }

    private lateinit var viewModel: SectionTableTennisViewModel
    private lateinit var binding: SectionTableTennisFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = SectionTableTennisFragmentBinding.inflate(inflater, container, false)
        viewModel = ViewModelProvider(this).get(SectionTableTennisViewModel::class.java)
        binding.photoUrl = viewModel.imageUrl
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(SectionTableTennisViewModel::class.java)
        // TODO: Use the ViewModel
    }

}