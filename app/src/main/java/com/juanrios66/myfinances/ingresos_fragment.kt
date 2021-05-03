package com.juanrios66.myfinances

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.juanrios66.myfinances.databinding.FragmentIngresosBinding

class ingresos_fragment : Fragment() {
    private lateinit var ingresosBinding: FragmentIngresosBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        ingresosBinding = FragmentIngresosBinding.inflate(inflater, container, false)
        return ingresosBinding.root
    }
}