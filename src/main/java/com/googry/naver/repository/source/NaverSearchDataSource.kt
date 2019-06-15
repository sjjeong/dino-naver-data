package com.googry.naver.repository.source

import androidx.annotation.IntRange
import com.googry.naver.domain.model.enums.*
import com.googry.naver.repository.model.search.*

interface NaverSearchDataSource {
    suspend fun fetchBlogAsync(
        clientId: String,
        clientSecret: String,
        query: String,
        @IntRange(from = 10, to = 100) display: Int = 10,
        @IntRange(from = 1, to = 1000) start: Int = 1,
        sort: NaverSearchSortCategory = NaverSearchSortCategory.SIM
    ): List<NaverSearchBlogEntity>

    suspend fun fetchNewsAsync(
        clientId: String,
        clientSecret: String,
        query: String,
        @IntRange(from = 10, to = 100) display: Int = 10,
        @IntRange(from = 1, to = 1000) start: Int = 1,
        sort: NaverSearchSortCategory = NaverSearchSortCategory.SIM
    ): List<NaverSearchNewsEntity>

    suspend fun fetchBookAsync(
        clientId: String,
        clientSecret: String,
        query: String,
        @IntRange(from = 10, to = 100) display: Int = 10,
        @IntRange(from = 1, to = 1000) start: Int = 1,
        sort: NaverSearchSortCategory = NaverSearchSortCategory.SIM,
        dTitl: String = "",
        dAuth: String = "",
        dCont: String = "",
        dIsbn: String = "",
        dPubl: String = "",
        dDafr: String = "",
        dDato: String = "",
        dCatg: String = ""
    ): List<NaverSearchBookEntity>

    suspend fun fetchAdultAsync(
        clientId: String,
        clientSecret: String,
        query: String
    ): NaverSearchAdultEntity

    suspend fun fetchEncycAsync(
        clientId: String,
        clientSecret: String,
        query: String,
        @IntRange(from = 10, to = 100) display: Int = 10,
        @IntRange(from = 1, to = 1000) start: Int = 1
    ): List<NaverSearchEncycEntity>

    suspend fun fetchMovieAsync(
        clientId: String,
        clientSecret: String,
        query: String,
        @IntRange(from = 10, to = 100) display: Int = 10,
        @IntRange(from = 1, to = 1000) start: Int = 1,
        genre: NaverSearchMovieCategory? = null,
        country: NaverSearchCountryCategory? = null,
        yearFrom: Int? = null,
        yearTo: Int? = null
    ): List<NaverSearchMovieEntity>

    suspend fun fetchCafearticleAsync(
        clientId: String,
        clientSecret: String,
        query: String,
        @IntRange(from = 10, to = 100) display: Int = 10,
        @IntRange(from = 1, to = 1000) start: Int = 1,
        sort: NaverSearchSortCategory = NaverSearchSortCategory.SIM
    ): List<NaverSearchCafearticleEntity>

    suspend fun fetchKinAsync(
        clientId: String,
        clientSecret: String,
        query: String,
        @IntRange(from = 10, to = 100) display: Int = 10,
        @IntRange(from = 1, to = 1000) start: Int = 1,
        sort: NaverSearchKinSortCategory = NaverSearchKinSortCategory.SIM
    ): List<NaverSearchKinEntity>

    suspend fun fetchLocalAsync(
        clientId: String,
        clientSecret: String,
        query: String,
        @IntRange(from = 10, to = 100) display: Int = 10,
        @IntRange(from = 1, to = 1000) start: Int = 1,
        sort: NaverSearchLocalCategory = NaverSearchLocalCategory.RANDOM
    ): List<NaverSearchLocalEntity>

    suspend fun fetchErrataAsync(
        clientId: String,
        clientSecret: String,
        query: String
    ): NaverSearchErrataEntity

    suspend fun fetchWebkrAsync(
        clientId: String,
        clientSecret: String,
        query: String,
        @IntRange(from = 10, to = 100) display: Int = 10,
        @IntRange(from = 1, to = 1000) start: Int = 1
    ): List<NaverSearchWebkrEntity>

    suspend fun fetchImageAsync(
        clientId: String,
        clientSecret: String,
        query: String,
        @IntRange(from = 10, to = 100) display: Int = 10,
        @IntRange(from = 1, to = 1000) start: Int = 1,
        sort: NaverSearchLocalCategory = NaverSearchLocalCategory.RANDOM,
        filter: NaverSearchImageFilterCategory = NaverSearchImageFilterCategory.ALL
    ): List<NaverSearchImageEntity>

    suspend fun fetchShopAsync(
        clientId: String,
        clientSecret: String,
        query: String,
        @IntRange(from = 10, to = 100) display: Int = 10,
        @IntRange(from = 1, to = 1000) start: Int = 1,
        sort: NaverSearchShoppingSortCategory = NaverSearchShoppingSortCategory.SIM
    ): List<NaverSearchShopEntity>

    suspend fun fetchDocAsync(
        clientId: String,
        clientSecret: String,
        query: String,
        @IntRange(from = 10, to = 100) display: Int = 10,
        @IntRange(from = 1, to = 1000) start: Int = 1
    ): List<NaverSearchDocEntity>

}