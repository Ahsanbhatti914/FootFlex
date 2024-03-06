package com.example.footflex.ui

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.example.footflex.R
import com.example.footflex.databinding.ActivitySplashBinding
import com.example.ornet.common.ext.changeNavigationBarColor
import com.example.ornet.common.ext.changeStatusBarColor

@SuppressLint("CustomSplashScreen")
class SplashActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySplashBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)

        changeStatusBarColor(R.color.statusBarColor)
        changeNavigationBarColor(R.color.statusBarColorLight)
        updateProgressBarLinearly()
    }
    private fun updateProgressBarLinearly() {
        val totalProgress = 100
        val updateInterval = 30 // milliseconds
        val handler = Handler(Looper.getMainLooper())

        // Run a background thread to update the progress
        Thread {
            for (progress in 0..totalProgress) {
                // Update progress on the UI thread
                handler.post {
                    binding.progressBar.progress = progress
                }

                // Sleep for a short duration to simulate progress
                try {
                    Thread.sleep(updateInterval.toLong())
                } catch (e: InterruptedException) {
                    e.printStackTrace()
                }
            }

            // After completing progress, open the next activity
            handler.post {
                openNextActivity()
                finish()
            }
        }.start()
    }

    private fun openNextActivity() {
        startActivity(Intent(this,OnBardActivity1::class.java))
    }
}