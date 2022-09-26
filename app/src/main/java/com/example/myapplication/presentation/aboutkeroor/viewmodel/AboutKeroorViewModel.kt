package com.example.myapplication.presentation.aboutkeroor.viewmodel

import androidx.lifecycle.ViewModel
import com.example.myapplication.data.localdatasource.MokData
import com.example.myapplication.presentation.aboutkeroor.domain.AboutKeroorInteractor
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class AboutKeroorViewModel @Inject constructor(
    private val interactor: AboutKeroorInteractor
): ViewModel() {

    fun getDataDescription():List<String>{
        return interactor.getDataForDescription()
    }

}