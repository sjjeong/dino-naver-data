package com.googry.naver.repository.model.search

data class NaverSearchBookEntity(
    val author: String,
    val description: String,
    val discount: String,
    val image: String,
    val isbn: String,
    val link: String,
    val price: String,
    val pubDate: String,
    val publisher: String,
    val title: String
)