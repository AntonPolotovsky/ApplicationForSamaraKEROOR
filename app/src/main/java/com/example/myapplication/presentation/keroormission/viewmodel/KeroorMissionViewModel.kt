package com.example.myapplication.presentation.keroormission.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.myapplication.presentation.keroormission.domain.KeroorMissionInteractor
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class KeroorMissionViewModel @Inject constructor(
    private val interactor: KeroorMissionInteractor
): ViewModel() {

    private val _textForRecycleViewLiveData = MutableLiveData<List<String?>>()
    val textForRecycleViewLiveData:LiveData<List<String?>> get() = _textForRecycleViewLiveData

    fun getTextForKeroorMission() : List<String?> {
        return interactor.getTextForKeroorMission()
    }
}