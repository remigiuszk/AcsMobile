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
import com.example.acsmobile.databinding.SectionFutsalFragmentBinding
import com.example.acsmobile.ui.info.InfoSectionsFragmentArgs

class SectionFutsalFragment : Fragment() {

    companion object {
        fun newInstance() = SectionFutsalFragment()
    }

    private lateinit var viewModel: SectionFutsalViewModel
    private lateinit var binding:SectionFutsalFragmentBinding
    private val args: InfoSectionsFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = SectionFutsalFragmentBinding.inflate(inflater, container, false)
        viewModel = ViewModelProvider(this).get(SectionFutsalViewModel::class.java)
        binding.photoUrl = viewModel.photoUrl
        binding.futsalHyperlink1.movementMethod = LinkMovementMethod.getInstance()
        binding.futsalHyperlink2.movementMethod = LinkMovementMethod.getInstance()
        binding.futsalHyperlink3.movementMethod = LinkMovementMethod.getInstance()
        binding.futsalButton.setOnClickListener {
            findNavController().navigate(R.id.nav_news, bundleOf("categoryId" to args.categoryId))
        }
        return binding.root
    }

//    override fun onActivityCreated(savedInstanceState: Bundle?) {
//        super.onActivityCreated(savedInstanceState)
//        viewModel = ViewModelProvider(this).get(SectionFutsalViewModel::class.java)
//        // TODO: Use the ViewModel
//    }

}