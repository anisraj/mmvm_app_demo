package com.example.mvvmnewsapiclient.presentation.di

import com.example.mvvmnewsapiclient.data.repository.NewsRepositoryImpl
import com.example.mvvmnewsapiclient.data.repository.data_source.NewsRemoteDataSource
import com.example.mvvmnewsapiclient.domain.repository.NewsRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class RepositoryModule {

    @Singleton
    @Provides
    fun provideNewsRepository(newsRemoteDataSource: NewsRemoteDataSource) : NewsRepository {
        return NewsRepositoryImpl(newsRemoteDataSource)
    }
}