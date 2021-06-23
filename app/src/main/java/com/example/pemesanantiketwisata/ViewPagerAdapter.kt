package com.example.pemesanantiketwisata

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPagerAdapter(fragmentActivity: FragmentActivity) :
    FragmentStateAdapter(fragmentActivity) {
    private val JUMLAH_MENU = 4
    override fun createFragment(position: Int): Fragment {
        when(position) {
            0 -> {return HomeFragment()}
            1 -> {return GitHubfragment()}
            2 -> {return Profilfragment()}
            else -> {return GitHubfragment()}
        }
    }

    override fun getItemCount(): Int {
        return JUMLAH_MENU
    }
}