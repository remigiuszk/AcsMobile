package com.example.acsmobile.ui.info.Sections

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.acsmobile.R
import com.example.acsmobile.databinding.SectionClimbingFragmentBinding
import com.example.acsmobile.ui.info.InfoSectionsFragmentArgs

class SectionClimbingFragment : Fragment() {

    companion object {
        fun newInstance() = SectionClimbingFragment()
    }

    private lateinit var viewModel: SectionClimbingViewModel
    private lateinit var binding : SectionClimbingFragmentBinding
    private val args : InfoSectionsFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = SectionClimbingFragmentBinding.inflate(inflater, container, false)
        viewModel = ViewModelProvider(this).get(SectionClimbingViewModel::class.java)
        binding.photoUrl1 = viewModel.imageUrl1
        binding.photoUrl2 = viewModel.imageUrl2
        binding.photoUrl3 = viewModel.imageUrl3
        binding.photoUrl4 = viewModel.imageUrl4
        binding.photoUrl5 = viewModel.imageUrl5
        binding.photoUrl6 = viewModel.imageUrl6
        binding.climbingButton.setOnClickListener {
            findNavController().navigate(R.id.nav_news, bundleOf("categoryId" to args.categoryId))
        }
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        // TODO: Use the ViewModel
    }

}