package com.huangyu.kotlinframework.data.bean

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import android.arch.persistence.room.TypeConverters
import com.google.gson.annotations.Expose
import com.huangyu.kotlinframework.data.database.converter.LocationConverter
import com.huangyu.kotlinframework.data.database.converter.NowConverter

/**
 * Created by huangyu on 2018/3/20.
 */
@Entity(tableName = "Weather")
data class Weather(
        @Expose
        @PrimaryKey(autoGenerate = true)
        var id: Long,

        @Expose
        @TypeConverters(NowConverter::class)
        var now: Now,

        @Expose
        @TypeConverters(LocationConverter::class)
        var location: Location,

        @Expose
        var last_update: String
)