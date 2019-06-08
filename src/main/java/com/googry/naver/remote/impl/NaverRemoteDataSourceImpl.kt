package com.googry.naver.remote.impl

import com.googry.naver.remote.NaverApi
import com.googry.naver.remote.model.enums.*
import com.googry.naver.remote.model.search.*
import com.googry.naver.repository.source.NaverDataSource

class NaverRemoteDataSourceImpl(
    private val naverApi: NaverApi
) : NaverDataSource {
    override suspend fun fetchBlogAsync(
        query: String,
        display: Int,
        start: Int,
        sort: NaverSearchSortCategory
    ): NaverSearchBlogResponse =
        naverApi.fetchBlog(query, display, start, sort)

    override suspend fun fetchNewsAsync(
        query: String,
        display: Int,
        start: Int,
        sort: NaverSearchSortCategory
    ): NaverSearchNewsResponse =
        naverApi.fetchNews(query, display, start, sort)

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
    ): NaverSearchBookResponse =
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
        )

    override suspend fun fetchAdultAsync(query: String): NaverSearchAdultResponse =
        naverApi.fetchAdult(query)

    override suspend fun fetchEncycAsync(
        query: String,
        display: Int,
        start: Int
    ): NaverSearchEncycResponse =
        naverApi.fetchEncyc(query, display, start)

    override suspend fun fetchMovieAsync(
        query: String,
        display: Int,
        start: Int,
        genre: NaverSearchMovieCategory?,
        country: NaverSearchCountryCategory?,
        yearFrom: Int?,
        yearTo: Int?
    ): NaverSearchMovieResponse =
        naverApi.fetchMovie(query, display, start, genre, country, yearFrom, yearTo)

    override suspend fun fetchCafearticleAsync(
        query: String,
        display: Int,
        start: Int,
        sort: NaverSearchSortCategory
    ): NaverSearchCafearticleResponse =
        naverApi.fetchCafearticle(query, display, start, sort)

    override suspend fun fetchKinAsync(
        query: String,
        display: Int,
        start: Int,
        sort: NaverSearchKinSortCategory
    ): NaverSearchKinResponse =
        naverApi.fetchKin(query, display, start, sort)

    override suspend fun fetchLocalAsync(
        query: String,
        display: Int,
        start: Int,
        sort: NaverSearchLocalCategory
    ): NaverSearchLocalResponse =
        naverApi.fetchLocal(query, display, start, sort)

    override suspend fun fetchErrataAsync(query: String): NaverSearchErrataResponse =
        naverApi.fetchErrata(query)

    override suspend fun fetchWebkrAsync(
        query: String,
        display: Int,
        start: Int
    ): NaverSearchWebkrResponse =
        naverApi.fetchWebkr(query, display, start)

    override suspend fun fetchImageAsync(
        query: String,
        display: Int,
        start: Int,
        sort: NaverSearchLocalCategory,
        filter: NaverSearchImageFilterCategory
    ): NaverSearchImageResponse =
        naverApi.fetchImage(query, display, start, sort, filter)

    override suspend fun fetchShopAsync(
        query: String,
        display: Int,
        start: Int,
        sort: NaverSearchShoppingSortCategory
    ): NaverSearchShopResponse =
        naverApi.fetchShop(query, display, start, sort)

    override suspend fun fetchDocAsync(
        query: String,
        display: Int,
        start: Int
    ): NaverSearchDocResponse =
        naverApi.fetchDoc(query, display, start)

}