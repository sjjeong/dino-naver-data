package com.googry.naver.domain.model.search

data class NaverSearchLocal(
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