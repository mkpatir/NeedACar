package com.mkpatir.needacar.ui.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment

abstract class BaseFragment<D: ViewDataBinding>: Fragment() {

    private lateinit var dataBinding: D

    abstract fun setLayout(): Int

    abstract fun setupUI()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        dataBinding = DataBindingUtil.inflate(inflater,setLayout(),container,false)
        return dataBinding.root
    }

    fun getDataBinding() = dataBinding
}