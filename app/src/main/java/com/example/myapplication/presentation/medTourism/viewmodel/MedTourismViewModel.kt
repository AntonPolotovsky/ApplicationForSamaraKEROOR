package com.example.myapplication.presentation.medTourism.viewmodel

import androidx.lifecycle.ViewModel
import com.example.myapplication.presentation.medTourism.domain.MedTourismInteractor
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class MedTourismViewModel @Inject constructor(
    private val interactor: MedTourismInteractor
) : ViewModel() {

    fun getDataDescription():List<String>{
        return interactor.getDataForDescription()
    }
}