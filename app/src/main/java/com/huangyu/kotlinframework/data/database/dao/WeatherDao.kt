package com.huangyu.kotlinframework.data.database.dao

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.OnConflictStrategy
import android.arch.persistence.room.Query
import com.huangyu.kotlinframework.data.bean.Weather

/**
 * Created by huangyu on 2018/3/26.
 */
@Dao
interface WeatherDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(options: List<Weather>)

    @Query("SELECT * FROM Weather WHERE id = :id")
    fun loadById(id: Long): List<Weather>

    @Query("SELECT * FROM Weather")
    fun loadAll(): List<Weather>
}