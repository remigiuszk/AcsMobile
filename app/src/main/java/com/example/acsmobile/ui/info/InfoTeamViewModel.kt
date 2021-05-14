package com.example.acsmobile.ui.info

import androidx.lifecycle.ViewModel
import com.example.acsmobile.model.info.TeamMemberModel

class InfoTeamViewModel : ViewModel() {
    private val _membersList = arrayListOf<TeamMemberModel>(
        TeamMemberModel(1, "Kierownictwo, Wykładowcy/Instruktorzy","Dariusz Sapiejka", "d.sapiejka@amw.gdynia.pl", "https://acs.amw.gdynia.pl/wp-content/uploads/2020/06/Sport-005-scaled.jpg", "mgr inż."),
        TeamMemberModel(2, "Kierownictwo, Wykładowcy/Instruktorzy", "kmdr por. Arkadiusz Sobieraj", "a.sobieraj@amw.gdynia.pl", "https://acs.amw.gdynia.pl/wp-content/uploads/2020/06/Sport-008-scaled.jpg", "mgr inż."),
        TeamMemberModel(3, "Kierownictwo, Wykładowcy/Instruktorzy", "Olek Steciuk", "o.steciuk@amw.gdynia.pl", "https://acs.amw.gdynia.pl/wp-content/uploads/2020/06/Sport-002-scaled.jpg", "mgr inż."),
        TeamMemberModel(4, "Wykładowcy/Instruktorzy", "Jerzy Gołąbek", "j.golabek@amw.gdynia.pl", "https://acs.amw.gdynia.pl/wp-content/uploads/2020/09/Jurek-2-scaled.jpg", "mgr"),
        TeamMemberModel(5, "Wykładowcy/Instruktorzy", "Agata Brygała", "a.brygala@amw.gdynia.pl", "https://acs.amw.gdynia.pl/wp-content/uploads/2020/09/Sport-001-scaled.jpg", "mgr"),
        TeamMemberModel(6, "Wykładowcy/Instruktorzy", "Arkadiusz Komorowski", "a.komorowski@amw.gdynia.pl", "https://acs.amw.gdynia.pl/wp-content/uploads/2020/06/Sport-007-1-scaled.jpg", "mgr"),
        TeamMemberModel(7, "Wykładowcy/Instruktorzy", "Sławomir Tybura", "s.tybura@amw.gdynia.pl", "https://acs.amw.gdynia.pl/wp-content/uploads/2020/09/Sport-003-scaled.jpg", "mgr"),
        TeamMemberModel(8, "Administracja", "Daniel Kowalski", "d.kowalski@amw.gdynia.pl", "https://acs.amw.gdynia.pl/wp-content/plugins/staffer/public/assets/staffer-default-image.jpg", "mgr"),
        TeamMemberModel(9, "Administracja", "Marcin Wawrzyniak", "m.wawrzyniak@amw.gdynia.pl", "https://acs.amw.gdynia.pl/wp-content/uploads/2020/09/Sport-010-scaled.jpg",""),
        TeamMemberModel(10, "Administracja", "Andrzej Bąk", "a.bak@amw.gdynia.pl", "https://acs.amw.gdynia.pl/wp-content/uploads/2020/09/Sport-011-scaled.jpg", "")
    )
    val membersList : ArrayList<TeamMemberModel>
        get() = _membersList
}