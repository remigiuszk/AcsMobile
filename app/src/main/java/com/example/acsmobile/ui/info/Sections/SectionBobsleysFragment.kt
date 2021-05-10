package com.example.acsmobile.ui.info.Sections

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.acsmobile.R
import com.example.acsmobile.databinding.SectionBobsleysFragmentBinding
import com.example.acsmobile.ui.info.InfoSectionsFragmentArgs

class SectionBobsleysFragment : Fragment() {

    companion object {
        fun newInstance() = SectionBobsleysFragment()
    }

    private lateinit var viewModel: SectionBobsleysViewModel
    private lateinit var binding: SectionBobsleysFragmentBinding
    private val args: InfoSectionsFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = SectionBobsleysFragmentBinding.inflate(inflater, container, false)
        viewModel = ViewModelProvider(this).get(SectionBobsleysViewModel::class.java)
        binding.bobslejeButton.setOnClickListener {
            findNavController().navigate(R.id.nav_news, bundleOf("categoryId" to args.categoryId))
        }
        binding.photoUrl = viewModel.imageUrl
        return binding.root
    }
//    }

}