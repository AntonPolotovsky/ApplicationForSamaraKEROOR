package com.example.myapplication.presentation.women.domain

import com.example.myapplication.data.localdatasource.MokData
import javax.inject.Inject

class WomenInteractorImpl @Inject constructor(
    private val mokData: MokData
    ) : WomenInteractor {

    override fun getDataForDescription(): List<String> {
        return mokData.getDataDescription()
    }
}