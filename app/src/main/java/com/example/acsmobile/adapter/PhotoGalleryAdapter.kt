package com.example.acsmobile.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.acsmobile.R
import com.example.acsmobile.databinding.RecyclerviewPoolsGalleryPhotoBinding
import com.example.acsmobile.helpers.BindingHelper

class PhotoGalleryAdapter(
    private val images: List<String>,
    private val view: View
) : RecyclerView.Adapter<PhotoGalleryAdapter.PoolsGalleryViewHolder>() {

    private lateinit var bigImageView: ImageView

    inner class PoolsGalleryViewHolder(
        var binding: RecyclerviewPoolsGalleryPhotoBinding
    ) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PoolsGalleryViewHolder {
        return PoolsGalleryViewHolder(
            DataBindingUtil.inflate(
                LayoutInflater.from(parent.context),
                R.layout.recyclerview_pools_gallery_photo,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: PoolsGalleryViewHolder, position: Int) {
        val imageView = holder.binding.poolsGalleryImageView
        BindingHelper.loadImage(imageView, images[holder.adapterPosition])
        imageView.isClickable = true
        imageView.isFocusable = true
        if (view.tag == "pools") {
            bigImageView = view.findViewById<ImageView>(R.id.poolsGalleryBigImage)
        } else if (view.tag == "objects") {
            bigImageView = view.findViewById<ImageView>(R.id.objectsGalleryBigImage)
        }
        imageView.setOnClickListener { BindingHelper.loadImage(bigImageView, images[position]) }
    }

    override fun getItemCount(): Int {
        return images.size
    }
}