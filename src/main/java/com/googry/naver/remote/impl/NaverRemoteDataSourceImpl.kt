package com.googry.naver.remote.impl

import com.googry.naver.remote.NaverApi
import com.googry.naver.remote.model.enums.*
import com.googry.naver.remote.model.search.toData
import com.googry.naver.repository.source.NaverDataSource

class NaverRemoteDataSourceImpl(
    private val naverApi: NaverApi
) : NaverDataSource {
    override suspend fun fetchBlogAsync(
        query: String,
        display: Int,
        start: Int,
        sort: NaverSearchSortCategory
    ) =
        naverApi.fetchBlog(query, display, start, sort).toData()

    override suspend fun fetchNewsAsync(
        query: String,
        display: Int,
        start: Int,
        sort: NaverSearchSortCategory
    ) =
        naverApi.fetchNews(query, display, start, sort).toData()

    override suspend fun fetchBookAsync(
        query: String,
        display: Int,
        start: Int,
        sort: NaverSearchSortCategory,
        dTitl: String,
        dAuth: String,
        dCont: String,
        dIsbn: String,
        dPubl: String,
        dDafr: String,
        dDato: String,
        dCatg: String
    ) =
        naverApi.fetchBook(
            query,
            display,
            start,
            sort,
            dTitl,
            dAuth,
            dCont,
            dIsbn,
            dPubl,
            dDafr,
            dDato,
            dCatg
        ).toData()

    override suspend fun fetchAdultAsync(query: String) =
        naverApi.fetchAdult(query).toData()

    override suspend fun fetchEncycAsync(
        query: String,
        display: Int,
        start: Int
    ) =
        naverApi.fetchEncyc(query, display, start).toData()

    override suspend fun fetchMovieAsync(
        query: String,
        display: Int,
        start: Int,
        genre: NaverSearchMovieCategory?,
        country: NaverSearchCountryCategory?,
        yearFrom: Int?,
        yearTo: Int?
    ) =
        naverApi.fetchMovie(query, display, start, genre, country, yearFrom, yearTo).toData()

    override suspend fun fetchCafearticleAsync(
        query: String,
        display: Int,
        start: Int,
        sort: NaverSearchSortCategory
    ) =
        naverApi.fetchCafearticle(query, display, start, sort).toData()

    override suspend fun fetchKinAsync(
        query: String,
        display: Int,
        start: Int,
        sort: NaverSearchKinSortCategory
    ) =
        naverApi.fetchKin(query, display, start, sort).toData()

    override suspend fun fetchLocalAsync(
        query: String,
        display: Int,
        start: Int,
        sort: NaverSearchLocalCategory
    ) =
        naverApi.fetchLocal(query, display, start, sort).toData()

    override suspend fun fetchErrataAsync(query: String) =
        naverApi.fetchErrata(query).toData()

    override suspend fun fetchWebkrAsync(
        query: String,
        display: Int,
        start: Int
    ) =
        naverApi.fetchWebkr(query, display, start).toData()

    override suspend fun fetchImageAsync(
        query: String,
        display: Int,
        start: Int,
        sort: NaverSearchLocalCategory,
        filter: NaverSearchImageFilterCategory
    ) =
        naverApi.fetchImage(query, display, start, sort, filter).toData()

    override suspend fun fetchShopAsync(
        query: String,
        display: Int,
        start: Int,
        sort: NaverSearchShoppingSortCategory
    ) =
        naverApi.fetchShop(query, display, start, sort).toData()

    override suspend fun fetchDocAsync(
        query: String,
        display: Int,
        start: Int
    ) =
        naverApi.fetchDoc(query, display, start).toData()

}