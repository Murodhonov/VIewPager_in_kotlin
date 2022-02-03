package com.example.viewpagerinkotlin

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import com.example.viewpagerinkotlin.Adapter.Adapter
import com.example.viewpagerinkotlin.Adapter.MyFragment
import com.example.viewpagerinkotlin.Animation.MyAnimClass
import com.google.android.material.tabs.TabLayout
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlinx.android.synthetic.main.tab_item.view.*

class MainActivity : AppCompatActivity() {

    lateinit var list:ArrayList<String>
    lateinit var adapter: Adapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //loadData()

        //adapter = Adapter(list)

        list = ArrayList()

        list.add("Salom")
        list.add("Salom 2")
        list.add("Salom 3")

        view_pager.adapter = MyFragment(list,supportFragmentManager)

        tab_layout.setupWithViewPager(view_pager)

        //view_pager.setPageTransformer(true,MyAnimClass())

        /*setTab()

        tab_layout.addOnTabSelectedListener(object  : TabLayout.OnTabSelectedListener{
            override fun onTabSelected(tab: TabLayout.Tab?) {
                tab?.customView?.item_text_tab?.setTextColor(Color.RED)
                tab?.customView?.indicator_tab?.visibility = View.VISIBLE

            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {
                tab?.customView?.item_text_tab?.setTextColor(Color.GREEN)
                tab?.customView?.indicator_tab?.visibility = View.INVISIBLE
            }

            override fun onTabReselected(tab: TabLayout.Tab?) {
                tab?.customView?.item_text_tab?.setTextColor(Color.BLACK)
            }
        })*/

    }

    /*@SuppressLint("InflateParams")
    private fun setTab() {
        val tabCount = tab_layout.tabCount

        var tabList = arrayListOf("Menu","Ikkinchi","About")

        for (i in 0 until tabCount){
            val tabView = LayoutInflater.from(this).inflate(R.layout.tab_item,null,false)
            val tab = tab_layout.getTabAt(i)
            //tab?.text = tabList[i]
            tab?.customView = tabView

            tabView.item_text_tab.text = tabList[i]

            if (i == 0){
                tabView.item_text_tab.setTextColor(Color.RED)
                tabView.indicator_tab.visibility = View.VISIBLE
            }else{
                tabView.item_text_tab.setTextColor(Color.GREEN)
                tabView.indicator_tab.visibility = View.INVISIBLE

            }
        }
    }*/

    /*private fun loadData() {
        list = ArrayList()
        list.add(R.drawable.img1)
        list.add(R.drawable.img2)
        list.add(R.drawable.img3)
    }*/

}