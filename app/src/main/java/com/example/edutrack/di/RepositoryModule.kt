package com.example.edutrack.di

import com.example.edutrack.data.repository.SessionRepositoryImp
import com.example.edutrack.data.repository.SubjectRepositoryImp
import com.example.edutrack.data.repository.TaskRepositoryImp
import com.example.edutrack.domain.repository.SessionRepository
import com.example.edutrack.domain.repository.SubjectRepository
import com.example.edutrack.domain.repository.TaskRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Singleton
    @Binds
    abstract fun bindSubjectRepository(
        impl: SubjectRepositoryImp
    ): SubjectRepository

    @Singleton
    @Binds
    abstract fun bindTaskRepository(
        impl: TaskRepositoryImp
    ): TaskRepository

    @Singleton
    @Binds
    abstract fun bindSessionRepository(
        impl: SessionRepositoryImp
    ): SessionRepository
}