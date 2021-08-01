package com.example.tablayout3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tablayout3.fragment.FragmentFour
import com.example.tablayout3.fragment.FragmentOne
import com.example.tablayout3.fragment.FragmentThree
import com.example.tablayout3.fragment.FragmentTwo
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter = MyViewPageAdapter(supportFragmentManager)
        adapter.addFragment(FragmentOne(), "Frag One")
        adapter.addFragment(FragmentTwo(), "Frag Two")
        adapter.addFragment(FragmentThree(), "Frag Three")
        adapter.addFragment(FragmentFour(), "Frag Four")

        viewPager.adapter = adapter
        tablayout1.setupWithViewPager(viewPager)
    }
}