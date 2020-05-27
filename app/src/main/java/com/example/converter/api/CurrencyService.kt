package com.example.converter.api

import com.example.converter.model.Convert
import com.example.converter.model.ListCurrency
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query

interface CurrencyService {

    @GET("convert?")
    fun getConvertion(
        @Query("access_key") access_key: String, @Query("from") from: String,
        @Query("to") to: String, @Query("amount") amount: Int
    ): Observable<Convert>

    @GET("list?")
    fun getListCurrency(@Query("access_key") access_key: String): Observable<ListCurrency>


}