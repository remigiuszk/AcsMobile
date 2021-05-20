package com.example.acsmobile.ui.info

import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TableRow
import android.widget.TextView
import androidx.core.view.children
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.acsmobile.databinding.InfoAthletesFragmentBinding
import com.google.android.material.textview.MaterialTextView

class InfoAthletesFragment : Fragment() {

    companion object {
        fun newInstance() = InfoAthletesFragment()
    }

    private lateinit var viewModel: InfoAthletesViewModel
    private lateinit var binding: InfoAthletesFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = InfoAthletesFragmentBinding.inflate(inflater, container, false)
        binding.tablelayout
        for (item in binding.tablelayout.children) {
            if (item is TableRow) {
                for (textView in item.children) {
                    if (textView is MaterialTextView) {
                        textView.movementMethod = LinkMovementMethod.getInstance()
                    }
                }
            }
        }
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(InfoAthletesViewModel::class.java)
        // TODO: Use the ViewModel
    }

}