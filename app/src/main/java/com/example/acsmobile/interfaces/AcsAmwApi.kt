package com.example.acsmobile.interfaces

import com.example.acsmobile.helpers.getUnsafeOkHttpClient
import com.example.acsmobile.model.info.api.SectionCategoryDto
import com.example.acsmobile.model.news.NewsResponseModel
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

interface AcsAmwApi {

    @GET("posts")
    suspend fun getNews() : Response<NewsResponseModel>

    @GET("categories?per_page=50")
    suspend fun getCategories() : Response<ArrayList<SectionCategoryDto>>

    @GET("posts")
    suspend fun getNewsFromCategory(@Query("categories")id:Int) : Response<NewsResponseModel>

    companion object{
        operator fun invoke() : AcsAmwApi{
            return Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl("https://acs.amw.gdynia.pl/wp-json/wp/v2/")
                .client(getUnsafeOkHttpClient()!!.build())
                .build()
                .create(AcsAmwApi::class.java)
        }
    }
}