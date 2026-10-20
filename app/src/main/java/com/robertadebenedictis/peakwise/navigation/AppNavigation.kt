package com.robertadebenedictis.peakwise.navigation

import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.entryProvider
import androidx.navigation3.runtime.rememberNavBackStack
import androidx.navigation3.ui.NavDisplay
import com.robertadebenedictis.peakwise.feature.explore.presentation.ExploreScreen

@Composable
fun AppNavigation() {
    val backStack = rememberNavBackStack(ExploreRoute)

    NavDisplay(
        backStack = backStack,
        onBack = { backStack.removeLastOrNull() },
        entryProvider = entryProvider {
            entry<ExploreRoute> {
                ExploreScreen()
            }
        }
    )
}