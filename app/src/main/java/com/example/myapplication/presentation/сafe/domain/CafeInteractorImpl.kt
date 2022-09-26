package com.example.myapplication.presentation.cafe.domain

import com.example.myapplication.data.localdatasource.MokData
import javax.inject.Inject

class CafeInteractorImpl @Inject constructor(
    private val mokData: MokData
    ) : CafeInteractor {

    override fun getDataForDescription(): List<String> {
        return mokData.getDataDescription()
    }
}