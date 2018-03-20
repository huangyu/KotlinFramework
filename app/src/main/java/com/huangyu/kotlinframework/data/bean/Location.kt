package com.huangyu.kotlinframework.data.bean

/**
 * Created by huangyu on 2018/3/20.
 */
data class Location(
        var id: String,
        var name: String,
        var country: String,
        var timezone: String,
        var timezone_offset: String
)