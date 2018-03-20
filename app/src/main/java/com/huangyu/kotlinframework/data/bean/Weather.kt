package com.huangyu.kotlinframework.data.bean

/**
 * Created by huangyu on 2018/3/20.
 */
data class Weather(
        var location: Location,
        var now: Now,
        var last_update: String
)