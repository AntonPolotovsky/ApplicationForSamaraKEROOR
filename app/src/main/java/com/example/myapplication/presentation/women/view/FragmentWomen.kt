package com.example.myapplication.presentation.women.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.myapplication.databinding.FragmentWomenBinding
import com.example.myapplication.presentation.women.viewmodel.WomenViewModel


class FragmentWomen : Fragment() {
    private var _binding: FragmentWomenBinding? = null
    private val binding get() = _binding!!

    private val viewModel:WomenViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
       _binding = FragmentWomenBinding.inflate(inflater, container, false)
        return binding.root
    }



    override fun onDestroyView() {
        super.onDestroyView()

        _binding = null
    }

}

