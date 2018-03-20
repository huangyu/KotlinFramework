package com.huangyu.kotlinframework.ui.main.presenter

import com.huangyu.kotlinframework.mvp.IPresenter
import com.huangyu.kotlinframework.ui.main.model.IMainModel
import com.huangyu.kotlinframework.ui.main.view.IMainView

/**
 * Created by huangyu on 2018/3/19.
 */
interface IMainPresenter<V : IMainView, M : IMainModel> : IPresenter<V, M> {

    fun queryWeather(location: String)

}