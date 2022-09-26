package com.example.myapplication.presentation.women.viewmodel

import androidx.lifecycle.ViewModel
import com.example.myapplication.presentation.women.domain.WomenInteractor
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class WomenViewModel @Inject constructor(
    private val interactor: WomenInteractor
) : ViewModel() {

    fun getDataDescription():List<String>{
        return interactor.getDataForDescription()
    }
}