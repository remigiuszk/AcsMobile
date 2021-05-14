package com.example.acsmobile.ui.info.directorship

import androidx.lifecycle.ViewModel
import com.example.acsmobile.model.info.TeamMemberModel

class LeadersViewModel : ViewModel() {
    private val _leaderList = arrayListOf<TeamMemberModel>(
        TeamMemberModel(1, "Dyrektor Akademickiego Centrum Sportowego","Dariusz Sapiejka", "d.sapiejka@amw.gdynia.pl", "https://acs.amw.gdynia.pl/wp-content/uploads/2020/06/Sport-005-scaled.jpg", ""),
        TeamMemberModel(2, "Kierownik Ośrodka Wychowania Fizycznego i Sportu", "kmdr por. Arkadiusz Sobieraj", "a.sobieraj@amw.gdynia.pl", "https://acs.amw.gdynia.pl/wp-content/uploads/2020/06/Sport-008-scaled.jpg", ""),
        TeamMemberModel(3, "Kierownik Ośrodka Szkolenia Pływackiego", "Olek Steciuk", "o.steciuk@amw.gdynia.pl", "https://acs.amw.gdynia.pl/wp-content/uploads/2020/06/Sport-002-scaled.jpg", "")
    )
    val teamMemberList : ArrayList<TeamMemberModel>
        get() = _leaderList
}