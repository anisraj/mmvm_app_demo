package com.example.mvvmnewsapiclient.presentation.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.mvvmnewsapiclient.data.model.ApiResponse
import com.example.mvvmnewsapiclient.data.util.AppUtils
import com.example.mvvmnewsapiclient.data.util.Resource
import com.example.mvvmnewsapiclient.domain.usecases.GetNewsHeadlinesUseCase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class NewsViewModel(
    private val app: Application,
    private val getNewsHeadlinesUseCase: GetNewsHeadlinesUseCase
) : AndroidViewModel(app) {
    val newsHeadLines = MutableLiveData<Resource<ApiResponse>>()

    fun getNewsHeadLines(country: String, page: Int) {
        viewModelScope.launch(Dispatchers.IO) {
            newsHeadLines.postValue(Resource.Loading())
            if (AppUtils.isNetworkAvailable(app)) {
                val apiResult = getNewsHeadlinesUseCase.execute(country, page)
                newsHeadLines.postValue(apiResult)
            } else {
                newsHeadLines.postValue(Resource.Error("Internet nor available"))
            }
        }
    }
}