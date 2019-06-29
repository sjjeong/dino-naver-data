package com.googry.naver.repository.impl

import com.dino.library.util.DataRemoteBoundResource
import com.googry.naver.domain.model.enums.*
import com.googry.naver.domain.model.search.*
import com.googry.naver.domain.repository.NaverSearchRepository
import com.googry.naver.repository.model.search.*
import com.googry.naver.repository.source.NaverSearchDataSource

class NaverSearchRepositoryImpl(
    private val naverSearchRemoteDataSource: NaverSearchDataSource
) : NaverSearchRepository {

    override suspend fun getBlog(
        clientId: String,
        clientSecret: String,
        query: String,
        display: Int,
        start: Int,
        sort: NaverSearchSortCategory
    ) =
        object : DataRemoteBoundResource<List<NaverSearchBlog>, List<NaverSearchBlogEntity>>() {
            override suspend fun createRemoteSourceResult() =
                naverSearchRemoteDataSource.fetchBlogAsync(
                    clientId,
                    clientSecret,
                    query,
                    display,
                    start,
                    sort
                )

            override suspend fun convertDataToDomain(dataType: List<NaverSearchBlogEntity>) =
                dataType.map { it.toDomain() }
        }.flow()

    override suspend fun getNews(
        clientId: String,
        clientSecret: String,
        query: String,
        display: Int,
        start: Int,
        sort: NaverSearchSortCategory
    ) =
        object : DataRemoteBoundResource<List<NaverSearchNews>, List<NaverSearchNewsEntity>>() {
            override suspend fun createRemoteSourceResult() =
                naverSearchRemoteDataSource.fetchNewsAsync(
                    clientId,
                    clientSecret,
                    query,
                    display,
                    start,
                    sort
                )

            override suspend fun convertDataToDomain(dataType: List<NaverSearchNewsEntity>) =
                dataType.map { it.toDomain() }
        }.flow()

    override suspend fun getBook(
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
        object : DataRemoteBoundResource<List<NaverSearchBook>, List<NaverSearchBookEntity>>() {
            override suspend fun createRemoteSourceResult() =
                naverSearchRemoteDataSource.fetchBookAsync(
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
                )

            override suspend fun convertDataToDomain(dataType: List<NaverSearchBookEntity>) =
                dataType.map { it.toDomain() }
        }.flow()

    override suspend fun getAdult(
        clientId: String,
        clientSecret: String,
        query: String
    ) =
        object : DataRemoteBoundResource<NaverSearchAdult, NaverSearchAdultEntity>() {
            override suspend fun createRemoteSourceResult() =
                naverSearchRemoteDataSource.fetchAdultAsync(
                    clientId,
                    clientSecret,
                    query
                )

            override suspend fun convertDataToDomain(dataType: NaverSearchAdultEntity) =
                dataType.toDomain()
        }.flow()

    override suspend fun getEncyc(
        clientId: String,
        clientSecret: String,
        query: String,
        display: Int,
        start: Int
    ) =
        object : DataRemoteBoundResource<List<NaverSearchEncyc>, List<NaverSearchEncycEntity>>() {
            override suspend fun createRemoteSourceResult() =
                naverSearchRemoteDataSource.fetchEncycAsync(
                    clientId,
                    clientSecret,
                    query,
                    display,
                    start
                )

            override suspend fun convertDataToDomain(dataType: List<NaverSearchEncycEntity>) =
                dataType.map { it.toDomain() }
        }.flow()

    override suspend fun getMovie(
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
        object : DataRemoteBoundResource<List<NaverSearchMovie>, List<NaverSearchMovieEntity>>() {
            override suspend fun createRemoteSourceResult() =
                naverSearchRemoteDataSource.fetchMovieAsync(
                    clientId, clientSecret,
                    query,
                    display,
                    start,
                    genre,
                    country,
                    yearFrom,
                    yearTo
                )

            override suspend fun convertDataToDomain(dataType: List<NaverSearchMovieEntity>) =
                dataType.map { it.toDomain() }
        }.flow()

    override suspend fun getCafearticle(
        clientId: String,
        clientSecret: String,
        query: String,
        display: Int,
        start: Int,
        sort: NaverSearchSortCategory
    ) =
        object :
            DataRemoteBoundResource<List<NaverSearchCafearticle>, List<NaverSearchCafearticleEntity>>() {
            override suspend fun createRemoteSourceResult() =
                naverSearchRemoteDataSource.fetchCafearticleAsync(
                    clientId,
                    clientSecret,
                    query,
                    display,
                    start,
                    sort
                )

            override suspend fun convertDataToDomain(dataType: List<NaverSearchCafearticleEntity>) =
                dataType.map { it.toDomain() }
        }.flow()

    override suspend fun getKin(
        clientId: String,
        clientSecret: String,
        query: String,
        display: Int,
        start: Int,
        sort: NaverSearchKinSortCategory
    ) =
        object : DataRemoteBoundResource<List<NaverSearchKin>, List<NaverSearchKinEntity>>() {
            override suspend fun createRemoteSourceResult() =
                naverSearchRemoteDataSource.fetchKinAsync(
                    clientId,
                    clientSecret,
                    query,
                    display,
                    start,
                    sort
                )

            override suspend fun convertDataToDomain(dataType: List<NaverSearchKinEntity>) =
                dataType.map { it.toDomain() }
        }.flow()

    override suspend fun getLocal(
        clientId: String,
        clientSecret: String,
        query: String,
        display: Int,
        start: Int,
        sort: NaverSearchLocalCategory
    ) =
        object : DataRemoteBoundResource<List<NaverSearchLocal>, List<NaverSearchLocalEntity>>() {
            override suspend fun createRemoteSourceResult() =
                naverSearchRemoteDataSource.fetchLocalAsync(
                    clientId,
                    clientSecret,
                    query,
                    display,
                    start,
                    sort
                )

            override suspend fun convertDataToDomain(dataType: List<NaverSearchLocalEntity>) =
                dataType.map { it.toDomain() }
        }.flow()

    override suspend fun getErrata(
        clientId: String,
        clientSecret: String,
        query: String
    ) =
        object : DataRemoteBoundResource<NaverSearchErrata, NaverSearchErrataEntity>() {
            override suspend fun createRemoteSourceResult() =
                naverSearchRemoteDataSource.fetchErrataAsync(
                    clientId,
                    clientSecret,
                    query
                )

            override suspend fun convertDataToDomain(dataType: NaverSearchErrataEntity) =
                dataType.toDomain()
        }.flow()

    override suspend fun getWebkr(
        clientId: String,
        clientSecret: String,
        query: String,
        display: Int,
        start: Int
    ) =
        object : DataRemoteBoundResource<List<NaverSearchWebkr>, List<NaverSearchWebkrEntity>>() {
            override suspend fun createRemoteSourceResult() =
                naverSearchRemoteDataSource.fetchWebkrAsync(
                    clientId,
                    clientSecret,
                    query,
                    display,
                    start
                )

            override suspend fun convertDataToDomain(dataType: List<NaverSearchWebkrEntity>) =
                dataType.map { it.toDomain() }
        }.flow()

    override suspend fun getImage(
        clientId: String,
        clientSecret: String,
        query: String,
        display: Int,
        start: Int,
        sort: NaverSearchLocalCategory,
        filter: NaverSearchImageFilterCategory
    ) =
        object : DataRemoteBoundResource<List<NaverSearchImage>, List<NaverSearchImageEntity>>() {
            override suspend fun createRemoteSourceResult() =
                naverSearchRemoteDataSource.fetchImageAsync(
                    clientId, clientSecret,
                    query,
                    display,
                    start,
                    sort,
                    filter
                )

            override suspend fun convertDataToDomain(dataType: List<NaverSearchImageEntity>) =
                dataType.map { it.toDomain() }
        }.flow()

    override suspend fun getShop(
        clientId: String,
        clientSecret: String,
        query: String,
        display: Int,
        start: Int,
        sort: NaverSearchShoppingSortCategory
    ) =
        object : DataRemoteBoundResource<List<NaverSearchShop>, List<NaverSearchShopEntity>>() {
            override suspend fun createRemoteSourceResult() =
                naverSearchRemoteDataSource.fetchShopAsync(
                    clientId,
                    clientSecret,
                    query,
                    display,
                    start,
                    sort
                )

            override suspend fun convertDataToDomain(dataType: List<NaverSearchShopEntity>) =
                dataType.map { it.toDomain() }
        }.flow()

    override suspend fun getDoc(
        clientId: String,
        clientSecret: String,
        query: String,
        display: Int,
        start: Int
    ) =
        object : DataRemoteBoundResource<List<NaverSearchDoc>, List<NaverSearchDocEntity>>() {
            override suspend fun createRemoteSourceResult() =
                naverSearchRemoteDataSource.fetchDocAsync(
                    clientId,
                    clientSecret,
                    query,
                    display,
                    start
                )

            override suspend fun convertDataToDomain(dataType: List<NaverSearchDocEntity>) =
                dataType.map { it.toDomain() }
        }.flow()
}