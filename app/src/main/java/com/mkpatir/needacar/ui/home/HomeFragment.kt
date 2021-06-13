package com.mkpatir.needacar.ui.home

import androidx.fragment.app.viewModels
import com.mkpatir.needacar.R
import com.mkpatir.needacar.databinding.FragmentHomeBinding
import com.mkpatir.needacar.ui.base.BaseFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeFragment: BaseFragment<FragmentHomeBinding,HomeViewModel>() {

    override fun setLayout(): Int = R.layout.fragment_home

    override fun setViewModel(): Lazy<HomeViewModel> = viewModels()

    override fun setupUI() {

    }

}