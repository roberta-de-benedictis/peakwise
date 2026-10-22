package com.robertadebenedictis.peakwise.feature.weather.data.remote

import com.robertadebenedictis.peakwise.feature.weather.data.remote.model.ForecastResponseDto
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherApi {
    @GET("v1/forecast")
    suspend fun getWeatherForecast(
        @Query("latitude") latitude: Double,
        @Query("longitude") longitude: Double,
    ): ForecastResponseDto
}
