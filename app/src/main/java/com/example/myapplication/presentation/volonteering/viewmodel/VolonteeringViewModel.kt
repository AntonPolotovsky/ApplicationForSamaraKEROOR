package com.example.myapplication.presentation.volonteering.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.myapplication.presentation.volonteering.domain.VolonteeringInteractor
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class VolonteeringViewModel @Inject constructor(
    private val interactor: VolonteeringInteractor
) : ViewModel() {


    private val _textForRecycleViewVolLiveData = MutableLiveData<List<String?>>()
    val textForRecycleViewVolLiveData: LiveData<List<String?>> get() = _textForRecycleViewVolLiveData


    fun getTextForVolonteering():List<String?>{
        return interactor.getTextForVolonteering()
    }
}