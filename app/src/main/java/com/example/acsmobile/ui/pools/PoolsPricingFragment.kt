package com.example.acsmobile.ui.pools

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.acsmobile.R
import com.example.acsmobile.databinding.PoolsPricingFragmentBinding

class PoolsPricingFragment : Fragment() {

    companion object {
        fun newInstance() = PoolsPricingFragment()
    }

    private lateinit var viewModel: PoolsPricingViewModel
    private lateinit var binding: PoolsPricingFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = PoolsPricingFragmentBinding.inflate(inflater, container, false)
        viewModel = ViewModelProvider(this).get(PoolsPricingViewModel::class.java)
        binding.photoUrl = viewModel.photoUrl
        binding.photoUrl2 = viewModel.photoUrl2
        return binding.root
    }

}