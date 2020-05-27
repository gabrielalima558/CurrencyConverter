package com.example.converter.api

import android.util.Log
import com.example.converter.model.Convert
import com.example.converter.model.ListCurrency
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import retrofit2.Retrofit

class CurrencyApi(retrofit: Retrofit) {
    private val service: CurrencyService by lazy {
        retrofit.create(CurrencyService::class.java)
    }
    fun callConverter(
        access_key: String,
        from: String,
        to: String,
        amount: Int,
        lidaComSucesso: (Convert) -> Unit
    ) {
        val observable = service.getConvertion(access_key, from, to, amount)
        observable
            .flatMap { results -> Observable.fromArray(results) }
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({ response ->
                response?.let(lidaComSucesso)

            }, { error ->
                Log.e("Fail", error.message.toString())
            }
            )
    }

    fun callListCurrency(access_key: String, lidaComSucesso: (ListCurrency) -> Unit){
        val observable = service.getListCurrency(access_key)
        observable
            .flatMap { results -> Observable.fromArray(results) }
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({ response ->
                response?.let(lidaComSucesso)

            }, { error ->
                Log.e("Fail", error.message.toString())
            }
            )
    }
}