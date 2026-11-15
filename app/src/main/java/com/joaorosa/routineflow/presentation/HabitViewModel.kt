package com.joaorosa.routineflow.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.joaorosa.routineflow.domain.model.Habit
import com.joaorosa.routineflow.domain.usecase.HabitUseCases
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HabitViewModel @Inject constructor(
    private val useCases: HabitUseCases
) : ViewModel() {

    val habits: LiveData<List<Habit>> = useCases.getHabits()

    fun addHabit(title: String) {
        viewModelScope.launch {
            useCases.addHabit(title)
        }
    }

    fun toggleHabit(habit: Habit) {
        viewModelScope.launch {
            useCases.toggleHabit(habit)
        }
    }

    fun deleteHabit(habit: Habit) {
        viewModelScope.launch {
            useCases.deleteHabit(habit)
        }
    }
}
