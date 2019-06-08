package com.googry.naver.repository.source

import androidx.annotation.IntRange
import com.googry.naver.remote.model.enums.*
import com.googry.naver.remote.model.search.*

interface NaverDataSource {
    suspend fun getBlogAsync(
        query: String,
        @IntRange(from = 10, to = 100) display: Int = 10,
        @IntRange(from = 1, to = 1000) start: Int = 1,
        sort: NaverSearchSortCategory = NaverSearchSortCategory.SIM
    ): NaverSearchBlogResponse

    suspend fun getNewsAsync(
        query: String,
        @IntRange(from = 10, to = 100) display: Int = 10,
        @IntRange(from = 1, to = 1000) start: Int = 1,
        sort: NaverSearchSortCategory = NaverSearchSortCategory.SIM
    ): NaverSearchNewsResponse

    suspend fun getBookAsync(
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
    ): NaverSearchBookResponse

    suspend fun getAdultAsync(
        query: String
    ): NaverSearchAdultResponse

    suspend fun getEncycAsync(
        query: String,
        @IntRange(from = 10, to = 100) display: Int = 10,
        @IntRange(from = 1, to = 1000) start: Int = 1
    ): NaverSearchEncycResponse

    suspend fun getMovieAsync(
        query: String,
        @IntRange(from = 10, to = 100) display: Int = 10,
        @IntRange(from = 1, to = 1000) start: Int = 1,
        genre: NaverSearchMovieCategory? = null,
        country: NaverSearchCountryCategory? = null,
        yearFrom: Int? = null,
        yearTo: Int? = null
    ): NaverSearchMovieResponse

    suspend fun getCafearticleAsync(
        query: String,
        @IntRange(from = 10, to = 100) display: Int = 10,
        @IntRange(from = 1, to = 1000) start: Int = 1,
        sort: NaverSearchSortCategory = NaverSearchSortCategory.SIM
    ): NaverSearchCafearticleResponse

    suspend fun getKinAsync(
        query: String,
        @IntRange(from = 10, to = 100) display: Int = 10,
        @IntRange(from = 1, to = 1000) start: Int = 1,
        sort: NaverSearchKinSortCategory = NaverSearchKinSortCategory.SIM
    ): NaverSearchKinResponse

    suspend fun getLocalAsync(
        query: String,
        @IntRange(from = 10, to = 100) display: Int = 10,
        @IntRange(from = 1, to = 1000) start: Int = 1,
        sort: NaverSearchLocalCategory = NaverSearchLocalCategory.RANDOM
    ): NaverSearchLocalResponse

    suspend fun getErrataAsync(
        query: String
    ): NaverSearchErrataResponse

    suspend fun getWebkrAsync(
        query: String,
        @IntRange(from = 10, to = 100) display: Int = 10,
        @IntRange(from = 1, to = 1000) start: Int = 1
    ): NaverSearchWebkrResponse

    suspend fun getImageAsync(
        query: String,
        @IntRange(from = 10, to = 100) display: Int = 10,
        @IntRange(from = 1, to = 1000) start: Int = 1,
        sort: NaverSearchLocalCategory = NaverSearchLocalCategory.RANDOM,
        filter: NaverSearchImageFilterCategory = NaverSearchImageFilterCategory.ALL
    ): NaverSearchImageResponse

    suspend fun getShopAsync(
        query: String,
        @IntRange(from = 10, to = 100) display: Int = 10,
        @IntRange(from = 1, to = 1000) start: Int = 1,
        sort: NaverSearchShoppingSortCategory = NaverSearchShoppingSortCategory.SIM
    ): NaverSearchShopResponse

    suspend fun getDocAsync(
        query: String,
        @IntRange(from = 10, to = 100) display: Int = 10,
        @IntRange(from = 1, to = 1000) start: Int = 1
    ): NaverSearchDocResponse

}