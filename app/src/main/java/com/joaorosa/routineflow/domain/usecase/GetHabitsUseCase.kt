package com.joaorosa.routineflow.domain.usecase

import com.joaorosa.routineflow.domain.repository.HabitRepository

class GetHabitsUseCase(private val repository: HabitRepository) {
    operator fun invoke() = repository.getAllHabits()
}
