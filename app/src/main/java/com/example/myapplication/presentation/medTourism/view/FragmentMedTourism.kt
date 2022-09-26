package com.example.myapplication.presentation.medTourism.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.example.myapplication.R
import com.example.myapplication.databinding.FragmentMedTourismBinding
import com.example.myapplication.presentation.medTourism.viewmodel.MedTourismViewModel

class FragmentMedTourism : Fragment() {
    private var _binding: FragmentMedTourismBinding? = null
    private val binding get() = _binding!!

    private val viewModel: MedTourismViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMedTourismBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onDestroy() {
        super.onDestroy()

        _binding = null
    }
}