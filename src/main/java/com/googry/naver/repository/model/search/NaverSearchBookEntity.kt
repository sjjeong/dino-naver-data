package com.googry.naver.repository.model.search

import com.googry.naver.domain.model.search.NaverSearchBook

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

fun NaverSearchBookEntity.toDomain() =
    NaverSearchBook(
        author = author,
        description = description,
        discount = discount,
        image = image,
        isbn = isbn,
        link = link,
        price = price,
        pubDate = pubDate,
        publisher = publisher,
        title = title
    )