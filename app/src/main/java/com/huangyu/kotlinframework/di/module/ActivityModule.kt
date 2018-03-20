package com.huangyu.kotlinframework.di.module

import com.huangyu.kotlinframework.ui.main.MainActivity
import com.huangyu.kotlinframework.ui.main.module.MainModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Created by huangyu on 2018/3/19.
 */
@Module
abstract class ActivityModule {

    @ContributesAndroidInjector(modules = [(MainModule::class)])
    abstract fun bindMainActivity(): MainActivity

}