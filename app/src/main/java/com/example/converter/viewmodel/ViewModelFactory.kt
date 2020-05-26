package com.example.converter.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.converter.api.CurrencyApi
import com.example.converter.api.InitRetrofit
import com.example.converter.data.CurrencyRepository


object ViewModelFactory : ViewModelProvider.NewInstanceFactory() {

    private val retrofit = InitRetrofit.retrofit

    private val currencyApi = CurrencyApi(retrofit)

    private val currencyRepository =
        CurrencyRepository(currencyApi)

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T = CurrencyViewModel(
        currencyRepository
    ) as T

}