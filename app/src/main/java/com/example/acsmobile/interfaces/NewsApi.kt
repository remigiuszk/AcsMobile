package com.example.acsmobile.interfaces

import com.example.acsmobile.helpers.getUnsafeOkHttpClient
import com.example.acsmobile.model.news.NewsResponseModel
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface NewsApi {

    @GET("posts?filter[posts_per_page]=3")
    suspend fun getNews() : Response<NewsResponseModel>

    companion object{
        operator fun invoke() : NewsApi{
            return Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl("https://acs.amw.gdynia.pl/wp-json/wp/v2/")
                .client(getUnsafeOkHttpClient()!!.build())
                .build()
                .create(NewsApi::class.java)
        }
    }
}