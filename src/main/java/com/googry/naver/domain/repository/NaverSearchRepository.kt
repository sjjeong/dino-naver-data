package com.googry.naver.domain.repository

import androidx.annotation.IntRange
import androidx.lifecycle.LiveData
import com.dino.library.data.DataResource

import com.googry.naver.domain.model.enums.*
import com.googry.naver.domain.model.search.*

interface NaverSearchRepository {
    suspend fun getBlog(
        query: String,
        @IntRange(from = 10, to = 100) display: Int = 10,
        @IntRange(from = 1, to = 1000) start: Int = 1,
        sort: NaverSearchSortCategory = NaverSearchSortCategory.SIM
    ): LiveData<DataResource<List<NaverSearchBlog>>>

    suspend fun getNews(
        query: String,
        @IntRange(from = 10, to = 100) display: Int = 10,
        @IntRange(from = 1, to = 1000) start: Int = 1,
        sort: NaverSearchSortCategory = NaverSearchSortCategory.SIM
    ): LiveData<DataResource<List<NaverSearchNews>>>

    suspend fun getBook(
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
    ): LiveData<DataResource<List<NaverSearchBook>>>

    suspend fun getAdult(
        query: String
    ): LiveData<DataResource<NaverSearchAdult>>

    suspend fun getEncyc(
        query: String,
        @IntRange(from = 10, to = 100) display: Int = 10,
        @IntRange(from = 1, to = 1000) start: Int = 1
    ): LiveData<DataResource<List<NaverSearchEncyc>>>

    suspend fun getMovie(
        query: String,
        @IntRange(from = 10, to = 100) display: Int = 10,
        @IntRange(from = 1, to = 1000) start: Int = 1,
        genre: NaverSearchMovieCategory? = null,
        country: NaverSearchCountryCategory? = null,
        yearFrom: Int? = null,
        yearTo: Int? = null
    ): LiveData<DataResource<List<NaverSearchMovie>>>

    suspend fun getCafearticle(
        query: String,
        @IntRange(from = 10, to = 100) display: Int = 10,
        @IntRange(from = 1, to = 1000) start: Int = 1,
        sort: NaverSearchSortCategory = NaverSearchSortCategory.SIM
    ): LiveData<DataResource<List<NaverSearchCafearticle>>>

    suspend fun getKin(
        query: String,
        @IntRange(from = 10, to = 100) display: Int = 10,
        @IntRange(from = 1, to = 1000) start: Int = 1,
        sort: NaverSearchKinSortCategory = NaverSearchKinSortCategory.SIM
    ): LiveData<DataResource<List<NaverSearchKin>>>

    suspend fun getLocal(
        query: String,
        @IntRange(from = 10, to = 100) display: Int = 10,
        @IntRange(from = 1, to = 1000) start: Int = 1,
        sort: NaverSearchLocalCategory = NaverSearchLocalCategory.RANDOM
    ): LiveData<DataResource<List<NaverSearchLocal>>>

    suspend fun getErrata(
        query: String
    ): LiveData<DataResource<NaverSearchErrata>>

    suspend fun getWebkr(
        query: String,
        @IntRange(from = 10, to = 100) display: Int = 10,
        @IntRange(from = 1, to = 1000) start: Int = 1
    ): LiveData<DataResource<List<NaverSearchWebkr>>>

    suspend fun getImage(
        query: String,
        @IntRange(from = 10, to = 100) display: Int = 10,
        @IntRange(from = 1, to = 1000) start: Int = 1,
        sort: NaverSearchLocalCategory = NaverSearchLocalCategory.RANDOM,
        filter: NaverSearchImageFilterCategory = NaverSearchImageFilterCategory.ALL
    ): LiveData<DataResource<List<NaverSearchImage>>>

    suspend fun getShop(
        query: String,
        @IntRange(from = 10, to = 100) display: Int = 10,
        @IntRange(from = 1, to = 1000) start: Int = 1,
        sort: NaverSearchShoppingSortCategory = NaverSearchShoppingSortCategory.SIM
    ): LiveData<DataResource<List<NaverSearchShop>>>

    suspend fun getDoc(
        query: String,
        @IntRange(from = 10, to = 100) display: Int = 10,
        @IntRange(from = 1, to = 1000) start: Int = 1
    ): LiveData<DataResource<List<NaverSearchDoc>>>

}