package com.example.acsmobile.ui.info.Sections

import androidx.lifecycle.ViewModel

class SectionVolleyballViewModel : ViewModel() {
    private val _photoUrl = "https://acs.amw.gdynia.pl/wp-content/uploads/2020/06/072-768x512.jpg"
    val photoUrl : String
        get() = _photoUrl
}