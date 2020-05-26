package com.example.converter.model

data class Live(val success: Boolean,
                val terms: String,
                val privacy: String,
                val timestamp: Int,
                val source: String,
                val quotes: Quotes
)