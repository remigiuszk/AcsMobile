package com.example.acsmobile.ui.info.Sections

import androidx.lifecycle.ViewModel

class SectionRugbyViewModel : ViewModel() {
    private val _photoUrl = "https://acs.amw.gdynia.pl/wp-content/uploads/2020/04/plakt-rugby.jpg"
    val photoUrl : String
        get() = _photoUrl
}