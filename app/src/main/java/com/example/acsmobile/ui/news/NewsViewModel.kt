package com.example.acsmobile.ui.news

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.acsmobile.coroutines.Coroutines
import com.example.acsmobile.model.news.NewsResponseModel
import com.example.acsmobile.model.news.PostModel
import com.example.acsmobile.model.news.toPostModel
import com.example.acsmobile.repository.NewsRepository
import kotlinx.coroutines.Job

class NewsViewModel(
    private val repo: NewsRepository
) : ViewModel() {

    private lateinit var job: Job
    private val _news = MutableLiveData<ArrayList<PostModel>>()
    val news : LiveData<ArrayList<PostModel>>

        get() = _news

    fun getNews() {
        job = Coroutines.ioThenMain(
            {
                repo.getNews() }
        ) {
            if (it != null) {
                val arrayList = ArrayList<PostModel>()
                for (item in it){
                    val post = item.toPostModel()
                    arrayList.add(post)
                }
                _news.value = arrayList
            }
        }
    }

    fun getNews(id:Int){
        job = Coroutines.ioThenMain(
            {
                repo.getNewsFromCategory(id) }
        ) {
            if (it != null) {
                val arrayList = ArrayList<PostModel>()
                for (item in it){
                    val post = item.toPostModel()
                    arrayList.add(post)
                }
                _news.value = arrayList
            }
        }
    }

    override fun onCleared() {
        super.onCleared()
        if(::job.isInitialized) job.cancel()
    }
}