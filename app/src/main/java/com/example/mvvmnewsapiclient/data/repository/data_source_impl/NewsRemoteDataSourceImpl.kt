package com.example.mvvmnewsapiclient.data.repository.data_source_impl

import com.example.mvvmnewsapiclient.data.api.NewsApiService
import com.example.mvvmnewsapiclient.data.model.ApiResponse
import com.example.mvvmnewsapiclient.data.repository.data_source.NewsRemoteDataSource
import retrofit2.Response

class NewsRemoteDataSourceImpl(
    private val newsApiService: NewsApiService
) : NewsRemoteDataSource {
    override suspend fun getTopHeadLines(
        country: String,
        page: Int
    ): Response<ApiResponse> {
        return newsApiService.getTopHeadLines(country, page)
    }
}