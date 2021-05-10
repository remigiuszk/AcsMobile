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
import com.example.acsmobile.databinding.SectionRugbyFragmentBinding
import com.example.acsmobile.ui.info.InfoSectionsFragmentArgs

class SectionRugbyFragment : Fragment() {

    companion object {
        fun newInstance() = SectionRugbyFragment()
    }

    private lateinit var viewModel: SectionRugbyViewModel
    private lateinit var binding: SectionRugbyFragmentBinding
    private val args: InfoSectionsFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = SectionRugbyFragmentBinding.inflate(inflater, container, false)
        viewModel = ViewModelProvider(this).get(SectionRugbyViewModel::class.java)
        binding.photoUrl = viewModel.photoUrl
        binding.rugbyButton.setOnClickListener {
            findNavController().navigate(R.id.nav_news, bundleOf("categoryId" to args.categoryId))
        }
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(SectionRugbyViewModel::class.java)
        // TODO: Use the ViewModel
    }

}