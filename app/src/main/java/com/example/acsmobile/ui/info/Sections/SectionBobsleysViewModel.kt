package com.example.acsmobile.ui.info.Sections

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.bumptech.glide.Glide
import com.example.acsmobile.model.news.PostModel

class SectionBobsleysViewModel() : ViewModel() {

    private val _imageUrl = "https://amw.gdynia.pl/media/k2/items/cache/4eed737d2ff3908ce862f76a0c52416f_XL.jpg"
    val imageUrl : String
        get() = _imageUrl

}