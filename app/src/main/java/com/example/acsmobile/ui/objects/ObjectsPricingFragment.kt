package com.example.acsmobile.ui.objects

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.acsmobile.databinding.ObjectsPricingFragmentBinding

class ObjectsPricingFragment : Fragment() {

    companion object {
        fun newInstance() = ObjectsPricingFragment()
    }

    private lateinit var viewModel: ObjectsPricingViewModel
    private lateinit var binding: ObjectsPricingFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewModel = ViewModelProvider(this).get(ObjectsPricingViewModel::class.java)
        binding = ObjectsPricingFragmentBinding.inflate(inflater, container, false)
        binding.photoUrl = viewModel.photoUrl
        binding.photoUrl2 = viewModel.photoUrl2
        return binding.root
    }

}