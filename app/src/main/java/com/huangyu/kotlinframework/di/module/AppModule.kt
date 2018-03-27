package com.huangyu.kotlinframework.di.module

import android.app.Application
import android.arch.persistence.room.Room
import android.content.Context
import com.huangyu.kotlinframework.data.database.AppDatabase
import com.huangyu.kotlinframework.data.network.ApiClient
import com.huangyu.kotlinframework.data.network.ApiService
import com.huangyu.kotlinframework.util.AppConstants
import com.huangyu.kotlinframework.util.SchedulerProvider
import com.mindorks.framework.mvp.data.database.repository.options.WeatherRepo
import dagger.Module
import dagger.Provides
import io.reactivex.disposables.CompositeDisposable
import javax.inject.Singleton

/**
 * Created by huangyu on 2018/3/19.
 */
@Module
class AppModule {

    @Provides
    @Singleton
    internal fun provideContext(application: Application): Context = application

    @Provides
    @Singleton
    internal fun provideApiClient(apiClient: ApiClient): ApiService = apiClient.create()

    @Provides
    @Singleton
    internal fun provideAppDatabase(context: Context): AppDatabase =
            Room.databaseBuilder(context, AppDatabase::class.java, AppConstants.DB_NAME).build()

    @Provides
    @Singleton
    internal fun provideWeatherRepo(appDatabase: AppDatabase): WeatherRepo = WeatherRepo(appDatabase.weatherDao())

    @Provides
    internal fun provideCompositeDisposable(): CompositeDisposable = CompositeDisposable()

    @Provides
    internal fun provideSchedulerProvider(): SchedulerProvider = SchedulerProvider()

}