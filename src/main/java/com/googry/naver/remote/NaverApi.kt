package com.googry.naver.remote

import com.googry.naver.remote.model.search.NaverSearchBlogResponse
import com.googry.naver.remote.model.search.NaverSearchBookResponse
import com.googry.naver.remote.model.search.NaverSearchNewsResponse
import com.googry.naver.remote.model.search.NaverSearchAdultResponse
import com.googry.naver.remote.model.search.NaverSearchEncycResponse
import com.googry.naver.remote.model.search.NaverSearchMovieResponse
import com.googry.naver.remote.model.search.NaverSearchCafearticleResponse
import com.googry.naver.remote.model.search.NaverSearchKinResponse
import com.googry.naver.remote.model.search.NaverSearchLocalResponse
import com.googry.naver.remote.model.search.NaverSearchErrataResponse
import com.googry.naver.remote.model.search.NaverSearchWebkrResponse
import com.googry.naver.remote.model.search.NaverSearchImageResponse
import com.googry.naver.remote.model.search.NaverSearchShopResponse
import com.googry.naver.remote.model.search.NaverSearchDocResponse
import kotlinx.coroutines.Deferred
import retrofit2.http.GET
import retrofit2.http.Query

interface NaverApi {

    // 블로그
    @GET("v1/search/blog.json")
    fun blog(
        @Query("query") query: String,
        @Query("display") display: Int,
        @Query("start") start: Int
    ): Deferred<NaverSearchBlogResponse>

    // 뉴스
    @GET("v1/search/news.json")
    fun news(
        @Query("query") query: String,
        @Query("display") display: Int,
        @Query("start") start: Int
    ): Deferred<NaverSearchNewsResponse>

    // 책
    @GET("v1/search/book.json")
    fun book(
        @Query("query") query: String,
        @Query("display") display: Int,
        @Query("start") start: Int
    ): Deferred<NaverSearchBookResponse>

    // 성인 검색어 판별
    @GET("v1/search/adult.json")
    fun adult(
        @Query("query") query: String
    ): Deferred<NaverSearchAdultResponse>

    // 백과사전
    @GET("v1/search/encyc.json")
    fun encyc(
        @Query("query") query: String,
        @Query("display") display: Int,
        @Query("start") start: Int
    ): Deferred<NaverSearchEncycResponse>

    // 영화
    @GET("v1/search/movie.json")
    fun movie(
        @Query("query") query: String,
        @Query("display") display: Int,
        @Query("start") start: Int
    ): Deferred<NaverSearchMovieResponse>

    // 카페글
    @GET("v1/search/cafearticle.json")
    fun cafearticle(
        @Query("query") query: String,
        @Query("display") display: Int,
        @Query("start") start: Int
    ): Deferred<NaverSearchCafearticleResponse>

    // 지식iN
    @GET("v1/search/kin.json")
    fun kin(
        @Query("query") query: String,
        @Query("display") display: Int,
        @Query("start") start: Int
    ): Deferred<NaverSearchKinResponse>

    // 지역
    @GET("v1/search/local.json")
    fun local(
        @Query("query") query: String,
        @Query("display") display: Int,
        @Query("start") start: Int
    ): Deferred<NaverSearchLocalResponse>

    // 오타변환
    @GET("v1/search/errata.json")
    fun errata(
        @Query("query") query: String,
        @Query("display") display: Int,
        @Query("start") start: Int
    ): Deferred<NaverSearchErrataResponse>

    // 웹문서
    @GET("v1/search/webkr.json")
    fun webkr(
        @Query("query") query: String,
        @Query("display") display: Int,
        @Query("start") start: Int
    ): Deferred<NaverSearchWebkrResponse>

    // 이미지
    @GET("v1/search/image")
    fun image(
        @Query("query") query: String,
        @Query("display") display: Int,
        @Query("start") start: Int
    ): Deferred<NaverSearchImageResponse>

    // 쇼핑
    @GET("v1/search/shop.json")
    fun shop(
        @Query("query") query: String,
        @Query("display") display: Int,
        @Query("start") start: Int
    ): Deferred<NaverSearchShopResponse>

    // 전문자료
    @GET("v1/search/doc.json")
    fun doc(
        @Query("query") query: String,
        @Query("display") display: Int,
        @Query("start") start: Int
    ): Deferred<NaverSearchDocResponse>

}