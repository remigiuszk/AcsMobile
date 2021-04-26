package com.example.acsmobile.ui.news

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.acsmobile.coroutines.Coroutines
import com.example.acsmobile.model.news.NewsResponseModel
import com.example.acsmobile.repository.NewsRepository
import kotlinx.coroutines.Job

class NewsViewModel(
    private val repo: NewsRepository
) : ViewModel() {

    private lateinit var job: Job
    private val _news = MutableLiveData<NewsResponseModel>()
    val news : LiveData<NewsResponseModel>
        get() = _news

    fun getNews() {
        job = Coroutines.ioThenMain(
            {
                repo.getNews() }
        ) {
            _news.value = it
        }
    }

    override fun onCleared() {
        super.onCleared()
        if(::job.isInitialized) job.cancel()
    }
}