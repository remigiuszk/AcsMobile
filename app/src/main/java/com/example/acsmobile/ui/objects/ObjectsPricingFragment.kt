package com.example.acsmobile.ui.objects

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.acsmobile.R

class ObjectsPricingFragment : Fragment() {

    companion object {
        fun newInstance() = ObjectsPricingFragment()
    }

    private lateinit var viewModel: ObjectsPricingViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.objects_pricing_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(ObjectsPricingViewModel::class.java)
        // TODO: Use the ViewModel
    }

}