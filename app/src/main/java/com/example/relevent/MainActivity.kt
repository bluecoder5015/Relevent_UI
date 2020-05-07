package com.example.relevent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import android.widget.ImageButton
import android.widget.TimePicker
import android.widget.Toast
import android.widget.Toast.*
import androidx.viewpager.widget.PagerAdapter
import androidx.viewpager.widget.ViewPager
import com.example.relevent.Adapter.PagerViewAdapter
import com.example.relevent.R.id.mViewPager
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {

    private lateinit var mViewPager: ViewPager
    private lateinit var homeBtn:ImageButton
    private lateinit var searchbtn:ImageButton
    private lateinit var addbtn:ImageButton
    private lateinit var notificationbtn:ImageButton
    private lateinit var profilebtn:ImageButton
    private lateinit var mPagerAdapter: PagerAdapter



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Toast.makeText(applicationContext,"Welcome to Relevent", LENGTH_SHORT).show()

        //init pager

        mViewPager=findViewById(R.id.mViewPager)

        //init btn

        homeBtn=findViewById(R.id.homeBtn)
        searchbtn=findViewById(R.id.searchBtn)
        addbtn=findViewById(R.id.addBtn)
        notificationbtn=findViewById(R.id.notiBtn)
        profilebtn=findViewById(R.id.profileBtn)


        homeBtn.setOnClickListener {
            mViewPager.currentItem = 0

        }

        searchbtn.setOnClickListener {

            mViewPager.currentItem = 1

        }

        addbtn.setOnClickListener {
            mViewPager.currentItem = 2

        }

        notificationbtn.setOnClickListener {
            mViewPager.currentItem = 3

        }

        profilebtn.setOnClickListener {
            mViewPager.currentItem = 4

        }


        mPagerAdapter = PagerViewAdapter(fm = supportFragmentManager)
        mViewPager.adapter = mPagerAdapter
        mViewPager.offscreenPageLimit = 5


        mViewPager.addOnPageChangeListener(object : ViewPager.OnPageChangeListener {
            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {
            }

            override fun onPageSelected(position: Int) {
                changeTabs(position)
            }

            override fun onPageScrollStateChanged(state: Int) {}
        })


        mViewPager.currentItem = 0
        homeBtn.setImageResource(R.drawable.ic_home_pink)

    }


    private fun changeTabs(position: Int) {


        if (position == 0) {
            homeBtn.setImageResource(R.drawable.ic_home_pink)
            searchbtn.setImageResource(R.drawable.ic_search_black)
            addbtn.setImageResource(R.drawable.ic_add_black)
            notificationbtn.setImageResource(R.drawable.ic_notifications_black)
            profilebtn.setImageResource(R.drawable.ic_person_black)


        }
        if (position == 1) {
            homeBtn.setImageResource(R.drawable.ic_home_black)
            searchbtn.setImageResource(R.drawable.ic_search_pink)
            addbtn.setImageResource(R.drawable.ic_add_black)
            notificationbtn.setImageResource(R.drawable.ic_notifications_black)
            profilebtn.setImageResource(R.drawable.ic_person_black)




        }
        if (position == 2) {
            homeBtn.setImageResource(R.drawable.ic_home_black)
            searchbtn.setImageResource(R.drawable.ic_search_black)
            addbtn.setImageResource(R.drawable.ic_add_pink)
            notificationbtn.setImageResource(R.drawable.ic_notifications_black)
            profilebtn.setImageResource(R.drawable.ic_person_black)

        }
        if (position == 3) {
            homeBtn.setImageResource(R.drawable.ic_home_black)
            searchbtn.setImageResource(R.drawable.ic_search_black)
            addbtn.setImageResource(R.drawable.ic_add_black)
            notificationbtn.setImageResource(R.drawable.ic_notifications_pink)
            profilebtn.setImageResource(R.drawable.ic_person_black)

        }
        if (position == 4) {
            homeBtn.setImageResource(R.drawable.ic_home_black)
            searchbtn.setImageResource(R.drawable.ic_search_black)
            addbtn.setImageResource(R.drawable.ic_add_black)
            notificationbtn.setImageResource(R.drawable.ic_notifications_black)
            profilebtn.setImageResource(R.drawable.ic_person_pink)

        }

    }

}
