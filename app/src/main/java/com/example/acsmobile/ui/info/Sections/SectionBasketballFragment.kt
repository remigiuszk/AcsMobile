package com.example.acsmobile.ui.info.Sections

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import androidx.viewpager.widget.ViewPager
import com.example.acsmobile.R
import com.example.acsmobile.adapter.BasketballFragmentsPagerAdapter
import com.example.acsmobile.databinding.SectionBasketballFragmentBinding
import com.example.acsmobile.ui.info.InfoSectionsFragmentArgs
import com.google.android.material.tabs.TabLayout

class SectionBasketballFragment : Fragment() {

    companion object {
        fun newInstance() = SectionBasketballFragment()
    }

    private lateinit var viewModel: SectionBasketballViewModel
    private lateinit var basketballFragmentsPagerAdapter: BasketballFragmentsPagerAdapter
    private lateinit var viewPager : ViewPager
    private lateinit var binding : SectionBasketballFragmentBinding
    private val args:InfoSectionsFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = SectionBasketballFragmentBinding.inflate(inflater, container, false)
        binding.basketButton.setOnClickListener {
            findNavController().navigate(R.id.nav_news, bundleOf("categoryId" to args.categoryId))
        }
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        viewModel = ViewModelProvider(this).get(SectionBasketballViewModel::class.java)
        basketballFragmentsPagerAdapter = BasketballFragmentsPagerAdapter(childFragmentManager, viewModel.fragmentsList, viewModel.titleList)
        viewPager = view.findViewById(R.id.pager)
        viewPager.adapter = basketballFragmentsPagerAdapter
        val tabLayout = view.findViewById<TabLayout>(R.id.tab_layout)
        tabLayout.setupWithViewPager(viewPager)
    }

}