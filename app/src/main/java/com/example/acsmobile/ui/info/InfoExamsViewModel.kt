package com.example.acsmobile.ui.info

import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import com.example.acsmobile.ui.info.directorship.DirectorFragment
import com.example.acsmobile.ui.info.directorship.LeadersFragment
import com.example.acsmobile.ui.info.directorship.LeadersSince52Fragment
import com.example.acsmobile.ui.info.exams.*

class InfoExamsViewModel : ViewModel() {
    private var _fragmentsList : List<Fragment> = listOf(ExamsOverviewFragment.newInstance(), ExamsCandidatesFragment.newInstance(), ExamsMilitaryStudentsFragment.newInstance(), ExamMilitaryStudentsSwimmingFragment.newInstance(), ExamCiviliansFragment.newInstance(), ExamMilitariesFragment.newInstance())
    val fragmentsList : List<Fragment>
        get() = _fragmentsList

    private var _titleList : List<String> = listOf("INFORMACJE OGÓLNE", "KANDYDACI NA STUDIA WOJSKOWE","STUDENCI WOJSKOWI - HALA","STUDENCI WOJSKOWI - PŁYWANIE", "STUDENCI CYWILNI", "ŻOŁNIERZE ZAWODOWI")
    val titleList: List<String>
        get() = _titleList
}