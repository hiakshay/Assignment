package com.akshay.truecallerassignment.di

import com.akshay.truecallerassignment.usecases.CharacterOperationUseCase
import com.akshay.truecallerassignment.usecases.CharacterOperationUseCaseImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityRetainedComponent
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(ActivityRetainedComponent::class)
object UseCaseModule {

    @Provides
    fun provideCharacterUseCase(
    ): CharacterOperationUseCase {
        return CharacterOperationUseCaseImpl()
    }
}
