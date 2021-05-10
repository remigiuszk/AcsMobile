package com.example.acsmobile.helpers

import android.net.Uri
import android.widget.ImageView
import android.widget.MediaController
import android.widget.VideoView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide

class BindingHelper {
    companion object {
        @JvmStatic
        @BindingAdapter("image")
        fun loadImage(view: ImageView, url: String?) {
            if (!url.isNullOrEmpty()) {
                GlideApp.with(view.context)
                    .load(url)
                    .fitCenter()
                    .into(view)
            }
        }
    }
}