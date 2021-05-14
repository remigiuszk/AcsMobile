package com.example.acsmobile.ui.info.directorship

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import android.text.method.LinkMovementMethod
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.acsmobile.R
import com.example.acsmobile.databinding.DirectorFragmentBinding

class DirectorFragment : Fragment() {

    companion object {
        fun newInstance() = DirectorFragment()
    }

    private lateinit var viewModel: DirectorViewModel
    private lateinit var binding: DirectorFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DirectorFragmentBinding.inflate(inflater, container, false)
        viewModel = ViewModelProvider(this).get(DirectorViewModel::class.java)
        binding.imageUrl = viewModel.imageUrl
        binding.imageUrl2 = viewModel.imageUrl2
        binding.directorPhotoDescription.movementMethod = LinkMovementMethod.getInstance()
        binding.directorHyperlink.movementMethod = LinkMovementMethod.getInstance()
        return binding.root
    }
}