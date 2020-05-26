package com.example.converter.model

data class Convert (val success: Boolean,
                    val terms: String,
                    val privacy: String,
                    val query: Query,
                    val info: Info,
                    val result: Double
)