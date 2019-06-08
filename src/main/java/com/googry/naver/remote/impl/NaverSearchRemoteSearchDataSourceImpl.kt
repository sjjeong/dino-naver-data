package com.googry.naver.remote.impl

import com.googry.naver.domain.model.enums.*
import com.googry.naver.remote.api.NaverSearchApi
import com.googry.naver.remote.model.search.toData
import com.googry.naver.repository.source.NaverSearchDataSource

class NaverSearchRemoteSearchDataSourceImpl(
    private val naverSearchApi: NaverSearchApi
) : NaverSearchDataSource {
    override suspend fun fetchBlogAsync(
        query: String,
        display: Int,
        start: Int,
        sort: NaverSearchSortCategory
    ) =
        naverSearchApi.fetchBlog(query, display, start, sort).toData()

    override suspend fun fetchNewsAsync(
        query: String,
        display: Int,
        start: Int,
        sort: NaverSearchSortCategory
    ) =
        naverSearchApi.fetchNews(query, display, start, sort).toData()

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
        naverSearchApi.fetchBook(
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
        naverSearchApi.fetchAdult(query).toData()

    override suspend fun fetchEncycAsync(
        query: String,
        display: Int,
        start: Int
    ) =
        naverSearchApi.fetchEncyc(query, display, start).toData()

    override suspend fun fetchMovieAsync(
        query: String,
        display: Int,
        start: Int,
        genre: NaverSearchMovieCategory?,
        country: NaverSearchCountryCategory?,
        yearFrom: Int?,
        yearTo: Int?
    ) =
        naverSearchApi.fetchMovie(query, display, start, genre, country, yearFrom, yearTo).toData()

    override suspend fun fetchCafearticleAsync(
        query: String,
        display: Int,
        start: Int,
        sort: NaverSearchSortCategory
    ) =
        naverSearchApi.fetchCafearticle(query, display, start, sort).toData()

    override suspend fun fetchKinAsync(
        query: String,
        display: Int,
        start: Int,
        sort: NaverSearchKinSortCategory
    ) =
        naverSearchApi.fetchKin(query, display, start, sort).toData()

    override suspend fun fetchLocalAsync(
        query: String,
        display: Int,
        start: Int,
        sort: NaverSearchLocalCategory
    ) =
        naverSearchApi.fetchLocal(query, display, start, sort).toData()

    override suspend fun fetchErrataAsync(query: String) =
        naverSearchApi.fetchErrata(query).toData()

    override suspend fun fetchWebkrAsync(
        query: String,
        display: Int,
        start: Int
    ) =
        naverSearchApi.fetchWebkr(query, display, start).toData()

    override suspend fun fetchImageAsync(
        query: String,
        display: Int,
        start: Int,
        sort: NaverSearchLocalCategory,
        filter: NaverSearchImageFilterCategory
    ) =
        naverSearchApi.fetchImage(query, display, start, sort, filter).toData()

    override suspend fun fetchShopAsync(
        query: String,
        display: Int,
        start: Int,
        sort: NaverSearchShoppingSortCategory
    ) =
        naverSearchApi.fetchShop(query, display, start, sort).toData()

    override suspend fun fetchDocAsync(
        query: String,
        display: Int,
        start: Int
    ) =
        naverSearchApi.fetchDoc(query, display, start).toData()

}