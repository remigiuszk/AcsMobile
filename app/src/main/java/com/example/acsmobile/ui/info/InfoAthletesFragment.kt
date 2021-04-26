package com.example.acsmobile.ui.info

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.acsmobile.R

class InfoAthletesFragment : Fragment() {

    companion object {
        fun newInstance() = InfoAthletesFragment()
    }

    private lateinit var viewModel: InfoAthletesViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.info_athletes_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(InfoAthletesViewModel::class.java)
        // TODO: Use the ViewModel
    }

}