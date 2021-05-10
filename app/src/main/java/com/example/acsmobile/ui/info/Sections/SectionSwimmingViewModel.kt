package com.example.acsmobile.ui.info.Sections

import androidx.lifecycle.ViewModel

class SectionSwimmingViewModel : ViewModel() {

    private val _photoUrl = "https://acs.amw.gdynia.pl/wp-content/uploads/2020/06/14882387_1814797338796485_7652703631341711097_o-768x519.jpg"
    val photoUrl : String
        get() = _photoUrl

    private val _photoUrl2 = "https://acs.amw.gdynia.pl/wp-content/uploads/2020/06/44533017_2247762218833326_3239671184010248192_n-300x200.jpg"
    val photoUrl2 : String
        get() = _photoUrl2

    private val _photoUrl3 = "https://acs.amw.gdynia.pl/wp-content/uploads/2020/06/44588578_2247761805500034_8723106108916367360_n-300x200.jpg"
    val photoUrl3 : String
        get() = _photoUrl3
}