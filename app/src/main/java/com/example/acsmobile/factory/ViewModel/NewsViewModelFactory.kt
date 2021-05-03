package com.example.acsmobile.factory.ViewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.acsmobile.repository.NewsRepository
import com.example.acsmobile.ui.news.NewsViewModel

@Suppress("UNCHECKED_CAST")
class NewsViewModelFactory(
    private val repo:NewsRepository
) : ViewModelProvider.NewInstanceFactory() {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return NewsViewModel(repo) as T
    }
}