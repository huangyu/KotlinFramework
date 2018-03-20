package com.huangyu.kotlinframework.ui.main

import android.os.Bundle
import com.huangyu.kotlinframework.R
import com.huangyu.kotlinframework.base.BaseActivity
import com.huangyu.kotlinframework.ui.main.model.IMainModel
import com.huangyu.kotlinframework.ui.main.presenter.MainPresenter
import com.huangyu.kotlinframework.ui.main.view.IMainView
import javax.inject.Inject

class MainActivity : BaseActivity(), IMainView {

    @Inject
    internal lateinit var presenter: MainPresenter<IMainView, IMainModel>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        presenter.onAttach(this)
    }

    override fun onDestroy() {
        presenter.onDetach()
        super.onDestroy()
    }

}
