package com.example.acsmobile.ui.info.Sections.basketsubfragments

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.acsmobile.R
import com.example.acsmobile.databinding.SekcjaKobietFragmentBinding

class SekcjaKobietFragment : Fragment() {

    companion object {
        fun newInstance() = SekcjaKobietFragment()
    }

    private lateinit var viewModel: SekcjaKobietViewModel
    private lateinit var binding: SekcjaKobietFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewModel = ViewModelProvider(this).get(SekcjaKobietViewModel::class.java)
        binding = SekcjaKobietFragmentBinding.inflate(inflater, container, false)
        binding.photoUrl = viewModel.imageUrl
        binding.photoUrl2 = viewModel.imageUrl2
        return binding.root
    }


}