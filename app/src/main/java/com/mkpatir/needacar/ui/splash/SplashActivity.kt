package com.mkpatir.needacar.ui.splash

import androidx.activity.viewModels
import com.mkpatir.needacar.R
import com.mkpatir.needacar.databinding.ActivitySplashBinding
import com.mkpatir.needacar.internal.extension.doOnAnimationEnd
import com.mkpatir.needacar.ui.main.MainActivity
import com.mkpatir.needacar.ui.base.BaseActivity
import com.mkpatir.needacar.ui.base.EmptyViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SplashActivity: BaseActivity<ActivitySplashBinding,EmptyViewModel>() {

    override fun setLayout(): Int = R.layout.activity_splash

    override fun setViewModel(): Lazy<EmptyViewModel> = viewModels()

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