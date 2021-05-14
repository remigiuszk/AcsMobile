package com.example.acsmobile.ui.info

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.viewpager.widget.ViewPager
import com.example.acsmobile.R
import com.example.acsmobile.adapter.BasketballFragmentsPagerAdapter
import com.example.acsmobile.adapter.DirectorshipFragmentsPagerAdapter
import com.example.acsmobile.databinding.InfoDirectorshipFragmentBinding
import com.google.android.material.tabs.TabLayout

class InfoDirectorshipFragment : Fragment() {

    companion object {
        fun newInstance() = InfoDirectorshipFragment()
    }

    private lateinit var viewModel: InfoDirectorshipViewModel
    private lateinit var binding: InfoDirectorshipFragmentBinding
    private lateinit var directorshipFragmentsPagerAdapter:DirectorshipFragmentsPagerAdapter
    private lateinit var viewPager : ViewPager

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = InfoDirectorshipFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        viewModel = ViewModelProvider(this).get(InfoDirectorshipViewModel::class.java)
        directorshipFragmentsPagerAdapter = DirectorshipFragmentsPagerAdapter(childFragmentManager, viewModel.fragmentsList, viewModel.titleList)
        viewPager = view.findViewById(R.id.viewPagerDirectorship)
        viewPager.adapter = directorshipFragmentsPagerAdapter
        val tabLayout = view.findViewById<TabLayout>(R.id.tabLayoutDirectorship)
        tabLayout.setupWithViewPager(viewPager)
    }

}