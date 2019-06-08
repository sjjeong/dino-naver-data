package com.googry.naver.repository.model.search

import com.googry.naver.domain.model.search.NaverSearchBlog

data class NaverSearchBlogEntity(
    val bloggerLink: String,
    val bloggerName: String,
    val description: String,
    val link: String,
    val postdate: String,
    val title: String
)

fun NaverSearchBlogEntity.toDomain() =
    NaverSearchBlog(
        bloggerLink = bloggerLink,
        bloggerName = bloggerName,
        description = description,
        link = link,
        postdate = postdate,
        title = title
    )
