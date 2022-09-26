package com.example.myapplication.presentation.traditions.viewmodel

import androidx.lifecycle.ViewModel
import com.example.myapplication.presentation.traditions.domain.TraditionsInteractor
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class TraditionsViewModel @Inject constructor(
    private val interactor: TraditionsInteractor
): ViewModel() {
    fun getDataDescription():List<String>{
        return interactor.getDataForDescription()
    }
}