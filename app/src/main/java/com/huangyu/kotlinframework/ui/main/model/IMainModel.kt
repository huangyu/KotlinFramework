package com.huangyu.kotlinframework.ui.main.model

import com.huangyu.kotlinframework.data.bean.WeatherResult
import com.huangyu.kotlinframework.mvp.IModel
import io.reactivex.Observable

/**
 * Created by huangyu on 2018/3/19.
 */
interface IMainModel : IModel {

    fun queryWeather(location: String): Observable<WeatherResult>

}