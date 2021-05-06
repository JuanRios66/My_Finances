package com.juanrios66.myfinances.fragments.estadisticas

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout
import com.juanrios66.myfinances.R
import com.juanrios66.myfinances.databinding.FragmentEstadisticasBinding
import com.juanrios66.myfinances.ui.main.SectionsEstadisticasPagerAdapter

class estadisticas_fragment : Fragment() {

    private lateinit var estadisticasBinding: FragmentEstadisticasBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        estadisticasBinding = FragmentEstadisticasBinding.inflate(inflater, container, false)
        return estadisticasBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val sectionsPagerAdapter = SectionsEstadisticasPagerAdapter(this, childFragmentManager)
        val viewPager: ViewPager = view.findViewById(R.id.view_pager)
        viewPager.adapter = sectionsPagerAdapter
        val tabs: TabLayout = view.findViewById(R.id.tabs)
        tabs.setupWithViewPager(viewPager)
    }


}