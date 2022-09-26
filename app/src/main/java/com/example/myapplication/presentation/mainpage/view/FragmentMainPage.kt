package com.example.myapplication.presentation.mainpage.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import androidx.fragment.app.viewModels
import com.example.myapplication.R
import com.example.myapplication.databinding.MainPageFragmentBinding
import com.example.myapplication.presentation.donation.view.FragmentDonation
import com.example.myapplication.presentation.mainpage.viewmodel.MainPageViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class FragmentMainPage : Fragment() {
    private var _binding: MainPageFragmentBinding? = null
    private val binding get() = _binding!!

    private val viewModel :MainPageViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel.initialiseFragment(requireContext())

    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

//        return inflater.inflate(R.layout.fragment_1, container, false)
        _binding = MainPageFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

//        fun onCreateContextMenu(menu: ContextMenu, v: View,
//                                         menuInfo: ContextMenu.ContextMenuInfo) {
//            super.onCreateContextMenu(menu, v, menuInfo)
//            registerForContextMenu (ImageView view)
//            val inflater: MenuInflater = menuInflater
//            inflater.inflate(R.menu.menu_main, menu)
//        }


//    binding.menuView.setOnClickListener {
//        val popupMenu: PopupMenu = PopupMenu(this, nemuView)
//        popupMenu.menuInflater.inflate(R.menu.menu_main,popupMenu.menu)
//        popupMenu.setOnMenuItemClickListener(PopupMenu.OnMenuItemClickListener { item ->
//
//            when(item.itemId) {
//                R.id.action_about ->
//                    Toast.makeText(this@Fragment_1, "You Clicked : " + item.title, Toast.LENGTH_SHORT).show()
//                R.id.action_young ->
//                    Toast.makeText(this@Fragment_1, "You Clicked : " + item.title, Toast.LENGTH_SHORT).show()
//                R.id.action_old ->
//                    Toast.makeText(this@Fragment_1, "You Clicked : " + item.title, Toast.LENGTH_SHORT).show()
//            }
//            true
//        }
//        )
//        popupMenu.show()
//    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val data = viewModel.getDataDescription()

//        binding.donation.setOnClickListener {
//            activity?.supportFragmentManager?.commit {
//                replace<FragmentDonation>(R.id.fragment_container_view)
//                setReorderingAllowed(true)
//                addToBackStack("fragD")
//            }
//        }
//
//      binding.fragment3Backarrow.setOnClickListener {
//            activity?.supportFragmentManager?.popBackStack()
//        }
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}