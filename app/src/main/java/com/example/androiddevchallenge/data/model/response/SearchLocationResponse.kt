package com.example.androiddevchallenge.data.model.response

data class SearchLocationResponse(
    val title: String?,
    val location_type: String,
    val latt_long: String?,
    val woeid: Int?,
)