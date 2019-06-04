package com.allen.wanandroid.ui.fragment

import androidx.navigation.fragment.NavHostFragment
import com.allen.wanandroid.R
import com.allen.wanandroid.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_splash.*

class SplashFragment : BaseFragment() {
    override fun getLayout() = R.layout.fragment_splash

    override fun initView() {
    }

    override fun initListener() {
        tv_welcome.setOnClickListener {
            NavHostFragment.findNavController(this).navigate(R.id.action_splshFragment_to_homeFragment)
        }
    }

    override fun initData() {
    }
}