package com.huangyu.kotlinframework.ui.main.model

import com.huangyu.kotlinframework.data.bean.WeatherResult
import com.huangyu.kotlinframework.data.network.Api
import com.huangyu.kotlinframework.data.network.ApiClient
import com.huangyu.kotlinframework.mvp.BaseModel
import io.reactivex.Observable
import javax.inject.Inject

/**
 * Created by huangyu on 2018/3/19.
 */
class MainModel @Inject internal constructor() : BaseModel(), IMainModel {

    override fun queryWeather(location: String): Observable<WeatherResult> {
        return ApiClient.create().loadData(Api.API_SERVER_KEY, location)
    }

}