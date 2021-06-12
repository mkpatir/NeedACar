package com.mkpatir.needacar.ui.membership

import com.mkpatir.needacar.R
import com.mkpatir.needacar.databinding.ActivityMembershipBinding
import com.mkpatir.needacar.ui.base.BaseActivity

class MemberShipActivity: BaseActivity<ActivityMembershipBinding>() {

    override fun setLayout(): Int = R.layout.activity_membership

    override fun setupUI() {

    }

    override fun onEnterAnimationComplete() {
        super.onEnterAnimationComplete()
        getDataBinding().buttonContinue.playAnimation()
    }
}