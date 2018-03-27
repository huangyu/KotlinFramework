package com.mindorks.framework.mvp.data.database.repository.options

import com.huangyu.kotlinframework.data.bean.Weather
import com.huangyu.kotlinframework.data.database.dao.WeatherDao
import io.reactivex.Observable
import io.reactivex.Single
import javax.inject.Inject

/**
 * Created by huangyu on 2018/3/26.
 */
class WeatherRepo @Inject constructor(private val dao: WeatherDao) : IRepo<Weather> {

    override fun isEmpty(): Observable<Boolean> = Observable.fromCallable({ dao.loadAll().isEmpty() })

    override fun insertAll(list: List<Weather>) {
        dao.insertAll(list)
    }

    override fun loadAll(): Observable<List<Weather>> {
        return Observable.fromCallable({ dao.loadAll() })
    }

    override fun loadById(id: Long): Single<List<Weather>> = Single.fromCallable({ dao.loadById(id) })

}