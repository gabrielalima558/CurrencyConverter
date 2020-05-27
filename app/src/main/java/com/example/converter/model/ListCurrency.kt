package com.example.converter.model

data class ListCurrency (val success: Boolean,
                         val terms: String,
                         val privacy: String,
                         val currencies: Currencies
                         )