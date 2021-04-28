package com.juanrios66.myfinances.ui.main

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.juanrios66.myfinances.*

private val TAB_TITLES = arrayOf(
    R.string.registro,
    R.string.estad_sticas,
    R.string.bienes,
    R.string.ajustes
)

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
class SectionsPagerAdapter(private val context: Context, fm: FragmentManager) :
    FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
        when (position) {
            0 -> return registro_fragment()
            1 -> return estadisticas_fragment()
            2 -> return bienes_fragment()
            else -> return ajustes_fragment()
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return context.resources.getString(TAB_TITLES[position])
    }

    override fun getCount(): Int {
        // Show 4 total pages.
        return 4
    }
}