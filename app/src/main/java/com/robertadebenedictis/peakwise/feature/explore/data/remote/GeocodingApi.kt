package com.robertadebenedictis.peakwise.feature.explore.data.remote

import com.robertadebenedictis.peakwise.feature.explore.data.remote.model.GeocodingResponseDto
import retrofit2.http.GET
import retrofit2.http.Query

interface GeocodingApi {
    @GET("v1/search")
    suspend fun searchLocations(
        @Query("name") name: String,
        @Query("count") count: Int = 10,
        @Query("language") language: String = "en",
        @Query("format") format: String = "json"
    ): List<GeocodingResponseDto>
}