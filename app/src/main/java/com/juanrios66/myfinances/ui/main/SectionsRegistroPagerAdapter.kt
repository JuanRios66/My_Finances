package com.juanrios66.myfinances.ui.main

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.fragment.app.FragmentStatePagerAdapter
import com.juanrios66.myfinances.*
import com.juanrios66.myfinances.fragments.registro.sub_fragments.diario_fragment
import com.juanrios66.myfinances.fragments.registro.sub_fragments.mensual_fragment
import com.juanrios66.myfinances.fragments.registro.registro_fragment
import com.juanrios66.myfinances.fragments.registro.sub_fragments.semanal_fragment

private val TAB_TITLES = arrayOf(
    R.string.diario,
    R.string.semanal,
    R.string.mensual
)

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
class SectionsRegistroPagerAdapter(private val context: registro_fragment, fm: FragmentManager) :
    FragmentStatePagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
        when (position) {
            0 -> return diario_fragment()
            1 -> return semanal_fragment()
            else -> return mensual_fragment()
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return context.resources.getString(TAB_TITLES[position])
    }

    override fun getCount(): Int {
        return 3
    }
}