package com.example.pemesanantiketwisata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.res.ResourcesCompat
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val menuTeks = arrayOf("Home", "Pay", "History", "Saya")
    val menuIcon = arrayOf(R.drawable.ic_home, R.drawable.ic_wallet, R.drawable.ic_history, R.drawable.ic_saya)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter = ViewPagerAdapter(this)
        view_pager.setAdapter(adapter)
        TabLayoutMediator(tab_layout, view_pager, TabLayoutMediator.TabConfigurationStrategy{ tab, position ->
            tab.text=menuTeks[position]
            tab.icon= ResourcesCompat.getDrawable(resources, menuIcon[position], null)
        }).attach()
    }
}