package com.huangyu.kotlinframework.ui.main.model

import com.huangyu.kotlinframework.data.bean.Weather
import com.huangyu.kotlinframework.data.bean.WeatherResult
import com.huangyu.kotlinframework.data.network.ApiService
import com.huangyu.kotlinframework.mvp.BaseModel
import com.huangyu.kotlinframework.util.AppConstants
import com.mindorks.framework.mvp.data.database.repository.options.WeatherRepo
import io.reactivex.Observable
import javax.inject.Inject

/**
 * Created by huangyu on 2018/3/19.
 */
class MainModel @Inject internal constructor(private val service: ApiService, private val weatherRepo: WeatherRepo) : BaseModel(), IMainModel {

    override fun queryWeatherFromWeb(location: String): Observable<WeatherResult> = service.loadData(AppConstants.API_SERVER_KEY, location)

    override fun isEmpty(): Observable<Boolean> = weatherRepo.isEmpty()

    override fun queryWeatherFromDb(): Observable<List<Weather>> = weatherRepo.loadAll()

    override fun insertWeather(list: List<Weather>) {
        weatherRepo.insertAll(list)
    }

}