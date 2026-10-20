package com.robertadebenedictis.peakwise.feature.explore.data.repository

import com.robertadebenedictis.peakwise.feature.explore.data.remote.GeocodingApi
import com.robertadebenedictis.peakwise.feature.explore.domain.repository.LocationSearchRepository
import javax.inject.Inject

class LocationSearchRepositoryImpl @Inject constructor(
    private val geocodingApi: GeocodingApi
): LocationSearchRepository {
}