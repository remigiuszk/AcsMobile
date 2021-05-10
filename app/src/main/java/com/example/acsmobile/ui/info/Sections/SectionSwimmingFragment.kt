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
import com.example.acsmobile.databinding.SectionSwimmingFragmentBinding
import com.example.acsmobile.ui.info.InfoSectionsFragmentArgs

class SectionSwimmingFragment : Fragment() {

    companion object {
        fun newInstance() = SectionSwimmingFragment()
    }

    private lateinit var viewModel: SectionSwimmingViewModel
    private lateinit var binding: SectionSwimmingFragmentBinding
    private val args:InfoSectionsFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = SectionSwimmingFragmentBinding.inflate(inflater, container, false)
        viewModel = ViewModelProvider(this).get(SectionSwimmingViewModel::class.java)
        binding.photoUrl = viewModel.photoUrl
        binding.photoUrl2 = viewModel.photoUrl2
        binding.photoUrl3 = viewModel.photoUrl3
        binding.swimmingButton.setOnClickListener {
            findNavController().navigate(R.id.nav_news, bundleOf("categoryId" to args.categoryId))
        }
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(SectionSwimmingViewModel::class.java)
        // TODO: Use the ViewModel
    }

}