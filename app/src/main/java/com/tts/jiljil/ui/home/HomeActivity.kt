package com.tts.jiljil.ui.home

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.tts.jiljil.R
import com.tts.jiljil.ui.FragmentClickListener
import com.tts.jiljil.ui.inbox.InboxFragment
import com.tts.jiljil.ui.profile.OthersProfileFragment
import com.tts.jiljil.ui.profile.ProfileFragment
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity(), FragmentClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        supportFragmentManager.beginTransaction().replace(R.id.frameLayout, HomeFragment.newInstance(), "Home").commit()

        bottomNavigationView.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.home -> {
                    supportFragmentManager.beginTransaction().replace(R.id.frameLayout, HomeFragment.newInstance(), "Home").commit()
                }
                R.id.discover -> {
//                    supportFragmentManager.beginTransaction().replace(R.id.frameLayout, DiscoverFragment.newInstance(), "Discover").commit()
                }
                R.id.video -> {
//                    supportFragmentManager.beginTransaction().replace(R.id.frameLayout, InboxFragment.newInstance(), "Video").commit()
                }
                R.id.inbox -> {
                    supportFragmentManager.beginTransaction().replace(R.id.frameLayout, InboxFragment.newInstance(), "Inbox").commit()
                }
                R.id.profile -> {
                    supportFragmentManager.beginTransaction().replace(R.id.frameLayout, ProfileFragment.newInstance("1", "1"), "Profile").commit()
                }
            }
            return@setOnNavigationItemSelectedListener true

        }

    }

    override fun onClick(fragment: String) {
        if (fragment == "OtherProfile") {
            supportFragmentManager.beginTransaction()
                .replace(R.id.frameLayout, OthersProfileFragment.newInstance(), "OtherProfile")
                .addToBackStack("Task").commit()
        }
    }
}