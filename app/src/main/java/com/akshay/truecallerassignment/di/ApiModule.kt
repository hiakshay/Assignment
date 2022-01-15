package com.akshay.truecallerassignment.di

import com.akshay.truecallerassignment.network.api.TrueCallerContentAPI
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityRetainedComponent
import retrofit2.Retrofit

@Module
@InstallIn(ActivityRetainedComponent::class)
object ApiModule {

    @Provides
    fun providesTrueCallerContentApi(
        retrofit: Retrofit
    ): TrueCallerContentAPI {
        return retrofit.create(TrueCallerContentAPI::class.java)
    }

}