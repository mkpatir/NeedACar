package com.mkpatir.needacar.ui

import android.content.Context
import android.content.Intent
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.mkpatir.needacar.R
import com.mkpatir.needacar.databinding.ActivityMainBinding
import com.mkpatir.needacar.ui.base.BaseActivity

class MainActivity : BaseActivity<ActivityMainBinding>() {

    companion object {
        fun newIntent(context: Context) = Intent(context,MainActivity::class.java)
    }

    override fun setLayout(): Int = R.layout.activity_main

    override fun setupUI() {
        getDataBinding().bottomNavView.setupWithNavController((supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment).navController)
    }
}