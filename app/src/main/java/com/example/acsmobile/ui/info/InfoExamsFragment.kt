package com.example.acsmobile.ui.info

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.viewpager.widget.ViewPager
import com.example.acsmobile.R
import com.example.acsmobile.adapter.ExamsFragmentsPagerAdapter
import com.google.android.material.tabs.TabLayout

class InfoExamsFragment : Fragment() {

    companion object {
        fun newInstance() = InfoExamsFragment()
    }

    private lateinit var viewModel: InfoExamsViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.info_exams_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        viewModel = ViewModelProvider(this).get(InfoExamsViewModel::class.java)
        val viewPager = view.findViewById<ViewPager>(R.id.viewPagerExams)
        viewPager.adapter = ExamsFragmentsPagerAdapter(childFragmentManager, viewModel.fragmentsList, viewModel.titleList)
        val tabLayout = view.findViewById<TabLayout>(R.id.tabLayoutExams)
        tabLayout.setupWithViewPager(viewPager)
    }

}