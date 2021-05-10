package com.example.acsmobile.ui.info.Sections.basketsubfragments

import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.acsmobile.databinding.AzsAmwGdyniaFragmentBinding

class AzsAmwGdyniaFragment : Fragment() {

    companion object {
        fun newInstance() = AzsAmwGdyniaFragment()
    }

    private lateinit var viewModel: AzsAmwGdyniaViewModel
    private lateinit var binding: AzsAmwGdyniaFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewModel = ViewModelProvider(this).get(AzsAmwGdyniaViewModel::class.java)
        binding = AzsAmwGdyniaFragmentBinding.inflate(inflater, container, false)
        binding.azsHyperlink.movementMethod = LinkMovementMethod.getInstance()
        binding.photoUrl = viewModel.imageUrl
        return binding.root
    }

}