package com.mkpatir.needacar.ui.splash

import com.mkpatir.needacar.R
import com.mkpatir.needacar.databinding.ActivitySplashBinding
import com.mkpatir.needacar.internal.extension.doOnAnimationEnd
import com.mkpatir.needacar.ui.MainActivity
import com.mkpatir.needacar.ui.base.BaseActivity

class SplashActivity: BaseActivity<ActivitySplashBinding>() {

    override fun setLayout(): Int = R.layout.activity_splash

    override fun setupUI() {
        getDataBinding().lottieView.doOnAnimationEnd {
            startActivity(MainActivity.newIntent(this))
            finish()
        }
    }

    override fun onEnterAnimationComplete() {
        super.onEnterAnimationComplete()
        getDataBinding().lottieView.playAnimation()
    }
}