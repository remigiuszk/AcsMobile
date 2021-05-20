package com.example.acsmobile.ui.info

import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.acsmobile.databinding.InfoClubsFragmentBinding

class InfoClubsFragment : Fragment() {

    companion object {
        fun newInstance() = InfoClubsFragment()
    }

    private lateinit var viewModel: InfoClubsViewModel
    private lateinit var binding: InfoClubsFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = InfoClubsFragmentBinding.inflate(inflater, container, false)
        binding.infoClubsHyperlink.movementMethod = LinkMovementMethod.getInstance()
        binding.infoClubsFlotaHyperlink.movementMethod = LinkMovementMethod.getInstance()
        binding.infoClubsIskraHyperlink.movementMethod = LinkMovementMethod.getInstance()
        viewModel = ViewModelProvider(this).get(InfoClubsViewModel::class.java)
        binding.photoUrl = viewModel.photoUrl
        binding.photoUrlFlota = viewModel.photoUrlFlota
        binding.photoUrlIskra = viewModel.photoUrlIskra
        return binding.root
    }

}