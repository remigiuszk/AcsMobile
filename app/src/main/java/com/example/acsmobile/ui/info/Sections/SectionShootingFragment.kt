package com.example.acsmobile.ui.info.Sections

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import android.text.method.LinkMovementMethod
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.acsmobile.R
import com.example.acsmobile.databinding.SectionShootingFragmentBinding
import com.example.acsmobile.ui.info.InfoSectionsFragmentArgs

class SectionShootingFragment : Fragment() {

    companion object {
        fun newInstance() = SectionShootingFragment()
    }

    private lateinit var viewModel: SectionShootingViewModel
    private lateinit var binding:SectionShootingFragmentBinding
    private val args:InfoSectionsFragmentArgs by navArgs()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = SectionShootingFragmentBinding.inflate(inflater, container, false)
        binding.sectionShootingHyperlink.movementMethod = LinkMovementMethod.getInstance()
        binding.shootingButton.setOnClickListener {
            findNavController().navigate(R.id.nav_news, bundleOf("categoryId" to args.categoryId))
        }
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(SectionShootingViewModel::class.java)
        // TODO: Use the ViewModel
    }

}