package com.robertadebenedictis.peakwise

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.robertadebenedictis.peakwise.navigation.AppNavigation

@Composable
fun PeakwiseApp() {
    Scaffold(
        modifier = Modifier.fillMaxSize()
    ) { innerPadding ->
        AppNavigation()
    }
}