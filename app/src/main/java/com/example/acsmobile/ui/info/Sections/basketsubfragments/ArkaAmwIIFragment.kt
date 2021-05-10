package com.example.acsmobile.ui.info.Sections.basketsubfragments

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import android.text.method.LinkMovementMethod
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.acsmobile.R
import com.example.acsmobile.databinding.ArkaAmwIIFragmentBinding

class ArkaAmwIIFragment : Fragment() {

    companion object {
        fun newInstance() = ArkaAmwIIFragment()
    }

    private lateinit var viewModel: ArkaAmwIIViewModel
    private lateinit var binding: ArkaAmwIIFragmentBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = ArkaAmwIIFragmentBinding.inflate(inflater, container, false)
        viewModel = ViewModelProvider(this).get(ArkaAmwIIViewModel::class.java)
        binding.photoUrl = viewModel.imageUrl
        binding.photoUrl2 = viewModel.imageUrl2
        binding.basketHyperlink.movementMethod = LinkMovementMethod.getInstance()
        return binding.root
    }


}