package com.googry.naver.repository.model.search

data class NaverSearchLocalEntity(
    val address: String,
    val category: String,
    val description: String,
    val link: String,
    val mapX: String,
    val mapY: String,
    val roadAddress: String,
    val telephone: String,
    val title: String
)