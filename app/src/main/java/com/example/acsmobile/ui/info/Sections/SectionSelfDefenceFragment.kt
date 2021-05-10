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
import com.example.acsmobile.databinding.SectionSelfDefenceFragmentBinding
import com.example.acsmobile.ui.info.InfoSectionsFragmentArgs

class SectionSelfDefenceFragment : Fragment() {

    companion object {
        fun newInstance() = SectionSelfDefenceFragment()
    }

    private lateinit var viewModel: SectionSelfDefenceViewModel
    private lateinit var binding: SectionSelfDefenceFragmentBinding
    private val args: InfoSectionsFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = SectionSelfDefenceFragmentBinding.inflate(inflater, container, false)
        binding.selfdefenceButton.setOnClickListener {
            findNavController().navigate(R.id.nav_news, bundleOf("categoryId" to args.categoryId))
        }
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(SectionSelfDefenceViewModel::class.java)
        // TODO: Use the ViewModel
    }

}