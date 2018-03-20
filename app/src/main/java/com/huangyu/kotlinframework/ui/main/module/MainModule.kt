package com.huangyu.kotlinframework.ui.main.module

import com.huangyu.kotlinframework.ui.main.model.IMainModel
import com.huangyu.kotlinframework.ui.main.model.MainModel
import com.huangyu.kotlinframework.ui.main.presenter.IMainPresenter
import com.huangyu.kotlinframework.ui.main.presenter.MainPresenter
import com.huangyu.kotlinframework.ui.main.view.IMainView
import dagger.Module
import dagger.Provides

/**
 * Created by huangyu on 2018/3/19.
 */
@Module
class MainModule {

    @Provides
    internal fun provideMainModel(model: MainModel): IMainModel = model

    @Provides
    internal fun provideMainPresenter(presenter: MainPresenter<IMainView, IMainModel>): IMainPresenter<IMainView, IMainModel> = presenter

}