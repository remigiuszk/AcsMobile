package com.example.acsmobile.repository

import com.example.acsmobile.Controller.ApiRequest
import com.example.acsmobile.interfaces.NewsApi

class NewsRepository(private val api: NewsApi) : ApiRequest() {
    suspend fun getNews() = apiRequest { api.getNews() }
}