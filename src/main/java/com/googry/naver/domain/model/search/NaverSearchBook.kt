package com.googry.naver.domain.model.search

data class NaverSearchBook(
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