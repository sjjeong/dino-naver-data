package com.googry.naver.repository.model.search

import com.googry.naver.domain.model.search.NaverSearchMovie

data class NaverSearchMovieEntity(
    val actor: String,
    val director: String,
    val image: String,
    val link: String,
    val pubDate: String,
    val subtitle: String,
    val title: String,
    val userRating: String
)

fun NaverSearchMovieEntity.toDomain() =
    NaverSearchMovie(
        actor = actor,
        director = director,
        image = image,
        link = link,
        pubDate = pubDate,
        subtitle = subtitle,
        title = title,
        userRating = userRating
    )