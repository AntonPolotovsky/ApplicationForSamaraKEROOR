package com.example.myapplication.presentation.children.viewmodel

import androidx.lifecycle.ViewModel
import com.example.myapplication.presentation.children.domain.ChildrenInteractor
import com.example.myapplication.presentation.women.domain.WomenInteractor
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class ChildrenViewModel @Inject constructor(
    private val interactor: ChildrenInteractor
) : ViewModel() {

    fun getDataDescription():List<String>{
        return interactor.getDataForDescription()
    }
}