package com.example.acsmobile.model.info.api

data class Links(
    val about: List<About>,
    val collection: List<Collection>,
    val curies: List<Cury>,
    val self: List<Self>,
    val wp: List<WpPostType>
)