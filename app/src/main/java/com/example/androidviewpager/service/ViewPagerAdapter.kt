package com.example.androidviewpager.service

import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.androidviewpager.data.ItemsPageBank
import com.example.androidviewpager.fragment.ViewPagerFragment

class ViewPagerAdapter(
    fragment: FragmentActivity,
    private val viewPagerList:ArrayList<ItemsPageBank>
):FragmentStateAdapter(fragment) {
    override fun getItemCount(): Int {
        return viewPagerList.size
    }

    override fun createFragment(position: Int): Fragment {
        val fragment = ViewPagerFragment()
        fragment.arguments = bundleOf("vp" to viewPagerList[position])
        return fragment
    }
}