package com.juanrios66.myfinances

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.juanrios66.myfinances.databinding.FragmentGastosBinding

class gastos_fragment : Fragment() {
    private lateinit var gastosBinding: FragmentGastosBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        gastosBinding = FragmentGastosBinding.inflate(inflater, container, false)
        return gastosBinding.root
    }
}