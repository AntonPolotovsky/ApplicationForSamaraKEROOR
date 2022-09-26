package com.example.myapplication.presentation.donation.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.example.myapplication.R
import com.example.myapplication.databinding.FragmentDonaionBinding
import com.example.myapplication.presentation.donation.viewmodel.DonationViewModel
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class FragmentDonation : Fragment() {
    private var _binding: FragmentDonaionBinding? = null
    private val binding get() = _binding!!

    private val viewModel: DonationViewModel by viewModels()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentDonaionBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val data = viewModel.getDataDescription()
        binding.btnPay.setOnClickListener {
            viewModel.callPayFunction()
        }


    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}