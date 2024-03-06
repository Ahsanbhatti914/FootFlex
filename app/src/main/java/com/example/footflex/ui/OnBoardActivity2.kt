package com.example.footflex.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import android.window.OnBackInvokedDispatcher
import com.example.footflex.R

class OnBoardActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_on_board2)
    }

    override fun getOnBackInvokedDispatcher(): OnBackInvokedDispatcher {
        Toast.makeText(this,"hii",Toast.LENGTH_SHORT).show()
        return super.getOnBackInvokedDispatcher()
    }
}