package com.akshay.truecallerassignment.di

import com.akshay.truecallerassignment.network.api.TrueCallerContentAPI
import com.akshay.truecallerassignment.repository.MainRepository
import com.akshay.truecallerassignment.repository.MainRepositoryImpl
import com.akshay.truecallerassignment.usecases.CharacterOperationUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityRetainedComponent

@Module
@InstallIn(ActivityRetainedComponent::class)
object RepositoryModule {

    @Provides
    fun provideMainRepository(
        trueCallerContentAPI: TrueCallerContentAPI,
        characterOperationUseCase: CharacterOperationUseCase
    ): MainRepository {
        return MainRepositoryImpl(
            trueCallerContentAPI,
            characterOperationUseCase
        )
    }
}
