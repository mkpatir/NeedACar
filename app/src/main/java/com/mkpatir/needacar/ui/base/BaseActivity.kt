package com.mkpatir.needacar.ui.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding

abstract class BaseActivity<D: ViewDataBinding,VM: BaseViewModel>: AppCompatActivity() {

    private lateinit var dataBinding: D
    private lateinit var viewModel: VM

    abstract fun setLayout(): Int

    abstract fun setViewModel(): Lazy<VM>

    abstract fun setupUI()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        dataBinding = DataBindingUtil.setContentView(this,setLayout())
        setupUI()
    }

    fun getDataBinding() = dataBinding

    fun getViewModel() = setViewModel().value
}