package com.example.acsmobile.ui.info.exams

import androidx.lifecycle.ViewModel

class ExamsMilitaryStudentsViewModel : ViewModel() {
    private var _photoUrl =
        "https://acs.amw.gdynia.pl/wp-content/uploads/2021/02/I-ROK-WF-768x255.png"
    val photoUrl: String
        get() = _photoUrl

    private var _photoUrl2 =
        "https://acs.amw.gdynia.pl/wp-content/uploads/2021/02/II-ROK-WF-768x255.png"
    val photoUrl2: String
        get() = _photoUrl2

    private var _photoUrl3 =
        "https://acs.amw.gdynia.pl/wp-content/uploads/2021/02/III-ROK-WF-768x254.png"
    val photoUrl3: String
        get() = _photoUrl3

    private var _photoUrl4 =
        "https://acs.amw.gdynia.pl/wp-content/uploads/2021/02/IV-ROK-WF-768x254.png"
    val photoUrl4: String
        get() = _photoUrl4

    private var _photoUrl5 =
        "https://acs.amw.gdynia.pl/wp-content/uploads/2021/02/V-ROK-WF-768x242.png"
    val photoUrl5: String
        get() = _photoUrl5
}