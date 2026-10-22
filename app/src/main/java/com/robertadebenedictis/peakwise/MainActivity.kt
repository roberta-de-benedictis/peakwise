package com.robertadebenedictis.peakwise

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.robertadebenedictis.peakwise.core.designsystem.theme.PeakwiseTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // enableEdgeToEdge()
        setContent {
            PeakwiseTheme {
                PeakwiseApp()
            }
        }
    }
}
