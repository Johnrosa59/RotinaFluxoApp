package com.joaorosa.routineflow.di

import android.app.Application
import androidx.room.Room
import com.joaorosa.routineflow.data.local.HabitDatabase
import com.joaorosa.routineflow.data.repository.HabitRepositoryImpl
import com.joaorosa.routineflow.domain.repository.HabitRepository
import com.joaorosa.routineflow.domain.usecase.AddHabitUseCase
import com.joaorosa.routineflow.domain.usecase.DeleteHabitUseCase
import com.joaorosa.routineflow.domain.usecase.GetHabitsUseCase
import com.joaorosa.routineflow.domain.usecase.HabitUseCases
import com.joaorosa.routineflow.domain.usecase.ToggleHabitUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideHabitDatabase(app: Application): HabitDatabase {
        return Room.databaseBuilder(
            app,
            HabitDatabase::class.java,
            "habit_db"
        ).build()
    }

    @Provides
    @Singleton
    fun provideHabitRepository(db: HabitDatabase): HabitRepository {
        return HabitRepositoryImpl(db.habitDao)
    }

    @Provides
    @Singleton
    fun provideHabitUseCases(repository: HabitRepository): HabitUseCases {
        return HabitUseCases(
            getHabits = GetHabitsUseCase(repository),
            addHabit = AddHabitUseCase(repository),
            toggleHabit = ToggleHabitUseCase(repository),
            deleteHabit = DeleteHabitUseCase(repository)
        )
    }
}
