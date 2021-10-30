package com.example.mvvmnewsapiclient.data.repository.data_source

import com.example.mvvmnewsapiclient.data.model.ApiResponse
import retrofit2.Response

interface NewsRemoteDataSource {
    suspend fun getTopHeadLines(
        country: String,
        page: Int
    ) : Response<ApiResponse>
}