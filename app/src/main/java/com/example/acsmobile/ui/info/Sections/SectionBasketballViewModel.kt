package com.example.acsmobile.ui.info.Sections

import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import com.example.acsmobile.R
import com.example.acsmobile.ui.info.Sections.basketsubfragments.ArkaAmwIIFragment
import com.example.acsmobile.ui.info.Sections.basketsubfragments.AzsAmwGdyniaFragment
import com.example.acsmobile.ui.info.Sections.basketsubfragments.SekcjaKobietFragment

class SectionBasketballViewModel : ViewModel() {
    private var _fragmentsList : List<Fragment> = listOf(ArkaAmwIIFragment.newInstance(), AzsAmwGdyniaFragment.newInstance(), SekcjaKobietFragment.newInstance())
    val fragmentsList : List<Fragment>
    get() = _fragmentsList

    private var _titleList : List<String> = listOf("ARKA AMW II GDYNIA", "AZS AMW GDYNIA", "Sekcja kobiet")
    val titleList: List<String>
    get() = _titleList
}