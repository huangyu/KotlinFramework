package com.huangyu.kotlinframework.data.database

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import android.arch.persistence.room.TypeConverters
import com.huangyu.kotlinframework.data.bean.Weather
import com.huangyu.kotlinframework.data.database.converter.LocationConverter
import com.huangyu.kotlinframework.data.database.converter.NowConverter
import com.huangyu.kotlinframework.data.database.dao.WeatherDao

/**
 * Created by huangyu on 2018/3/26.
 */
@Database(entities = [(Weather::class)], version = 1)
@TypeConverters(NowConverter::class, LocationConverter::class)
abstract class AppDatabase : RoomDatabase() {

    abstract fun weatherDao(): WeatherDao

}