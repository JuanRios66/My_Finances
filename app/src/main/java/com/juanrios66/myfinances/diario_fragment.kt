package com.juanrios66.myfinances

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.juanrios66.myfinances.databinding.FragmentDiarioBinding

class diario_fragment : Fragment() {
    private lateinit var diarioBinding: FragmentDiarioBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        diarioBinding = FragmentDiarioBinding.inflate(inflater, container, false)
        return diarioBinding.root
    }
}