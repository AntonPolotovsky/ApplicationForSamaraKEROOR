package com.example.myapplication.presentation.keroormission.view

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.myapplication.R
import com.example.myapplication.databinding.KeroorMissionFragmentBinding
import com.example.myapplication.presentation.keroormission.adapter.KeroorMissionAdapter
import com.example.myapplication.presentation.keroormission.viewmodel.KeroorMissionViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class FragmentKeroorMission : Fragment() {
    private var _binding: KeroorMissionFragmentBinding? = null
    private val binding get() = _binding!!

    private val viewModel: KeroorMissionViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {


        _binding = KeroorMissionFragmentBinding.inflate(inflater, container, false)
        return binding.root


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//        val listData = listOf(
//            "sdfsdfsdf","sdfsdfsdf","sdfsdfsdfsdf","sdfsdfsdfsdfsdf","sdfsdfsdfsd","sdfsdfsdfsd","sdfsdfsdf","sdfsdfsdfsdfsd"
//        )


        val adapter = KeroorMissionAdapter(getTextForKeroorMission())
        Log.e("Data", "${getTextForKeroorMission()}")

        binding.recyclerView.adapter = adapter


        viewModel.textForRecycleViewLiveData.observe(viewLifecycleOwner) { listMockString ->

        }

//        binding.fragment3Backarrow.setOnClickListener {
//            activity?.supportFragmentManager?.popBackStack()
//            }


    }

    fun getTextForKeroorMission(): List<String?> {
        return listOf(
            resources.getString(R.string.fragment3Top),
            resources.getString(R.string.fragment3MainTextPart1),
            resources.getString(R.string.fragment3MainTextPart2),
            resources.getString(R.string.fragment3MainTextPart3),
            resources.getString(R.string.fragment3MainTextPart4)
        )
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}