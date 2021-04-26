package com.example.acsmobile.ui.classes

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.acsmobile.R

class ClassesMainFragment : Fragment() {

    companion object {
        fun newInstance() = ClassesMainFragment()
    }

    private lateinit var viewModel: ClassesMainViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.classes_main_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(ClassesMainViewModel::class.java)
        // TODO: Use the ViewModel
    }

}