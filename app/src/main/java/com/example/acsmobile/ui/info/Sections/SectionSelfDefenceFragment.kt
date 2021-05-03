package com.example.acsmobile.ui.info.Sections

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.acsmobile.R

class SectionSelfDefenceFragment : Fragment() {

    companion object {
        fun newInstance() = SectionSelfDefenceFragment()
    }

    private lateinit var viewModel: SectionSelfDefenceViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.section_self_defence_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(SectionSelfDefenceViewModel::class.java)
        // TODO: Use the ViewModel
    }

}