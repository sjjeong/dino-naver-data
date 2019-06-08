package com.googry.naver.domain.model.search

data class NaverSearchNews(
    val description: String,
    val link: String,
    val originalLink: String,
    val pubDate: String,
    val title: String
)