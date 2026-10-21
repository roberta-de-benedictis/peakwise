package com.robertadebenedictis.peakwise.feature.explore.domain.usecase

import com.robertadebenedictis.peakwise.feature.explore.domain.model.Location
import com.robertadebenedictis.peakwise.feature.explore.domain.repository.LocationSearchRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject
import com.robertadebenedictis.peakwise.core.common.result.Result

class SearchLocationsUseCase @Inject constructor(
    private val repository: LocationSearchRepository
) {
    operator fun invoke(query: String): Flow<Result<List<Location>>> {
        return repository.searchLocations(query)
    }
}