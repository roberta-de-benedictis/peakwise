package com.robertadebenedictis.peakwise.feature.explore.domain.model

data class Location(
    val id: Long,
    val name: String,
    val latitude: Double,
    val longitude: Double,
    val elevation: Double?,
    val country: String? = null,
    val region: String?,
)
