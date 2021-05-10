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
import com.example.acsmobile.databinding.SectionWeightliftingFragmentBinding
import com.example.acsmobile.ui.info.InfoSectionsFragmentArgs

class SectionWeightliftingFragment : Fragment() {

    companion object {
        fun newInstance() = SectionWeightliftingFragment()
    }

    private lateinit var viewModel: SectionWeightliftingViewModel
    private lateinit var binding: SectionWeightliftingFragmentBinding
    private val args: InfoSectionsFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = SectionWeightliftingFragmentBinding.inflate(inflater, container, false)
        viewModel = ViewModelProvider(this).get(SectionWeightliftingViewModel::class.java)
        binding.photoUrl = viewModel.photoUrl
        binding.weightliftingButton.setOnClickListener {
            findNavController().navigate(R.id.nav_news, bundleOf("categoryId" to args.categoryId))
        }
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(SectionWeightliftingViewModel::class.java)
        // TODO: Use the ViewModel
    }

}