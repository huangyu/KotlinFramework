package com.huangyu.kotlinframework.ui.main

import android.os.Bundle
import com.huangyu.kotlinframework.R
import com.huangyu.kotlinframework.base.BaseActivity
import com.huangyu.kotlinframework.ui.main.model.IMainModel
import com.huangyu.kotlinframework.ui.main.presenter.MainPresenter
import com.huangyu.kotlinframework.ui.main.view.IMainView
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : BaseActivity(), IMainView {

    @Inject
    internal lateinit var presenter: MainPresenter<IMainView, IMainModel>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        presenter.onAttach(this)
    }

    override fun onResume() {
        super.onResume()
        presenter.queryWeather("101280101")
    }

    override fun showText(text: String) {
        tv_text.text = text
    }

    override fun onDestroy() {
        presenter.onDetach()
        super.onDestroy()
    }

}
