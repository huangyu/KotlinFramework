package com.huangyu.kotlinframework.base

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.huangyu.kotlinframework.mvp.IView
import dagger.android.AndroidInjection

/**
 * Created by huangyu on 2018/3/19.
 */
abstract class BaseActivity : AppCompatActivity(), IView {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AndroidInjection.inject(this)
    }

    override fun showProgress() {
    }

    override fun hideProgress() {
    }

}