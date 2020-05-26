package com.example.converter.viewmodel

import androidx.lifecycle.ViewModel
import com.example.converter.data.CurrencyRepository

class CurrencyViewModel(private val repository: CurrencyRepository): ViewModel() {

    fun live() = repository.dataLive

    fun convert() = repository.dataConvert

    fun getLive(access_key: String,
                currencies: List<String>,
                format: Int) = repository.getLive(access_key, currencies, format)

    fun getConvert(access_key: String,
                from: String,
                to: String,
                amount: Int) = repository.getConvertData(access_key, from, to, amount)

}