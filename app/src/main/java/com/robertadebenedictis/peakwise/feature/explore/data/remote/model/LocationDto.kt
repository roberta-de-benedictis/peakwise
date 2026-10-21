package com.robertadebenedictis.peakwise.feature.explore.data.remote.model

import kotlinx.serialization.Serializable

@Serializable
data class LocationDto (
    val id: Long? = null,
    val name: String? = null,
    val latitude: Double? = null,
    val longitude: Double? = null,
    val elevation: Double? = null,
    val country: String? = null,
    val admin1: String? = null
)