package com.mkpatir.needacar.ui.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding

abstract class BaseActivity<D: ViewDataBinding>: AppCompatActivity() {

    private lateinit var dataBinding: D

    abstract fun setLayout(): Int

    abstract fun setupUI()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        dataBinding = DataBindingUtil.setContentView(this,setLayout())
        setupUI()
    }

    fun getDataBinding() = dataBinding
}