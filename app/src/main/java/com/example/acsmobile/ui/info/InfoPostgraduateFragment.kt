package com.example.acsmobile.ui.info

import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.acsmobile.R
import com.example.acsmobile.databinding.InfoPostgraduateFragmentBinding

class InfoPostgraduateFragment : Fragment() {

    companion object {
        fun newInstance() = InfoPostgraduateFragment()
    }

    private lateinit var viewModel: InfoPostgraduateViewModel
    private lateinit var binding: InfoPostgraduateFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = InfoPostgraduateFragmentBinding.inflate(inflater, container, false)
        binding.infoPostgraduateHyperlink.movementMethod = LinkMovementMethod.getInstance()
        return binding.root
    }

}