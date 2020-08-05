package com.example.kleague_15m_test.Adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.example.kleague_15m_test.Fragment.CommunityFragment
import com.example.kleague_15m_test.Fragment.ScoreFragment
import com.example.kleague_15m_test.Fragment.TeamFragment

class MainFragmentStatePagerAdapter(fm : FragmentManager, private val fragmentCount : Int) : FragmentStatePagerAdapter(fm) {
    override fun getItem(position: Int): Fragment? {
        val fragment = when (position) {
            0 -> ScoreFragment()
            1 -> TeamFragment()
            2 -> CommunityFragment()
            else -> return null
        }
    }

    override fun getCount(): Int = fragmentCount
}