package com.robertadebenedictis.peakwise.feature.explore.presentation

import android.util.Log
import androidx.lifecycle.ViewModel
import com.robertadebenedictis.peakwise.feature.explore.domain.repository.LocationSearchRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class ExploreViewModel @Inject constructor(
    private val locationSearchRepository: LocationSearchRepository
) : ViewModel() {

}