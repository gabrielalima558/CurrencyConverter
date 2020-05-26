package com.example.converter.api

import android.util.Log
import com.example.converter.model.Convert
import com.example.converter.model.Live
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import retrofit2.Retrofit

class CurrencyApi(retrofit: Retrofit) {
    private val service: CurrencyService by lazy {
        retrofit.create(CurrencyService::class.java)
    }
    fun callLive(
        access_key: String,
        currencies: List<String>,
        format: Int,
        lidaComSucesso: (Live) -> Unit
    ) {
        val observable = service.getLive(access_key, currencies, format)
        observable
            .flatMap { results -> Observable.fromArray(results) }
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({ response ->
                response?.let(lidaComSucesso)

            }, { error ->
                Log.e("TESTEERROR", error.message.toString())
            }
            )
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
                Log.e("TESTEERROR", error.message.toString())
            }
            )
    }
}