package com.googry.naver.domain.repository

import androidx.annotation.IntRange
import com.dino.library.data.DataResource
import com.googry.naver.domain.model.enums.*
import com.googry.naver.domain.model.search.*
import kotlinx.coroutines.flow.Flow

interface NaverSearchRepository {
    suspend fun getBlog(
        clientId: String,
        clientSecret: String,
        query: String,
        @IntRange(from = 10, to = 100) display: Int = 10,
        @IntRange(from = 1, to = 1000) start: Int = 1,
        sort: NaverSearchSortCategory = NaverSearchSortCategory.SIM
    ): Flow<DataResource<List<NaverSearchBlog>>>

    suspend fun getNews(
        clientId: String,
        clientSecret: String,
        query: String,
        @IntRange(from = 10, to = 100) display: Int = 10,
        @IntRange(from = 1, to = 1000) start: Int = 1,
        sort: NaverSearchSortCategory = NaverSearchSortCategory.SIM
    ): Flow<DataResource<List<NaverSearchNews>>>

    suspend fun getBook(
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
    ): Flow<DataResource<List<NaverSearchBook>>>

    suspend fun getAdult(
        clientId: String,
        clientSecret: String,
        query: String
    ): Flow<DataResource<NaverSearchAdult>>

    suspend fun getEncyc(
        clientId: String,
        clientSecret: String,
        query: String,
        @IntRange(from = 10, to = 100) display: Int = 10,
        @IntRange(from = 1, to = 1000) start: Int = 1
    ): Flow<DataResource<List<NaverSearchEncyc>>>

    suspend fun getMovie(
        clientId: String,
        clientSecret: String,
        query: String,
        @IntRange(from = 10, to = 100) display: Int = 10,
        @IntRange(from = 1, to = 1000) start: Int = 1,
        genre: NaverSearchMovieCategory? = null,
        country: NaverSearchCountryCategory? = null,
        yearFrom: Int? = null,
        yearTo: Int? = null
    ): Flow<DataResource<List<NaverSearchMovie>>>

    suspend fun getCafearticle(
        clientId: String,
        clientSecret: String,
        query: String,
        @IntRange(from = 10, to = 100) display: Int = 10,
        @IntRange(from = 1, to = 1000) start: Int = 1,
        sort: NaverSearchSortCategory = NaverSearchSortCategory.SIM
    ): Flow<DataResource<List<NaverSearchCafearticle>>>

    suspend fun getKin(
        clientId: String,
        clientSecret: String,
        query: String,
        @IntRange(from = 10, to = 100) display: Int = 10,
        @IntRange(from = 1, to = 1000) start: Int = 1,
        sort: NaverSearchKinSortCategory = NaverSearchKinSortCategory.SIM
    ): Flow<DataResource<List<NaverSearchKin>>>

    suspend fun getLocal(
        clientId: String,
        clientSecret: String,
        query: String,
        @IntRange(from = 10, to = 100) display: Int = 10,
        @IntRange(from = 1, to = 1000) start: Int = 1,
        sort: NaverSearchLocalCategory = NaverSearchLocalCategory.RANDOM
    ): Flow<DataResource<List<NaverSearchLocal>>>

    suspend fun getErrata(
        clientId: String,
        clientSecret: String,
        query: String
    ): Flow<DataResource<NaverSearchErrata>>

    suspend fun getWebkr(
        clientId: String,
        clientSecret: String,
        query: String,
        @IntRange(from = 10, to = 100) display: Int = 10,
        @IntRange(from = 1, to = 1000) start: Int = 1
    ): Flow<DataResource<List<NaverSearchWebkr>>>

    suspend fun getImage(
        clientId: String,
        clientSecret: String,
        query: String,
        @IntRange(from = 10, to = 100) display: Int = 10,
        @IntRange(from = 1, to = 1000) start: Int = 1,
        sort: NaverSearchLocalCategory = NaverSearchLocalCategory.RANDOM,
        filter: NaverSearchImageFilterCategory = NaverSearchImageFilterCategory.ALL
    ): Flow<DataResource<List<NaverSearchImage>>>

    suspend fun getShop(
        clientId: String,
        clientSecret: String,
        query: String,
        @IntRange(from = 10, to = 100) display: Int = 10,
        @IntRange(from = 1, to = 1000) start: Int = 1,
        sort: NaverSearchShoppingSortCategory = NaverSearchShoppingSortCategory.SIM
    ): Flow<DataResource<List<NaverSearchShop>>>

    suspend fun getDoc(
        clientId: String,
        clientSecret: String,
        query: String,
        @IntRange(from = 10, to = 100) display: Int = 10,
        @IntRange(from = 1, to = 1000) start: Int = 1
    ): Flow<DataResource<List<NaverSearchDoc>>>

}