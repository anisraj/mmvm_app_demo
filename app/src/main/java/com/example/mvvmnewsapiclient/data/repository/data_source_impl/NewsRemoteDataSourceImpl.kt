package com.example.mvvmnewsapiclient.data.repository.data_source_impl

import com.example.mvvmnewsapiclient.data.api.NewsApiService
import com.example.mvvmnewsapiclient.data.model.ApiResponse
import com.example.mvvmnewsapiclient.data.repository.data_source.NewsRemoteDataSource
import retrofit2.Response

class NewsRemoteDataSourceImpl(
    private val newsApiService: NewsApiService,
    private val country: String,
    private val page: Int
) : NewsRemoteDataSource {
    override suspend fun getTopHeadLines(): Response<ApiResponse> {
        return newsApiService.getTopHeadLines(country, page)
    }
}