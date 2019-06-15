package com.googry.naver.repository.impl

import com.dino.library.data.DataResource
import com.googry.naver.domain.model.enums.*
import com.googry.naver.domain.model.search.*
import com.googry.naver.domain.repository.NaverSearchRepository
import com.googry.naver.repository.model.search.toDomain
import com.googry.naver.repository.source.NaverSearchDataSource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

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
    ): Flow<DataResource<List<NaverSearchBlog>>> = flow {
        emit(DataResource.loading())
        try {
            emit(DataResource.success(
                naverSearchRemoteDataSource.fetchBlogAsync(
                    clientId,
                    clientSecret,
                    query,
                    display,
                    start,
                    sort
                ).map {
                    it.toDomain()
                }
            ))
        } catch (e: Exception) {
            emit(DataResource.error(e))
        }
    }

    override suspend fun getNews(
        clientId: String,
        clientSecret: String,
        query: String,
        display: Int,
        start: Int,
        sort: NaverSearchSortCategory
    ): Flow<DataResource<List<NaverSearchNews>>> = flow {
        emit(DataResource.loading())
        try {
            emit(DataResource.success(
                naverSearchRemoteDataSource.fetchNewsAsync(
                    clientId,
                    clientSecret,
                    query,
                    display,
                    start,
                    sort
                ).map {
                    it.toDomain()
                }
            ))
        } catch (e: Exception) {
            emit(DataResource.error(e))
        }
    }

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
    ): Flow<DataResource<List<NaverSearchBook>>> = flow {
        emit(DataResource.loading())
        try {
            emit(DataResource.success(
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
                ).map {
                    it.toDomain()
                }
            ))
        } catch (e: Exception) {
            emit(DataResource.error(e))
        }
    }

    override suspend fun getAdult(
        clientId: String,
        clientSecret: String,
        query: String
    ): Flow<DataResource<NaverSearchAdult>> = flow {
        emit(DataResource.loading())
        try {
            emit(DataResource.success(
                naverSearchRemoteDataSource.fetchAdultAsync(
                    clientId,
                    clientSecret,
                    query
                ).toDomain()
            ))
        } catch (e: Exception) {
            emit(DataResource.error(e))
        }
    }

    override suspend fun getEncyc(
        clientId: String,
        clientSecret: String,
        query: String,
        display: Int,
        start: Int
    ): Flow<DataResource<List<NaverSearchEncyc>>> = flow {
        emit(DataResource.loading())
        try {
            emit(DataResource.success(
                naverSearchRemoteDataSource.fetchEncycAsync(
                    clientId,
                    clientSecret,
                    query,
                    display,
                    start
                ).map {
                    it.toDomain()
                }
            ))
        } catch (e: Exception) {
            emit(DataResource.error(e))
        }
    }

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
    ): Flow<DataResource<List<NaverSearchMovie>>> = flow {
        emit(DataResource.loading())
        try {
            emit(DataResource.success(
                naverSearchRemoteDataSource.fetchMovieAsync(
                    clientId, clientSecret,
                    query,
                    display,
                    start,
                    genre,
                    country,
                    yearFrom,
                    yearTo
                ).map {
                    it.toDomain()
                }
            ))
        } catch (e: Exception) {
            emit(DataResource.error(e))
        }
    }

    override suspend fun getCafearticle(
        clientId: String,
        clientSecret: String,
        query: String,
        display: Int,
        start: Int,
        sort: NaverSearchSortCategory
    ): Flow<DataResource<List<NaverSearchCafearticle>>> = flow {
        emit(DataResource.loading())
        val liveData =
            try {
                emit(DataResource.success(
                    naverSearchRemoteDataSource.fetchCafearticleAsync(
                        clientId,
                        clientSecret,
                        query,
                        display,
                        start,
                        sort
                    ).map {
                        it.toDomain()
                    }
                ))
            } catch (e: Exception) {
                emit(DataResource.error(e))
            }
    }

    override suspend fun getKin(
        clientId: String,
        clientSecret: String,
        query: String,
        display: Int,
        start: Int,
        sort: NaverSearchKinSortCategory
    ): Flow<DataResource<List<NaverSearchKin>>> = flow {
        emit(DataResource.loading())
        try {
            emit(DataResource.success(
                naverSearchRemoteDataSource.fetchKinAsync(
                    clientId,
                    clientSecret,
                    query,
                    display,
                    start,
                    sort
                ).map {
                    it.toDomain()
                }
            ))
        } catch (e: Exception) {
            emit(DataResource.error(e))
        }
    }

    override suspend fun getLocal(
        clientId: String,
        clientSecret: String,
        query: String,
        display: Int,
        start: Int,
        sort: NaverSearchLocalCategory
    ): Flow<DataResource<List<NaverSearchLocal>>> = flow {
        emit(DataResource.loading())
        try {
            emit(DataResource.success(
                naverSearchRemoteDataSource.fetchLocalAsync(
                    clientId,
                    clientSecret,
                    query,
                    display,
                    start,
                    sort
                ).map {
                    it.toDomain()
                }
            ))
        } catch (e: Exception) {
            emit(DataResource.error(e))
        }
    }

    override suspend fun getErrata(
        clientId: String,
        clientSecret: String,
        query: String
    ): Flow<DataResource<NaverSearchErrata>> = flow {
        emit(DataResource.loading())
        try {
            emit(DataResource.success(
                naverSearchRemoteDataSource.fetchErrataAsync(
                    clientId,
                    clientSecret,
                    query
                ).toDomain()
            ))
        } catch (e: Exception) {
            emit(DataResource.error(e))
        }
    }

    override suspend fun getWebkr(
        clientId: String,
        clientSecret: String,
        query: String,
        display: Int,
        start: Int
    ): Flow<DataResource<List<NaverSearchWebkr>>> = flow {
        emit(DataResource.loading())
        try {
            emit(DataResource.success(
                naverSearchRemoteDataSource.fetchWebkrAsync(
                    clientId,
                    clientSecret,
                    query,
                    display,
                    start
                ).map {
                    it.toDomain()
                }
            ))
        } catch (e: Exception) {
            emit(DataResource.error(e))
        }
    }

    override suspend fun getImage(
        clientId: String,
        clientSecret: String,
        query: String,
        display: Int,
        start: Int,
        sort: NaverSearchLocalCategory,
        filter: NaverSearchImageFilterCategory
    ): Flow<DataResource<List<NaverSearchImage>>> = flow {
        emit(DataResource.loading())
        try {
            emit(DataResource.success(
                naverSearchRemoteDataSource.fetchImageAsync(
                    clientId, clientSecret,
                    query,
                    display,
                    start,
                    sort,
                    filter
                ).map {
                    it.toDomain()
                }
            ))
        } catch (e: Exception) {
            emit(DataResource.error(e))
        }
    }

    override suspend fun getShop(
        clientId: String,
        clientSecret: String,
        query: String,
        display: Int,
        start: Int,
        sort: NaverSearchShoppingSortCategory
    ): Flow<DataResource<List<NaverSearchShop>>> = flow {
        emit(DataResource.loading())
        try {
            emit(DataResource.success(
                naverSearchRemoteDataSource.fetchShopAsync(
                    clientId,
                    clientSecret,
                    query,
                    display,
                    start,
                    sort
                ).map {
                    it.toDomain()
                }
            ))
        } catch (e: Exception) {
            emit(DataResource.error(e))
        }
    }

    override suspend fun getDoc(
        clientId: String,
        clientSecret: String,
        query: String,
        display: Int,
        start: Int
    ): Flow<DataResource<List<NaverSearchDoc>>> = flow {
        emit(DataResource.loading())
        try {
            emit(DataResource.success(
                naverSearchRemoteDataSource.fetchDocAsync(
                    clientId,
                    clientSecret,
                    query,
                    display,
                    start
                ).map {
                    it.toDomain()
                }
            ))
        } catch (e: Exception) {
            emit(DataResource.error(e))
        }
    }
}