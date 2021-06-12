package com.mkpatir.needacar.internal.extension

import android.animation.Animator
import com.airbnb.lottie.LottieAnimationView

fun LottieAnimationView.doOnAnimationEnd(onAnimationEnd:() -> Unit){
    addAnimatorListener(object : Animator.AnimatorListener {
        override fun onAnimationStart(animation: Animator?) {
            // Not using
        }

        override fun onAnimationEnd(animation: Animator?) {
            onAnimationEnd()
        }

        override fun onAnimationCancel(animation: Animator?) {
            // Not using
        }

        override fun onAnimationRepeat(animation: Animator?) {
            // Not using
        }

    })
}