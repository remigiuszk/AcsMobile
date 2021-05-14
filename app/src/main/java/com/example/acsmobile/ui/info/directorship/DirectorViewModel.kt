package com.example.acsmobile.ui.info.directorship

import androidx.lifecycle.ViewModel

class DirectorViewModel : ViewModel() {
    private var _imageUrl : String = "https://static1.s-trojmiasto.pl/zdj/c/n/1/1887/0x960/1887778-Dariusz-Sapiejka.jpg"
    val imageUrl : String
        get() = _imageUrl

    private var _imageUrl2 : String = "https://acs.amw.gdynia.pl/wp-content/uploads/2020/04/Asseco_002_3360x2242_469x313.jpg"
    val imageUrl2 : String
        get() = _imageUrl2
}