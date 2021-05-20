package com.example.acsmobile.ui.pools

import androidx.lifecycle.ViewModel

class PoolsPricingViewModel : ViewModel() {
    private var _photoUrl: String = "https://acs.amw.gdynia.pl/wp-content/uploads/2019/12/cennik-basen-sportowy-768x523.png"
    val photoUrl: String
        get() = _photoUrl

    private var _photoUrl2: String = "https://acs.amw.gdynia.pl/wp-content/uploads/2019/12/cennik-saun-768x523.png"
    val photoUrl2: String
        get() = _photoUrl2
}