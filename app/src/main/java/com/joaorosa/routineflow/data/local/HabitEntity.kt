package com.joaorosa.routineflow.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.joaorosa.routineflow.domain.model.Habit

@Entity(tableName = "habits")
data class HabitEntity(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val title: String,
    val isCompleted: Boolean
)

fun HabitEntity.toDomain() = Habit(id = id, title = title, isCompleted = isCompleted)
fun Habit.toEntity() = HabitEntity(id = id, title = title, isCompleted = isCompleted)
