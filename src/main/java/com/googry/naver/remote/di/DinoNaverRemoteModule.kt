package com.googry.naver.remote.di

import com.googry.naver.remote.impl.NaverRemoteDataSourceImpl
import com.googry.naver.repository.source.NaverDataSource
import org.koin.core.qualifier.named
import org.koin.dsl.module

val dinoNaverRemoteModule = module {
    single<NaverDataSource>(named("remote")) { NaverRemoteDataSourceImpl(get()) }
}