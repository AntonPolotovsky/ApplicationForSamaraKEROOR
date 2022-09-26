package com.example.myapplication.presentation.volonteering.domain

import com.example.myapplication.data.localdatasource.MokData
import javax.inject.Inject

class VolonteeringInteractorImpl @Inject constructor(
    private val mokData: MokData
    ) : VolonteeringInteractor {

    override fun getTextForVolonteering(): List<String?> {
        return mokData.getTextForVolonteering()
    }
}