package com.huangyu.kotlinframework.data.database.converter

import android.arch.persistence.room.TypeConverter
import com.google.gson.Gson
import com.huangyu.kotlinframework.data.bean.Now

/**
 * Created by huangyu on 2018/3/27.
 */
class NowConverter {

    @TypeConverter
    fun toJson(now: Now): String {
        val gson = Gson()
        return gson.toJson(now)
    }

    @TypeConverter
    fun fromJson(json: String): Now {
        val gson = Gson()
        return gson.fromJson(json, Now::class.java)
    }

}