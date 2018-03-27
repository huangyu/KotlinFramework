package com.huangyu.kotlinframework.data.database.converter

import android.arch.persistence.room.TypeConverter
import com.google.gson.Gson
import com.huangyu.kotlinframework.data.bean.Location

/**
 * Created by huangyu on 2018/3/27.
 */
class LocationConverter {

    @TypeConverter
    fun toJson(location: Location): String {
        val gson = Gson()
        return gson.toJson(location)
    }

    @TypeConverter
    fun fromJson(json: String): Location {
        val gson = Gson()
        return gson.fromJson(json, Location::class.java)
    }

}