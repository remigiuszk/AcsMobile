package com.example.acsmobile.ui.info

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.acsmobile.R

class InfoPostgraduateFragment : Fragment() {

    companion object {
        fun newInstance() = InfoPostgraduateFragment()
    }

    private lateinit var viewModel: InfoPostgraduateViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.info_postgraduate_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(InfoPostgraduateViewModel::class.java)
        // TODO: Use the ViewModel
    }

}