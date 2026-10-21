package com.robertadebenedictis.peakwise.feature.explore.domain.repository

import com.robertadebenedictis.peakwise.feature.explore.domain.model.Location
import kotlinx.coroutines.flow.Flow
import com.robertadebenedictis.peakwise.core.common.result.Result

interface LocationSearchRepository {
    fun searchLocations(query: String): Flow<Result<List<Location>>>
}