package com.example.myapplication.presentation.volonteering.view

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.example.myapplication.R
import com.example.myapplication.databinding.FragmentVolonteeringBinding
import com.example.myapplication.presentation.keroormission.adapter.KeroorMissionAdapter
import com.example.myapplication.presentation.volonteering.adapter.VolonteeringAdapter
import com.example.myapplication.presentation.volonteering.viewmodel.VolonteeringViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class FragmentVolonteering : Fragment() {

    private var _binding: FragmentVolonteeringBinding? = null
    private val binding get() = _binding!!

    private val viewModel: VolonteeringViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(

        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentVolonteeringBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        val adapter = VolonteeringAdapter(getTextForVolonteering())
        Log.e("Data", "${getTextForVolonteering()}")

        binding.recyclerViewVol.adapter = adapter

        viewModel.textForRecycleViewVolLiveData.observe(viewLifecycleOwner) { listMockString ->

        }

    }

    fun getTextForVolonteering(): List<String?> {
        return listOf(
            resources.getString(R.string.volMainText1),
            resources.getString(R.string.volMainText2),
            resources.getString(R.string.volMainText3)

        )
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}