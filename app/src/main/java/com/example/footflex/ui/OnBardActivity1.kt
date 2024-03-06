package com.example.footflex.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.window.OnBackInvokedDispatcher
import com.example.footflex.R
import com.example.footflex.databinding.ActivityOnBard1Binding
import com.example.footflex.databinding.ActivitySplashBinding
import com.example.footflex.extensions.swipeFromRightTransition
import com.example.ornet.common.ext.changeNavigationBarColor
import com.example.ornet.common.ext.changeStatusBarColor

class OnBardActivity1 : AppCompatActivity() {
    private lateinit var binding: ActivityOnBard1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOnBard1Binding.inflate(layoutInflater)
        setContentView(binding.root)
        getWindow().setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN);
        changeNavigationBarColor(R.color.white)

        binding.tvGetStarted.setOnClickListener {
            startActivity(Intent(this,OnBoardActivity2::class.java))
            swipeFromRightTransition()
        }
    }
}