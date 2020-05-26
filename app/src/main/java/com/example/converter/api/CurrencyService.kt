package com.example.converter.api

import com.example.converter.model.Convert
import com.example.converter.model.Live
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query

interface CurrencyService {
    @GET("live?")
    fun getLive(@Query("access_key") access_key: String, @Query("currencies") currencies: List<String>,
                @Query("format") format: Int
                ): Observable<Live>

    @GET("convert?")
    fun getConvertion(@Query("access_key") access_key: String, @Query("from") from: String,
                @Query("to") to: String, @Query("amount") amount: Int
    ): Observable<Convert>


}