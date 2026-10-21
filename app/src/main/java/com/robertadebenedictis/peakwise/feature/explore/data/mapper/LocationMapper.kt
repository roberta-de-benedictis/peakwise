package com.robertadebenedictis.peakwise.feature.explore.data.mapper

import com.robertadebenedictis.peakwise.feature.explore.data.remote.model.LocationDto
import com.robertadebenedictis.peakwise.feature.explore.domain.model.Location

fun LocationDto.toDomainModel(): Location =
    Location(
        id = id ?: 0L,
        name = name.orEmpty(),
        latitude = latitude ?: 0.0,
        longitude = longitude ?: 0.0,
        elevation = elevation,
        country = country,
        region = admin1
    )