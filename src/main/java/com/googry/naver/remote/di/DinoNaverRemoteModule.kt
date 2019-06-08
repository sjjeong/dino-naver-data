package com.googry.naver.remote.di

import com.googry.naver.remote.impl.NaverSearchRemoteSearchDataSourceImpl
import com.googry.naver.repository.source.NaverSearchDataSource
import org.koin.core.qualifier.named
import org.koin.dsl.module

val dinoNaverRemoteModule = module {
    single<NaverSearchDataSource>(named("remote")) { NaverSearchRemoteSearchDataSourceImpl(get()) }
}