package com.example.myapplication.presentation.medTourism.domain

import com.example.myapplication.data.localdatasource.MokData
import javax.inject.Inject

class MedTourismInteractorImpl @Inject constructor(
    private val mokData: MokData
    ) : MedTourismInteractor {

    override fun getDataForDescription(): List<String> {
        return mokData.getDataDescription()
    }
}