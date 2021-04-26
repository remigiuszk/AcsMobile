package com.example.acsmobile.ui.objects

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.acsmobile.R

class ObjectsForTeamFragment : Fragment() {

    companion object {
        fun newInstance() = ObjectsForTeamFragment()
    }

    private lateinit var viewModel: ObjectsForTeamViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.objects_for_team_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(ObjectsForTeamViewModel::class.java)
        // TODO: Use the ViewModel
    }

}