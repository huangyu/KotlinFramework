package com.mindorks.framework.mvp.data.database.repository.options

import io.reactivex.Observable
import io.reactivex.Single

/**
 * Created by huangyu on 2018/3/26.
 */
interface IRepo<T> {

    fun isEmpty():  Observable<Boolean>

    fun insertAll(list: List<T>)

    fun loadById(id: Long): Single<List<T>>

    fun loadAll(): Observable<List<T>>

}