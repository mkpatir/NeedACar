package com.mkpatir.needacar.ui.profile

import androidx.fragment.app.viewModels
import com.mkpatir.needacar.R
import com.mkpatir.needacar.databinding.FragmentProfileBinding
import com.mkpatir.needacar.ui.base.BaseFragment
import com.mkpatir.needacar.ui.base.EmptyViewModel

class ProfileFragment: BaseFragment<FragmentProfileBinding,EmptyViewModel>() {

    override fun setLayout(): Int = R.layout.fragment_profile

    override fun setViewModel(): Lazy<EmptyViewModel> = viewModels()

    override fun setupUI() {

    }
}