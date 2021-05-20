package com.example.acsmobile.ui.objects

import androidx.lifecycle.ViewModel

class ObjectsMainViewModel : ViewModel() {
    private var _imageList = listOf(
        "https://acs.amw.gdynia.pl/wp-content/uploads/photo-gallery/imported_from_media_libray/4.jpg?bwg=1599577016",
        "https://acs.amw.gdynia.pl/wp-content/uploads/photo-gallery/imported_from_media_libray/ACS_1_464x309.jpg?bwg=1599577016",
        "https://acs.amw.gdynia.pl/wp-content/uploads/photo-gallery/imported_from_media_libray/1.jpg?bwg=1599577016",
        "https://acs.amw.gdynia.pl/wp-content/uploads/photo-gallery/imported_from_media_libray/6.jpg?bwg=1599577016",
        "https://acs.amw.gdynia.pl/wp-content/uploads/photo-gallery/imported_from_media_libray/7.jpg?bwg=1599577016",
        "https://acs.amw.gdynia.pl/wp-content/uploads/photo-gallery/imported_from_media_libray/ACS_2_464x309.jpg?bwg=1599577016",
        "https://acs.amw.gdynia.pl/wp-content/uploads/photo-gallery/imported_from_media_libray/10.jpg?bwg=1599577016",
        "https://acs.amw.gdynia.pl/wp-content/uploads/photo-gallery/imported_from_media_libray/11.jpg?bwg=1599577016"
    )
    val imageList:List<String>
        get() = _imageList
}