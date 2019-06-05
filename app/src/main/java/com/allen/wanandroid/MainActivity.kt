package com.allen.wanandroid

import android.view.MenuItem
import androidx.navigation.Navigation
import androidx.navigation.Navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.allen.wanandroid.base.BaseActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {
    override fun getLayout() = R.layout.activity_main

    override fun initView() {
        val navController = findNavController(this, R.id.fragment_splash)
        NavigationUI.setupWithNavController(activity_navigation_view, navController)
    }

    override fun initListener() {
    }

    override fun initData() {
    }

    override fun onSupportNavigateUp(): Boolean {
        return Navigation.findNavController(this, R.id.fragment_splash).navigateUp()
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return NavigationUI.onNavDestinationSelected(
            item,
            Navigation.findNavController(this, R.id.fragment_splash)
        ) || super.onOptionsItemSelected(item)
    }
}
