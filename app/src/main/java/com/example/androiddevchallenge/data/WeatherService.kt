package com.example.androiddevchallenge.data

import com.example.androiddevchallenge.data.model.response.SearchLocationResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherService {

    @GET("/api/location/search")
    suspend fun searchLocationByQuery(@Query("query") query: String): List<SearchLocationResponse>

    @GET("/api/location/search")
    suspend fun searchLocationByLatLong(@Query("latlong") query: String): List<SearchLocationResponse>

}