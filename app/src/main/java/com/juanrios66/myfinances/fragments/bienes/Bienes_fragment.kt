package com.juanrios66.myfinances.fragments.bienes

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.juanrios66.myfinances.databinding.FragmentBienesBinding

class bienes_fragment : Fragment() {
    private lateinit var bienesBinding: FragmentBienesBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        bienesBinding = FragmentBienesBinding.inflate(inflater, container, false)
        return bienesBinding.root
    }
}