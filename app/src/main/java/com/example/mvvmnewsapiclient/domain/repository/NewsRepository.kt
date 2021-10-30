package com.example.mvvmnewsapiclient.domain.repository

import com.example.mvvmnewsapiclient.data.model.ApiResponse
import com.example.mvvmnewsapiclient.data.model.Article
import com.example.mvvmnewsapiclient.data.util.Resource
import kotlinx.coroutines.flow.Flow

interface NewsRepository {
    suspend fun getNewsHeadLines(country: String,
                                 page: Int) : Resource<ApiResponse>
    suspend fun getSearchedNews(searchQuery: String) : Resource<ApiResponse>
    suspend fun saveNews(article: Article)
    suspend fun deleteNews(article: Article)
    fun getSavedNews() : Flow<List<Article>>
}