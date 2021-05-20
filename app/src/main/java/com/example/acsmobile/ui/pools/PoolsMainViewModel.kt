package com.example.acsmobile.ui.pools

import androidx.lifecycle.ViewModel

class PoolsMainViewModel : ViewModel() {
    private var _imageList = listOf(
        "https://acs.amw.gdynia.pl/wp-content/uploads/photo-gallery/imported_from_media_libray/Basen-010.jpg?bwg=1599575922",
        "https://acs.amw.gdynia.pl/wp-content/uploads/photo-gallery/imported_from_media_libray/69825291_2572304519499417_1429185960137981952_n.jpg?bwg=1599575922",
        "https://acs.amw.gdynia.pl/wp-content/uploads/photo-gallery/imported_from_media_libray/Basen-014.jpg?bwg=1599575923",
        "https://acs.amw.gdynia.pl/wp-content/uploads/photo-gallery/imported_from_media_libray/Basen-046.jpg?bwg=1599575923",
        "https://acs.amw.gdynia.pl/wp-content/uploads/photo-gallery/imported_from_media_libray/Basen-037.jpg?bwg=1599575923",
        "https://acs.amw.gdynia.pl/wp-content/uploads/photo-gallery/imported_from_media_libray/Basen-039.jpg?bwg=1599575923",
        "https://acs.amw.gdynia.pl/wp-content/uploads/photo-gallery/imported_from_media_libray/Basen-038.jpg?bwg=1599575923",
        "https://acs.amw.gdynia.pl/wp-content/uploads/photo-gallery/imported_from_media_libray/Basen-040.jpg?bwg=1599575922",
        "https://acs.amw.gdynia.pl/wp-content/uploads/photo-gallery/imported_from_media_libray/Basen-041.jpg?bwg=1599575922",
        "https://acs.amw.gdynia.pl/wp-content/uploads/photo-gallery/imported_from_media_libray/Basen-023.jpg?bwg=1599575923",
        "https://acs.amw.gdynia.pl/wp-content/uploads/photo-gallery/imported_from_media_libray/Basen-019.jpg?bwg=1599575923",
        "https://acs.amw.gdynia.pl/wp-content/uploads/photo-gallery/imported_from_media_libray/Basen-020.jpg?bwg=1599575923"
    );
    val imageList:List<String>
    get() = _imageList
}