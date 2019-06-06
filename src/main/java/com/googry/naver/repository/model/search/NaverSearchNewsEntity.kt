package com.googry.naver.repository.model.search

data class NaverSearchNewsEntity(
    val description: String,
    val link: String,
    val originalLink: String,
    val pubDate: String,
    val title: String
)