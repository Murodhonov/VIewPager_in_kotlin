package com.example.viewpagerinkotlin.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.PagerAdapter
import com.example.viewpagerinkotlin.R
import kotlinx.android.synthetic.main.item_page.view.*

class Adapter(private var list:List<Int>):PagerAdapter() {

    override fun getCount(): Int = list.size

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view == `object`
    }
    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val layoutInflater = LayoutInflater.from(container.context).inflate(R.layout.item_page,container,false)

        layoutInflater.item_image.setImageResource(list[position])

        container.addView(layoutInflater,position)

        return layoutInflater
    }
    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        val view = `object` as View
        container.removeView(view)
    }

}