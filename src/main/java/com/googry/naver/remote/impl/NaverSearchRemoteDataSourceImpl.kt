package com.googry.naver.remote.impl

import com.googry.naver.domain.model.enums.*
import com.googry.naver.remote.api.NaverSearchApi
import com.googry.naver.remote.model.search.toData
import com.googry.naver.repository.source.NaverSearchDataSource

class NaverSearchRemoteDataSourceImpl(
    private val naverSearchApi: NaverSearchApi
) : NaverSearchDataSource {
    override suspend fun fetchBlogAsync(
        clientId: String,
        clientSecret: String,
        query: String,
        display: Int,
        start: Int,
        sort: NaverSearchSortCategory
    ) =
        naverSearchApi.fetchBlog(clientId, clientSecret, query, display, start, sort).toData()

    override suspend fun fetchNewsAsync(
        clientId: String,
        clientSecret: String,
        query: String,
        display: Int,
        start: Int,
        sort: NaverSearchSortCategory
    ) =
        naverSearchApi.fetchNews(clientId, clientSecret, query, display, start, sort).toData()

    override suspend fun fetchBookAsync(
        clientId: String,
        clientSecret: String,
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
            clientId, clientSecret,
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

    override suspend fun fetchAdultAsync(
        clientId: String,
        clientSecret: String,
        query: String
    ) =
        naverSearchApi.fetchAdult(clientId, clientSecret, query).toData()

    override suspend fun fetchEncycAsync(
        clientId: String,
        clientSecret: String,
        query: String,
        display: Int,
        start: Int
    ) =
        naverSearchApi.fetchEncyc(clientId, clientSecret, query, display, start).toData()

    override suspend fun fetchMovieAsync(
        clientId: String,
        clientSecret: String,
        query: String,
        display: Int,
        start: Int,
        genre: NaverSearchMovieCategory?,
        country: NaverSearchCountryCategory?,
        yearFrom: Int?,
        yearTo: Int?
    ) =
        naverSearchApi.fetchMovie(
            clientId,
            clientSecret,
            query,
            display,
            start,
            genre,
            country,
            yearFrom,
            yearTo
        ).toData()

    override suspend fun fetchCafearticleAsync(
        clientId: String,
        clientSecret: String,
        query: String,
        display: Int,
        start: Int,
        sort: NaverSearchSortCategory
    ) =
        naverSearchApi.fetchCafearticle(
            clientId,
            clientSecret,
            query,
            display,
            start,
            sort
        ).toData()

    override suspend fun fetchKinAsync(
        clientId: String,
        clientSecret: String,
        query: String,
        display: Int,
        start: Int,
        sort: NaverSearchKinSortCategory
    ) =
        naverSearchApi.fetchKin(clientId, clientSecret, query, display, start, sort).toData()

    override suspend fun fetchLocalAsync(
        clientId: String,
        clientSecret: String,
        query: String,
        display: Int,
        start: Int,
        sort: NaverSearchLocalCategory
    ) =
        naverSearchApi.fetchLocal(clientId, clientSecret, query, display, start, sort).toData()

    override suspend fun fetchErrataAsync(
        clientId: String,
        clientSecret: String, query: String
    ) =
        naverSearchApi.fetchErrata(clientId, clientSecret, query).toData()

    override suspend fun fetchWebkrAsync(
        clientId: String,
        clientSecret: String,
        query: String,
        display: Int,
        start: Int
    ) =
        naverSearchApi.fetchWebkr(clientId, clientSecret, query, display, start).toData()

    override suspend fun fetchImageAsync(
        clientId: String,
        clientSecret: String,
        query: String,
        display: Int,
        start: Int,
        sort: NaverSearchLocalCategory,
        filter: NaverSearchImageFilterCategory
    ) =
        naverSearchApi.fetchImage(
            clientId,
            clientSecret,
            query,
            display,
            start,
            sort,
            filter
        ).toData()

    override suspend fun fetchShopAsync(
        clientId: String,
        clientSecret: String,
        query: String,
        display: Int,
        start: Int,
        sort: NaverSearchShoppingSortCategory
    ) =
        naverSearchApi.fetchShop(clientId, clientSecret, query, display, start, sort).toData()

    override suspend fun fetchDocAsync(
        clientId: String,
        clientSecret: String,
        query: String,
        display: Int,
        start: Int
    ) =
        naverSearchApi.fetchDoc(clientId, clientSecret, query, display, start).toData()

}