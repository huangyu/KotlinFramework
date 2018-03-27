package com.huangyu.kotlinframework.ui.main.model

import com.huangyu.kotlinframework.data.bean.Weather
import com.huangyu.kotlinframework.data.bean.WeatherResult
import com.huangyu.kotlinframework.mvp.IModel
import io.reactivex.Observable

/**
 * Created by huangyu on 2018/3/19.
 */
interface IMainModel : IModel {

    fun isEmpty(): Observable<Boolean>

    fun queryWeatherFromWeb(location: String): Observable<WeatherResult>

    fun queryWeatherFromDb(): Observable<List<Weather>>

    fun insertWeather(list: List<Weather>)

}