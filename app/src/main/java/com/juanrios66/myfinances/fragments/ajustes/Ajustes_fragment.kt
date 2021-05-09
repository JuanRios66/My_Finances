package com.juanrios66.myfinances.fragments.ajustes

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.juanrios66.myfinances.databinding.FragmentAjustesBinding

class ajustes_fragment : Fragment() {
    private lateinit var ajustesBinding: FragmentAjustesBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        ajustesBinding = FragmentAjustesBinding.inflate(inflater, container, false)
        return ajustesBinding.root
    }
}