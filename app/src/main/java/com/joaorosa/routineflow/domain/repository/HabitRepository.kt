package com.joaorosa.routineflow.domain.repository

import androidx.lifecycle.LiveData
import com.joaorosa.routineflow.domain.model.Habit

interface HabitRepository {
    fun getAllHabits(): LiveData<List<Habit>>
    suspend fun insertHabit(habit: Habit)
    suspend fun updateHabit(habit: Habit)
    suspend fun deleteHabit(habit: Habit)
}
