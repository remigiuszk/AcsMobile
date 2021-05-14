package com.example.acsmobile.ui.info

import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import com.example.acsmobile.ui.info.Sections.basketsubfragments.ArkaAmwIIFragment
import com.example.acsmobile.ui.info.Sections.basketsubfragments.AzsAmwGdyniaFragment
import com.example.acsmobile.ui.info.Sections.basketsubfragments.SekcjaKobietFragment
import com.example.acsmobile.ui.info.directorship.DirectorFragment
import com.example.acsmobile.ui.info.directorship.LeadersFragment
import com.example.acsmobile.ui.info.directorship.LeadersSince52Fragment

class InfoDirectorshipViewModel : ViewModel() {
    private var _fragmentsList : List<Fragment> = listOf(LeadersFragment.newInstance(), DirectorFragment.newInstance(), LeadersSince52Fragment.newInstance())
    val fragmentsList : List<Fragment>
        get() = _fragmentsList

    private var _titleList : List<String> = listOf("KIEROWNICTWO", "DYREKTOR", "DYREKCJA ACS OD 1952")
    val titleList: List<String>
        get() = _titleList
}