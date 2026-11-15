package com.joaorosa.routineflow

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.joaorosa.routineflow.presentation.HabitScreen
import com.joaorosa.routineflow.ui.theme.RoutineFlowTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RoutineFlowTheme {
                HabitScreen()
            }
        }
    }
}
