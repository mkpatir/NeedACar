package com.mkpatir.needacar.ui.membership

import androidx.activity.viewModels
import com.mkpatir.needacar.R
import com.mkpatir.needacar.databinding.ActivityMembershipBinding
import com.mkpatir.needacar.ui.base.BaseActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MemberShipActivity: BaseActivity<ActivityMembershipBinding,MemberShipViewModel>() {

    override fun setLayout(): Int = R.layout.activity_membership

    override fun setViewModel(): Lazy<MemberShipViewModel> = viewModels()

    override fun setupUI() {

    }

    override fun onEnterAnimationComplete() {
        super.onEnterAnimationComplete()
        getDataBinding().buttonContinue.playAnimation()
    }
}