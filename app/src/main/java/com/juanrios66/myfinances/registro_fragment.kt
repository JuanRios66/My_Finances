package com.juanrios66.myfinances

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.juanrios66.myfinances.databinding.FragmentRegistroBinding

class registro_fragment : Fragment() {
    private lateinit var registroBinding: FragmentRegistroBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        registroBinding = FragmentRegistroBinding.inflate(inflater, container, false)
        return registroBinding.root
    }
}