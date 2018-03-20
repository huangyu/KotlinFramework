package com.huangyu.kotlinframework.ui.main.presenter

import com.huangyu.kotlinframework.mvp.BasePresenter
import com.huangyu.kotlinframework.ui.main.model.IMainModel
import com.huangyu.kotlinframework.ui.main.view.IMainView
import com.huangyu.kotlinframework.util.SchedulerProvider
import io.reactivex.disposables.CompositeDisposable
import javax.inject.Inject

/**
 * Created by huangyu on 2018/3/19.
 */
class MainPresenter<V : IMainView, M : IMainModel> @Inject internal constructor(model: M, schedulerProvider: SchedulerProvider, disposable: CompositeDisposable) : BasePresenter<V, M>(model = model, schedulerProvider = schedulerProvider, compositeDisposable = disposable), IMainPresenter<V, M> {

}