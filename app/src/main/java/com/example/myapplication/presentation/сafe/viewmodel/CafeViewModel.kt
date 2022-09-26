package com.example.myapplication.presentation.cafe.viewmodel

import androidx.lifecycle.ViewModel
import com.example.myapplication.presentation.cafe.domain.CafeInteractor
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class CafeViewModel @Inject constructor(
    private val interactor: CafeInteractor
) : ViewModel() {

    fun getDataDescription():List<String>{
        return interactor.getDataForDescription()
    }
}