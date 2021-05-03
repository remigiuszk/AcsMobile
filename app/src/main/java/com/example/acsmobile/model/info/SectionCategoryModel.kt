package com.example.acsmobile.model.info

import com.example.acsmobile.model.info.api.SectionCategoryDto
import com.example.acsmobile.model.news.NewsResponseModelItem
import com.example.acsmobile.model.news.PostModel

data class SectionCategoryModel(
        var id:Int,
        var name:String,
        var tag:String,
        var link:String,
        var layoutName:String
)
fun SectionCategoryDto.toSectionCategoryModel() = SectionCategoryModel(
        id = id,
        link = link,
        name = name,
        tag = slug,
        layoutName = "nav_info_sections_"+slug.replace('-', '_')
)
