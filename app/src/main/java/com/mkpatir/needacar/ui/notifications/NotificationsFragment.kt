package com.mkpatir.needacar.ui.notifications

import androidx.fragment.app.viewModels
import com.mkpatir.needacar.R
import com.mkpatir.needacar.databinding.FragmentNotificationsBinding
import com.mkpatir.needacar.ui.base.BaseFragment
import com.mkpatir.needacar.ui.base.EmptyViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class NotificationsFragment: BaseFragment<FragmentNotificationsBinding,EmptyViewModel>() {

    override fun setLayout(): Int = R.layout.fragment_notifications

    override fun setViewModel(): Lazy<EmptyViewModel> = viewModels()

    override fun setupUI() {

    }
}