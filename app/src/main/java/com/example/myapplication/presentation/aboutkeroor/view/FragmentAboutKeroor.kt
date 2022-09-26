package com.example.myapplication.presentation.aboutkeroor.view

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import androidx.fragment.app.viewModels
import com.example.myapplication.R
import com.example.myapplication.databinding.AboutKeroorFragmentBinding
import com.example.myapplication.presentation.aboutkeroor.viewmodel.AboutKeroorViewModel
import com.example.myapplication.presentation.keroormission.view.FragmentKeroorMission
import android.widget.Toast
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class FragmentAboutKeroor : Fragment() {
    private var _binding: AboutKeroorFragmentBinding? = null
    private val binding get() = _binding!!

    private val viewModel:AboutKeroorViewModel by viewModels()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = AboutKeroorFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val data = viewModel.getDataDescription()
        Log.e("data111", "$data")

        binding.details.setOnClickListener {
//            Toast.makeText(this, "На главную", Toast.LENGTH_SHORT).show()
            activity?.supportFragmentManager?.commit {

                replace<FragmentKeroorMission>(R.id.fragment_container_view)

                setReorderingAllowed(true)
                addToBackStack("frag3")

            }

        }

    }





    override fun onDestroyView() {
        super.onDestroyView()

        _binding = null
    }
}