package com.joaorosa.routineflow.domain.usecase

data class HabitUseCases(
    val getHabits: GetHabitsUseCase,
    val addHabit: AddHabitUseCase,
    val toggleHabit: ToggleHabitUseCase,
    val deleteHabit: DeleteHabitUseCase
)
