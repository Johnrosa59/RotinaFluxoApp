package com.joaorosa.routineflow.domain.usecase

import com.joaorosa.routineflow.domain.model.Habit
import com.joaorosa.routineflow.domain.repository.HabitRepository

class DeleteHabitUseCase(private val repository: HabitRepository) {
    suspend operator fun invoke(habit: Habit) {
        repository.deleteHabit(habit)
    }
}
