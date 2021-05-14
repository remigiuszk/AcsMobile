package com.example.acsmobile.ui.info.directorship

import androidx.lifecycle.ViewModel
import com.example.acsmobile.model.info.HistoricalLeaderModel

class LeadersSince52ViewModel : ViewModel() {
    private var _leaders : List<HistoricalLeaderModel> = listOf(
        HistoricalLeaderModel("por. mar. Józef ZIELIŃSKI", "1952 – 1957"),
        HistoricalLeaderModel("kpt. mar Ryszard Franciszek SALEZY RADOMSKI", "1957 – 1966"),
        HistoricalLeaderModel("kmdr por. Czesław KALINOWSKI", "1966 – 1971"),
        HistoricalLeaderModel("kmdr Tadeusz PENKULA", "1971 – 1979"),
        HistoricalLeaderModel("kmdr por. Franciszek KOKOT", "1979 – 1983"),
        HistoricalLeaderModel("kmdr por. Jerzy PIOTROWSKI", "1983 – 1985"),
        HistoricalLeaderModel("kmdr por. Jerzy ZYGADŁO", "1985 – 2002"),
        HistoricalLeaderModel("kmdr por. Adam KULA", "2002 - 2004"),
        HistoricalLeaderModel("kmdr por. Sławomir TYBURA", "2004 – 2008"),
        HistoricalLeaderModel("kmdr por. Dariusz SAPIEJKA", "2008 – aktualny")
    )
    val leaders: List<HistoricalLeaderModel>
        get() = _leaders

    private var _imageUrl : String = "https://acs.amw.gdynia.pl/wp-content/uploads/2019/12/amw_logo-241x300.png"
    val imageUrl : String
        get() = _imageUrl
}