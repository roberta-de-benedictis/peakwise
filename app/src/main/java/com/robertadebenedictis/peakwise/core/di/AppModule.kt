package com.robertadebenedictis.peakwise.core.di

import com.robertadebenedictis.peakwise.feature.explore.data.repository.LocationSearchRepositoryImpl
import com.robertadebenedictis.peakwise.feature.explore.domain.repository.LocationSearchRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object Module {

    @Provides
    @Singleton
    fun provideLocationSearchRepository(): LocationSearchRepository {
        return LocationSearchRepositoryImpl()
    }
}