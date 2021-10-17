package com.example.mvvmnewsapiclient.domain.usecases

import com.example.mvvmnewsapiclient.data.model.ApiResponse
import com.example.mvvmnewsapiclient.data.util.Resource
import com.example.mvvmnewsapiclient.domain.repository.NewsRepository

class GetSearchedNewsUseCase(private val newsRepository: NewsRepository) {
    suspend fun execute(searchQuery: String) : Resource<ApiResponse> {
        return newsRepository.getSearchedNews(searchQuery)
    }
}