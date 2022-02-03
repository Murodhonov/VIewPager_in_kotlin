package com.example.viewpagerinkotlin.Adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.viewpagerinkotlin.ItemFragment

class MyFragment(var list:List<String>,fragmentManager: FragmentManager):FragmentPagerAdapter(fragmentManager,
    BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {
    override fun getCount(): Int = list.size

    override fun getItem(position: Int): Fragment {
        return ItemFragment.newInstance(list[position],"okey")
    }
}