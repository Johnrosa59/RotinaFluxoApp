package com.joaorosa.routineflow.domain.model

data class Habit(
    val id: Int = 0,
    val title: String,
    val isCompleted: Boolean = false
)
