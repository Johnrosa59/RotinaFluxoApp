package com.joaorosa.routineflow.domain.usecase

import com.joaorosa.routineflow.domain.model.Habit
import com.joaorosa.routineflow.domain.repository.HabitRepository

class AddHabitUseCase(private val repository: HabitRepository) {
    suspend operator fun invoke(title: String) {
        if (title.isNotBlank()) {
            repository.insertHabit(Habit(title = title.trim()))
        }
    }
}
