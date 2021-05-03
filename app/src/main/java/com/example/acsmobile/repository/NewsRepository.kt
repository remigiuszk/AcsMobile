package com.example.acsmobile.repository

import com.example.acsmobile.Controller.ApiRequest
import com.example.acsmobile.interfaces.AcsAmwApi

class NewsRepository(private val api: AcsAmwApi) : ApiRequest() {
    suspend fun getNews() = apiRequest { api.getNews() }
}