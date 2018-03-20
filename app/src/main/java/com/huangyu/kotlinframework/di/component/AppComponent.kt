package com.huangyu.kotlinframework.di.component

import android.app.Application
import com.huangyu.kotlinframework.base.BaseApplication
import com.huangyu.kotlinframework.di.module.ActivityModule
import com.huangyu.kotlinframework.di.module.AppModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import javax.inject.Singleton

/**
 * Created by huangyu on 2018/3/19.
 */
@Singleton
@Component(modules = [(AndroidInjectionModule::class), (AppModule::class), (ActivityModule::class)])
interface AppComponent {

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppComponent
    }

    fun inject(app: BaseApplication)

}