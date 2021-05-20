package com.example.acsmobile.ui.info

import androidx.lifecycle.ViewModel

class InfoClubsViewModel : ViewModel() {
    private var _photoUrl: String = "https://acs.amw.gdynia.pl/wp-content/uploads/2019/12/azs.png"
    val photoUrl: String
        get() = _photoUrl

    private var _photoUrlFlota: String = "https://acs.amw.gdynia.pl/wp-content/uploads/2019/12/WKS-Flota-300x300.png"
    val photoUrlFlota: String
        get() = _photoUrlFlota

    private var _photoUrlIskra: String = "https://acs.amw.gdynia.pl/wp-content/uploads/2019/12/Iskra.jpg"
    val photoUrlIskra: String
        get() = _photoUrlIskra
}