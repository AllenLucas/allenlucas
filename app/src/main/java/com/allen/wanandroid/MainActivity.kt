package com.allen.wanandroid

import android.util.Log
import com.allen.wanandroid.base.BaseActivity

class MainActivity : BaseActivity() {
    override fun getLayout() = R.layout.activity_main

    override fun initView() {
    }

    override fun initListener() {
    }

    override fun initData() {
    }

    override fun onBackPressed() {
        super.onBackPressed()
        Log.e("lal","onbackpress")
    }
}
