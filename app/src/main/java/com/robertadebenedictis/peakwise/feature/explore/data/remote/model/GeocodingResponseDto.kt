package com.robertadebenedictis.peakwise.feature.explore.data.remote.model

import kotlinx.serialization.Serializable

@Serializable
data class GeocodingResponseDto(
    val results: List<LocationDto>? = null
)