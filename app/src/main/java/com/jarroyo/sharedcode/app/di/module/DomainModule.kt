package com.jarroyo.sharedcode.app.di.module

import com.jarroyo.sharedcode.di.InjectorCommon
import com.jarroyo.sharedcode.source.disk.DbArgs
import dagger.Module
import dagger.Provides
import javax.inject.Singleton


@Module
class DomainModule {

    /**
     * LOCATION
     */


    @Provides
    @Singleton
    fun provideSaveLocationUseCase(dbArgs: DbArgs) = InjectorCommon.provideSaveLocationUseCase(dbArgs)

    @Provides
    @Singleton
    fun provideDeleteLocationUseCase(dbArgs: DbArgs) = InjectorCommon.provideDeleteLocationUseCase(dbArgs)


    @Provides
    @Singleton
    fun provideGetLocationMPPListUseCase(dbArgs: DbArgs) = InjectorCommon.provideGetLocationMPPUseCase(dbArgs)

    /**
     * WEATHER
     */
    @Provides
    @Singleton
    fun provideGetWeatherUseCase() = InjectorCommon.provideGetWeatherUseCase()

    @Provides
    @Singleton
    fun provideGetWeatherListUseCase() = InjectorCommon.provideGetWeatherListUseCase()
}