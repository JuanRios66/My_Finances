package com.juanrios66.myfinances.fragments.registro.sub_fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.juanrios66.myfinances.databinding.FragmentSemanalBinding

class semanal_fragment : Fragment() {
    private lateinit var semanalBinding: FragmentSemanalBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        semanalBinding = FragmentSemanalBinding.inflate(inflater, container, false)
        return semanalBinding.root
    }
}