package com.example.acsmobile.ui.events

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.acsmobile.R

class EventsCategoriesFragment : Fragment() {

    companion object {
        fun newInstance() = EventsCategoriesFragment()
    }

    private lateinit var viewModel: EventsCategoriesViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.events_categories_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(EventsCategoriesViewModel::class.java)
        // TODO: Use the ViewModel
    }

}