package com.googry.naver.repository.di

import com.googry.naver.domain.repository.NaverSearchRepository
import com.googry.naver.repository.impl.NaverSearchRepositoryImpl
import org.koin.core.qualifier.named
import org.koin.dsl.module

val dinoNaverRepositoryModule = module {
    single<NaverSearchRepository> { NaverSearchRepositoryImpl(get(named("remote"))) }
}