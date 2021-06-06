package com.mkpatir.needacar.ui.splash

import com.mkpatir.needacar.R
import com.mkpatir.needacar.databinding.ActivitySplashBinding
import com.mkpatir.needacar.ui.base.BaseActivity

class SplashActivity: BaseActivity<ActivitySplashBinding>() {

    override fun setLayout(): Int = R.layout.activity_splash

    override fun setupUI() {

    }

    override fun onEnterAnimationComplete() {
        super.onEnterAnimationComplete()
        getDataBinding().lottieView.playAnimation()
    }
}