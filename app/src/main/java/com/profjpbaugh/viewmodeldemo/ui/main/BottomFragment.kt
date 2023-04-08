package com.profjpbaugh.viewmodeldemo.ui.main

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.profjpbaugh.viewmodeldemo.databinding.FragmentBottomBinding


class BottomFragment : Fragment() {

    companion object {
        fun newInstance() = BottomFragment()
    }

    private lateinit var binding : FragmentBottomBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentBottomBinding.inflate(inflater, container, false)
        return binding.root
    }}