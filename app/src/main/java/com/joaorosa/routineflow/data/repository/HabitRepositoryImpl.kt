package com.joaorosa.routineflow.data.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.map
import com.joaorosa.routineflow.data.local.HabitDao
import com.joaorosa.routineflow.data.local.toDomain
import com.joaorosa.routineflow.data.local.toEntity
import com.joaorosa.routineflow.domain.model.Habit
import com.joaorosa.routineflow.domain.repository.HabitRepository

class HabitRepositoryImpl(
    private val dao: HabitDao
) : HabitRepository {

    override fun getAllHabits(): LiveData<List<Habit>> {
        return dao.getAllHabits().map { entities ->
            entities.map { it.toDomain() }
        }
    }

    override suspend fun insertHabit(habit: Habit) = dao.insertHabit(habit.toEntity())
    override suspend fun updateHabit(habit: Habit) = dao.updateHabit(habit.toEntity())
    override suspend fun deleteHabit(habit: Habit) = dao.deleteHabit(habit.toEntity())
}
