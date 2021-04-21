package com.juanrios66.myfinances

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.juanrios66.myfinances.databinding.FragmentEstadisticasBinding

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
}