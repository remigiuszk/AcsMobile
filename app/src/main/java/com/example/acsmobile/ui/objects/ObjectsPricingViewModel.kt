package com.example.acsmobile.ui.objects

import androidx.lifecycle.ViewModel

class ObjectsPricingViewModel : ViewModel() {
    private var _photoUrl: String = "https://acs.amw.gdynia.pl/wp-content/uploads/2019/12/cennik-cardio-768x523.png"
    val photoUrl: String
        get() = _photoUrl

    private var _photoUrl2: String = "https://acs.amw.gdynia.pl/wp-content/uploads/2019/12/cena-najmu-obiekt%C3%B3w-768x537.png"
    val photoUrl2: String
        get() = _photoUrl2
}