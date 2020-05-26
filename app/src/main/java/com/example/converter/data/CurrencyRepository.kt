package com.example.converter.data

import androidx.lifecycle.MutableLiveData
import com.example.converter.api.CurrencyApi
import com.example.converter.model.Convert
import com.example.converter.model.Live

class CurrencyRepository(private val api: CurrencyApi) {
    val dataLive = MutableLiveData<Live>()
    val dataConvert = MutableLiveData<Convert>()

    fun getLive(access_key: String,
                        currencies: List<String>,
                        format: Int) {
        api.callLive(access_key, currencies, format, successLive())
    }

    private fun successLive(): (Live) -> Unit {
        return { live: Live ->
            dataLive.postValue(live)
        }
    }

    fun getConvertData(access_key: String,
                       from: String,
                       to: String,
                       amount: Int){
        api.callConverter(access_key, from, to, amount, successConvert())
    }

    private fun successConvert(): (Convert) -> Unit {
        return { convert: Convert ->
            dataConvert.postValue(convert)
        }


    }
}