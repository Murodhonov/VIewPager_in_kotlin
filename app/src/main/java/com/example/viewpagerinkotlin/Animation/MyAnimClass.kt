package com.example.viewpagerinkotlin.Animation

import android.view.View
import androidx.viewpager.widget.ViewPager

class MyAnimClass: ViewPager.PageTransformer {
    override fun transformPage(page: View, position: Float) {
        page.apply {
            val pageWidth = width
        }
    }
}