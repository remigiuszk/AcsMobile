package com.example.acsmobile.ui.pools

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.acsmobile.R

class PoolsPricingFragment : Fragment() {

    companion object {
        fun newInstance() = PoolsPricingFragment()
    }

    private lateinit var viewModel: PoolsPricingViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.pools_pricing_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(PoolsPricingViewModel::class.java)
        // TODO: Use the ViewModel
    }

}