package com.example.converter.viewmodel

import androidx.lifecycle.ViewModel
import com.example.converter.data.CurrencyRepository

class CurrencyViewModel(private val repository: CurrencyRepository): ViewModel() {

    fun convert() = repository.dataConvert
    fun list() = repository.dataList

    fun getConvert(access_key: String,
                from: String,
                to: String,
                amount: Int) = repository.getConvertData(access_key, from, to, amount)

    fun getList(access_key: String) = repository.getListData(access_key)

}