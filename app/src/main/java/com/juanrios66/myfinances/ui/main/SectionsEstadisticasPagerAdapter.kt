package com.juanrios66.myfinances.ui.main

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.fragment.app.FragmentStatePagerAdapter
import com.juanrios66.myfinances.R
import com.juanrios66.myfinances.fragments.estadisticas.estadisticas_fragment
import com.juanrios66.myfinances.fragments.estadisticas.sub_fragments.gastos_fragment
import com.juanrios66.myfinances.fragments.estadisticas.sub_fragments.ingresos_fragment

private val TAB_TITLES = arrayOf(
    R.string.ingresos,
    R.string.gastos
)

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
class SectionsEstadisticasPagerAdapter(
    private val context: estadisticas_fragment,
    fm: FragmentManager
) :
    FragmentStatePagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
        when (position) {
            0 -> return ingresos_fragment()
            else -> return gastos_fragment()
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return context.resources.getString(TAB_TITLES[position])
    }

    override fun getCount(): Int {
        // Show 2 total pages.
        return 2
    }
}