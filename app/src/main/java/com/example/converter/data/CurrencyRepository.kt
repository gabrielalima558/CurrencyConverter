package com.example.converter.data

import androidx.lifecycle.MutableLiveData
import com.example.converter.api.CurrencyApi
import com.example.converter.model.Convert
import com.example.converter.model.ListCurrency

class CurrencyRepository(private val api: CurrencyApi) {
    val dataConvert = MutableLiveData<Convert>()
    val dataList = MutableLiveData<ListCurrency>()

    fun getConvertData(
        access_key: String,
        from: String,
        to: String,
        amount: Int
    ) {
        api.callConverter(access_key, from, to, amount, successConvert())
    }

    private fun successConvert(): (Convert) -> Unit {
        return { convert: Convert ->
            dataConvert.postValue(convert)
        }


    }

    fun getListData(access_key: String) {
        api.callListCurrency(access_key, successList())
    }

    private fun successList(): (ListCurrency) -> Unit {
        return { listCurrency: ListCurrency ->
            dataList.postValue(listCurrency)
        }


    }

}