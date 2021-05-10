package com.example.acsmobile.ui.info.Sections

import androidx.lifecycle.ViewModel

class SectionFutsalViewModel : ViewModel() {

    private val _photoUrl = "https://acs.amw.gdynia.pl/wp-content/uploads/2020/04/futsal-768x432.jpg"
    val photoUrl : String
        get() = _photoUrl
}