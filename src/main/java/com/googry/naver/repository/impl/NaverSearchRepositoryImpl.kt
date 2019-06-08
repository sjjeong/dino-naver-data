package com.googry.naver.repository.impl

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.dino.library.data.DataResource
import com.googry.naver.domain.model.enums.*
import com.googry.naver.domain.model.search.*
import com.googry.naver.domain.repository.NaverSearchRepository
import com.googry.naver.repository.model.search.toDomain
import com.googry.naver.repository.source.NaverSearchDataSource

class NaverSearchRepositoryImpl(
    private val naverSearchRemoteDataSource: NaverSearchDataSource
) : NaverSearchRepository {

    override suspend fun getBlog(
        query: String,
        display: Int,
        start: Int,
        sort: NaverSearchSortCategory
    ): LiveData<DataResource<List<NaverSearchBlog>>> {
        val liveData = MutableLiveData<DataResource<List<NaverSearchBlog>>>(DataResource.loading())
        try {
            liveData.value = DataResource.success(
                naverSearchRemoteDataSource.fetchBlogAsync(query, display, start, sort).map {
                    it.toDomain()
                }
            )
        } catch (e: Exception) {
            liveData.value = DataResource.error(e)
        }
        return liveData
    }

    override suspend fun getNews(
        query: String,
        display: Int,
        start: Int,
        sort: NaverSearchSortCategory
    ): LiveData<DataResource<List<NaverSearchNews>>> {
        val liveData = MutableLiveData<DataResource<List<NaverSearchNews>>>(DataResource.loading())
        try {
            liveData.value = DataResource.success(
                naverSearchRemoteDataSource.fetchNewsAsync(query, display, start, sort).map {
                    it.toDomain()
                }
            )
        } catch (e: Exception) {
            liveData.value = DataResource.error(e)
        }
        return liveData
    }

    override suspend fun getBook(
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
    ): LiveData<DataResource<List<NaverSearchBook>>> {
        val liveData = MutableLiveData<DataResource<List<NaverSearchBook>>>(DataResource.loading())
        try {
            liveData.value = DataResource.success(
                naverSearchRemoteDataSource.fetchBookAsync(
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
            )
        } catch (e: Exception) {
            liveData.value = DataResource.error(e)
        }
        return liveData
    }

    override suspend fun getAdult(query: String): LiveData<DataResource<NaverSearchAdult>> {
        val liveData = MutableLiveData<DataResource<NaverSearchAdult>>(DataResource.loading())
        try {
            liveData.value = DataResource.success(
                naverSearchRemoteDataSource.fetchAdultAsync(query).toDomain()
            )
        } catch (e: Exception) {
            liveData.value = DataResource.error(e)
        }
        return liveData
    }

    override suspend fun getEncyc(
        query: String,
        display: Int,
        start: Int
    ): LiveData<DataResource<List<NaverSearchEncyc>>> {
        val liveData = MutableLiveData<DataResource<List<NaverSearchEncyc>>>(DataResource.loading())
        try {
            liveData.value = DataResource.success(
                naverSearchRemoteDataSource.fetchEncycAsync(query, display, start).map {
                    it.toDomain()
                }
            )
        } catch (e: Exception) {
            liveData.value = DataResource.error(e)
        }
        return liveData
    }

    override suspend fun getMovie(
        query: String,
        display: Int,
        start: Int,
        genre: NaverSearchMovieCategory?,
        country: NaverSearchCountryCategory?,
        yearFrom: Int?,
        yearTo: Int?
    ): LiveData<DataResource<List<NaverSearchMovie>>> {
        val liveData = MutableLiveData<DataResource<List<NaverSearchMovie>>>(DataResource.loading())
        try {
            liveData.value = DataResource.success(
                naverSearchRemoteDataSource.fetchMovieAsync(
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
            )
        } catch (e: Exception) {
            liveData.value = DataResource.error(e)
        }
        return liveData
    }

    override suspend fun getCafearticle(
        query: String,
        display: Int,
        start: Int,
        sort: NaverSearchSortCategory
    ): LiveData<DataResource<List<NaverSearchCafearticle>>> {
        val liveData =
            MutableLiveData<DataResource<List<NaverSearchCafearticle>>>(DataResource.loading())
        try {
            liveData.value = DataResource.success(
                naverSearchRemoteDataSource.fetchCafearticleAsync(query, display, start, sort).map {
                    it.toDomain()
                }
            )
        } catch (e: Exception) {
            liveData.value = DataResource.error(e)
        }
        return liveData
    }

    override suspend fun getKin(
        query: String,
        display: Int,
        start: Int,
        sort: NaverSearchKinSortCategory
    ): LiveData<DataResource<List<NaverSearchKin>>> {
        val liveData = MutableLiveData<DataResource<List<NaverSearchKin>>>(DataResource.loading())
        try {
            liveData.value = DataResource.success(
                naverSearchRemoteDataSource.fetchKinAsync(query, display, start, sort).map {
                    it.toDomain()
                }
            )
        } catch (e: Exception) {
            liveData.value = DataResource.error(e)
        }
        return liveData
    }

    override suspend fun getLocal(
        query: String,
        display: Int,
        start: Int,
        sort: NaverSearchLocalCategory
    ): LiveData<DataResource<List<NaverSearchLocal>>> {
        val liveData = MutableLiveData<DataResource<List<NaverSearchLocal>>>(DataResource.loading())
        try {
            liveData.value = DataResource.success(
                naverSearchRemoteDataSource.fetchLocalAsync(query, display, start, sort).map {
                    it.toDomain()
                }
            )
        } catch (e: Exception) {
            liveData.value = DataResource.error(e)
        }
        return liveData
    }

    override suspend fun getErrata(query: String): LiveData<DataResource<NaverSearchErrata>> {
        val liveData = MutableLiveData<DataResource<NaverSearchErrata>>(DataResource.loading())
        try {
            liveData.value = DataResource.success(
                naverSearchRemoteDataSource.fetchErrataAsync(query).toDomain()
            )
        } catch (e: Exception) {
            liveData.value = DataResource.error(e)
        }
        return liveData
    }

    override suspend fun getWebkr(
        query: String,
        display: Int,
        start: Int
    ): LiveData<DataResource<List<NaverSearchWebkr>>> {
        val liveData = MutableLiveData<DataResource<List<NaverSearchWebkr>>>(DataResource.loading())
        try {
            liveData.value = DataResource.success(
                naverSearchRemoteDataSource.fetchWebkrAsync(query, display, start).map {
                    it.toDomain()
                }
            )
        } catch (e: Exception) {
            liveData.value = DataResource.error(e)
        }
        return liveData
    }

    override suspend fun getImage(
        query: String,
        display: Int,
        start: Int,
        sort: NaverSearchLocalCategory,
        filter: NaverSearchImageFilterCategory
    ): LiveData<DataResource<List<NaverSearchImage>>> {
        val liveData = MutableLiveData<DataResource<List<NaverSearchImage>>>(DataResource.loading())
        try {
            liveData.value = DataResource.success(
                naverSearchRemoteDataSource.fetchImageAsync(
                    query,
                    display,
                    start,
                    sort,
                    filter
                ).map {
                    it.toDomain()
                }
            )
        } catch (e: Exception) {
            liveData.value = DataResource.error(e)
        }
        return liveData
    }

    override suspend fun getShop(
        query: String,
        display: Int,
        start: Int,
        sort: NaverSearchShoppingSortCategory
    ): LiveData<DataResource<List<NaverSearchShop>>> {
        val liveData = MutableLiveData<DataResource<List<NaverSearchShop>>>(DataResource.loading())
        try {
            liveData.value = DataResource.success(
                naverSearchRemoteDataSource.fetchShopAsync(query, display, start, sort).map {
                    it.toDomain()
                }
            )
        } catch (e: Exception) {
            liveData.value = DataResource.error(e)
        }
        return liveData
    }

    override suspend fun getDoc(
        query: String,
        display: Int,
        start: Int
    ): LiveData<DataResource<List<NaverSearchDoc>>> {
        val liveData = MutableLiveData<DataResource<List<NaverSearchDoc>>>(DataResource.loading())
        try {
            liveData.value = DataResource.success(
                naverSearchRemoteDataSource.fetchDocAsync(query, display, start).map {
                    it.toDomain()
                }
            )
        } catch (e: Exception) {
            liveData.value = DataResource.error(e)
        }
        return liveData
    }
}