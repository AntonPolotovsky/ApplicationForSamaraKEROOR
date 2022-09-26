package com.example.myapplication.presentation.pensioners.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.myapplication.presentation.pensioners.domain.PensionersInteractor
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class PensionersViewModel @Inject constructor(
    private val interactor: PensionersInteractor
) : ViewModel() {


    private val _textForRecycleViewPensLiveData = MutableLiveData<List<String?>>()
    val textForRecycleViewPensLiveData: LiveData<List<String?>> get() = _textForRecycleViewPensLiveData


    fun getTextForPensDescription(): List<String?> {
        return interactor.getTextForPensDescription()
    }
}