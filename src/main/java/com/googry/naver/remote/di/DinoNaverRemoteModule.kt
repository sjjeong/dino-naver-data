package com.googry.naver.remote.di

import com.googry.naver.remote.api.NaverSearchApi
import com.googry.naver.remote.impl.NaverSearchRemoteDataSourceImpl
import com.googry.naver.repository.source.NaverSearchDataSource
import org.koin.core.qualifier.named
import org.koin.dsl.module
import retrofit2.Retrofit

val dinoNaverRemoteModule = module {
    single<NaverSearchApi> {
        (get() as Retrofit).create(NaverSearchApi::class.java)
    }
    single<NaverSearchDataSource>(named("remote")) { NaverSearchRemoteDataSourceImpl(get()) }
}