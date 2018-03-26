package com.huangyu.kotlinframework.data.network

import com.huangyu.kotlinframework.data.bean.WeatherResult
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Created by huangyu on 2018/3/20.
 */
interface ApiService {

    @GET("weather/now.json")
    fun loadData(@Query("key") key: String, @Query("location") location: String): Observable<WeatherResult>

}