package com.robertadebenedictis.peakwise.feature.explore.presentation

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.robertadebenedictis.peakwise.feature.explore.domain.usecase.SearchLocationsUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject
import com.robertadebenedictis.peakwise.core.common.result.Result

@HiltViewModel
class ExploreViewModel @Inject constructor(
    private val searchLocationsUseCase: SearchLocationsUseCase
) : ViewModel() {

    private val _uiState = MutableStateFlow<ExploreUiState>(ExploreUiState.Idle)
    val uiState: StateFlow<ExploreUiState> = _uiState.asStateFlow()

    fun onSearchQuery(query: String) {
        if(query.isBlank()) {
            _uiState.value = ExploreUiState.Idle
            return
        }

        searchLocationsUseCase(query)
            .onEach { result ->
                _uiState.value = when (result) {
                    is Result.Loading -> ExploreUiState.Loading
                    is Result.Success -> ExploreUiState.Success(result.data)
                    is Result.Error -> {
                        val message = result.exception.localizedMessage ?: "Unknown error"
                        ExploreUiState.Error(message)
                    }
                }
            }
            .launchIn(viewModelScope)
    }

}