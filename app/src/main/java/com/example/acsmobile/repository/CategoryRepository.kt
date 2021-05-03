package com.example.acsmobile.repository

import com.example.acsmobile.Controller.ApiRequest
import com.example.acsmobile.interfaces.AcsAmwApi

class CategoryRepository(private val api: AcsAmwApi): ApiRequest() {
    suspend fun getCategories() = apiRequest { api.getCategories() }
}