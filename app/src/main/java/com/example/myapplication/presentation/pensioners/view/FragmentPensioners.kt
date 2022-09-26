package com.example.myapplication.presentation.pensioners.view

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.example.myapplication.R
import com.example.myapplication.app.App
import com.example.myapplication.databinding.FragmentPensionersBinding
import com.example.myapplication.presentation.pensioners.adapter.PensionersAdapter
import com.example.myapplication.presentation.pensioners.viewmodel.PensionersViewModel
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class FragmentPensioners : Fragment() {
    private var _binding: FragmentPensionersBinding? = null
    private val binding get() = _binding!!

    private val viewModel: PensionersViewModel by viewModels()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentPensionersBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        val adapter = PensionersAdapter(getTextForPensDescription())


        binding.recyclerViewPensioners.adapter = adapter


        viewModel.textForRecycleViewPensLiveData.observe(viewLifecycleOwner) { listMockString ->
        }
    }

    fun getTextForPensDescription(): List<String?> {
        return listOf(
            resources.getString(R.string.pensioners1),
            resources.getString(R.string.pensioners2),
            resources.getString(R.string.pensioners3)
        )

    }

    override fun onDestroy() {

        super.onDestroy()

        _binding = null

    }
}