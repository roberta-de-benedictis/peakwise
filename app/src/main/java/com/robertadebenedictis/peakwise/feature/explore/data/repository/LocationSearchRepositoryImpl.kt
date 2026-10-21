package com.robertadebenedictis.peakwise.feature.explore.data.repository

import com.robertadebenedictis.peakwise.core.common.result.asResult
import com.robertadebenedictis.peakwise.feature.explore.data.remote.api.GeocodingApi
import com.robertadebenedictis.peakwise.feature.explore.domain.model.Location
import com.robertadebenedictis.peakwise.feature.explore.domain.repository.LocationSearchRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject
import com.robertadebenedictis.peakwise.core.common.result.Result
import com.robertadebenedictis.peakwise.feature.explore.data.mapper.toDomainModel
import com.robertadebenedictis.peakwise.feature.explore.data.remote.model.GeocodingResponseDto

class LocationSearchRepositoryImpl @Inject constructor(
    private val geocodingApi: GeocodingApi
): LocationSearchRepository {
    override fun searchLocations(query: String): Flow<Result<List<Location>>> = flow {
        val response: GeocodingResponseDto = geocodingApi.searchLocations(name = query)
        val locations = response.results?.map { it.toDomainModel() } ?: emptyList()
        emit(locations)
    }.asResult()
}