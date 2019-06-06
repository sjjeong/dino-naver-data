package com.googry.naver.repository.source

import androidx.lifecycle.LiveData
import com.googry.naver.repository.model.search.*

interface NaverDataSource {
    suspend fun getBlogAsync(): LiveData<NaverSearchBlogEntity>

    suspend fun getNewsAsync(): LiveData<NaverSearchNewsEntity>

    suspend fun getBookAsync(): LiveData<NaverSearchBookEntity>

    suspend fun getAdultAsync(): LiveData<NaverSearchAdultEntity>

    suspend fun getEncycAsync(): LiveData<NaverSearchEncycEntity>

    suspend fun getMovieAsync(): LiveData<NaverSearchMovieEntity>

    suspend fun getCafearticleAsync(): LiveData<NaverSearchCafearticleEntity>

    suspend fun getKinAsync(): LiveData<NaverSearchKinEntity>

    suspend fun getLocalAsync(): LiveData<NaverSearchLocalEntity>

    suspend fun getErrataAsync(): LiveData<NaverSearchErrataEntity>

    suspend fun getWebkrAsync(): LiveData<NaverSearchWebkrEntity>

    suspend fun getImageAsync(): LiveData<NaverSearchImageEntity>

    suspend fun getShopAsync(): LiveData<NaverSearchShopEntity>

    suspend fun getDocAsync(): LiveData<NaverSearchDocEntity>

}