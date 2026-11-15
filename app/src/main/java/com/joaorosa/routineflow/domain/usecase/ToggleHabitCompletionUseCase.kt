package com.joaorosa.routineflow.domain.usecase

import com.joaorosa.routineflow.domain.model.Habit
import com.joaorosa.routineflow.domain.repository.HabitRepository

class ToggleHabitUseCase(private val repository: HabitRepository) {
    suspend operator fun invoke(habit: Habit) {
        repository.updateHabit(habit.copy(isCompleted = !habit.isCompleted))
    }
}
