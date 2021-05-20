package com.example.acsmobile.ui.pools

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.acsmobile.R
import com.example.acsmobile.adapter.PhotoGalleryAdapter
import com.example.acsmobile.databinding.PoolsMainFragmentBinding
import com.example.acsmobile.helpers.BindingHelper

class PoolsMainFragment : Fragment() {

    companion object {
        fun newInstance() = PoolsMainFragment()
    }

    private lateinit var viewModel: PoolsMainViewModel
    private lateinit var binding: PoolsMainFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = PoolsMainFragmentBinding.inflate(inflater, container, false)
        viewModel = ViewModelProvider(this).get(PoolsMainViewModel::class.java)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val recyclerView = view.findViewById<RecyclerView>(R.id.recyclerViewPools)
        viewModel = ViewModelProvider(this).get(PoolsMainViewModel::class.java)
        view.tag = "pools"
        recyclerView.adapter = PhotoGalleryAdapter(viewModel.imageList, view)
        recyclerView.layoutManager = LinearLayoutManager(this.context, LinearLayoutManager.HORIZONTAL, false)
        recyclerView.setHasFixedSize(true)
        val imageView = view.findViewById<ImageView>(R.id.poolsGalleryBigImage)
        BindingHelper.loadImage(imageView, viewModel.imageList.first())
    }

}