package com.example.acsmobile.ui.objects

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
import com.example.acsmobile.databinding.ObjectsMainFragmentBinding
import com.example.acsmobile.helpers.BindingHelper
import com.example.acsmobile.ui.pools.PoolsMainViewModel

class ObjectsMainFragment : Fragment() {

    companion object {
        fun newInstance() = ObjectsMainFragment()
    }

    private lateinit var viewModel: ObjectsMainViewModel
    private lateinit var binding: ObjectsMainFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = ObjectsMainFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val recyclerView = view.findViewById<RecyclerView>(R.id.recyclerViewObjects)
        viewModel = ViewModelProvider(this).get(ObjectsMainViewModel::class.java)
        view.tag = "objects"
        recyclerView.adapter = PhotoGalleryAdapter(viewModel.imageList, view)
        recyclerView.layoutManager = LinearLayoutManager(this.context, LinearLayoutManager.HORIZONTAL, false)
        recyclerView.setHasFixedSize(true)
        val imageView = view.findViewById<ImageView>(R.id.objectsGalleryBigImage)
        BindingHelper.loadImage(imageView, viewModel.imageList.first())
    }

}