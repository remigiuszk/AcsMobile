package com.example.acsmobile.ui.info

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.acsmobile.coroutines.Coroutines
import com.example.acsmobile.model.info.SectionCategoryModel
import com.example.acsmobile.model.info.toSectionCategoryModel
import com.example.acsmobile.model.news.PostModel
import com.example.acsmobile.model.news.toPostModel
import com.example.acsmobile.repository.CategoryRepository
import kotlinx.coroutines.Job

class InfoSectionsViewModel(
        private val repo:CategoryRepository
) : ViewModel() {
    private lateinit var job: Job
    private val _categories = MutableLiveData<ArrayList<SectionCategoryModel>>()
    val categories : LiveData<ArrayList<SectionCategoryModel>>

        get() = _categories

    fun getCategories() {
        job = Coroutines.ioThenMain(
                {
                    repo.getCategories() }
        ) {
            if (it != null) {
                val tempCategoryList = ArrayList<SectionCategoryModel>()
                for (item in it){
                    val category = item.toSectionCategoryModel()
                    tempCategoryList.add(category)
                }
                _categories.value = tempCategoryList
            }
        }
    }

    override fun onCleared() {
        super.onCleared()
        if(::job.isInitialized) job.cancel()
    }
}