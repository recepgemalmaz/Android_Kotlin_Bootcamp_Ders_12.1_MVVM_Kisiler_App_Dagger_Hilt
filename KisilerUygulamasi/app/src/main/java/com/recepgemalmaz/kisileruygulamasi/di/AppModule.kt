package com.recepgemalmaz.kisileruygulamasi.di

import com.recepgemalmaz.kisileruygulamasi.data.datasource.KisilerDataSources
import com.recepgemalmaz.kisileruygulamasi.data.repo.KisilerRopository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {

    @Provides
    @Singleton
    fun provideKisilerRepository(kds :KisilerDataSources) : KisilerRopository {
        return KisilerRopository(kds)

    }

    @Provides
    @Singleton
    fun provideKisilerDataSources() : KisilerDataSources {
        return KisilerDataSources()
    }


}