package com.robertadebenedictis.peakwise.feature.explore.presentation

import com.robertadebenedictis.peakwise.feature.explore.domain.model.Location

sealed interface ExploreUiState {
    data object Idle: ExploreUiState
    data object Loading: ExploreUiState
    data class Success(val locations: List<Location>): ExploreUiState
    data class Error(val message: String): ExploreUiState
}