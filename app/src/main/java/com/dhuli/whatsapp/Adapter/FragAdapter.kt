package com.dhuli.whatsapp.Adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class FragAdapter(manager: FragmentManager, fragments: Array<Fragment>, title: Array<String>): FragmentPagerAdapter(manager) {
    var fragments: Array<Fragment> = fragments
    var title: Array<String> = title
    override fun getCount(): Int {
               return fragments.size
    }

    override fun getItem(position: Int): Fragment {
            return fragments.get(position)
    }

    override fun getPageTitle(position: Int): CharSequence? {

        return title.get(position)
     }
}