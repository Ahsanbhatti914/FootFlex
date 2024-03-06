package com.example.ornet.common.ext

import android.app.Activity
import androidx.core.content.ContextCompat
import androidx.core.view.WindowInsetsControllerCompat


fun Activity.changeStatusBarColor(color: Int) {
    window.statusBarColor = ContextCompat.getColor(this, color)
    WindowInsetsControllerCompat(window,window.decorView).isAppearanceLightStatusBars = false
}