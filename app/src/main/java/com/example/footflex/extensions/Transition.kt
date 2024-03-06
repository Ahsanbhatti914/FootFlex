package com.example.footflex.extensions

import android.app.Activity
import com.example.footflex.R


fun Activity.swipeUpTransition() {
    overridePendingTransition(R.anim.slide_from_bottom, R.anim.tab_anim_fade_out)
}

fun Activity.swipeDownTransition() {
    overridePendingTransition(R.anim.tab_anim_fade_in, R.anim.slide_to_bottom)
}

fun Activity.swipeFromRightTransition() {
    overridePendingTransition(R.anim.slide_from_right, R.anim.tab_anim_fade_out)
}

fun Activity.swipeToRightTransition() {
    overridePendingTransition(R.anim.tab_anim_fade_out, R.anim.slide_to_right)
}