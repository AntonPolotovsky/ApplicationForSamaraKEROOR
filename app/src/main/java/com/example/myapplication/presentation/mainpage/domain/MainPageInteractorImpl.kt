package com.example.myapplication.presentation.mainpage.domain

import com.example.myapplication.data.localdatasource.MokData
import javax.inject.Inject

class MainPageInteractorImpl @Inject constructor(
    private val mokData: MokData
): MainPageInteractor {
    override fun getDataForDescription(): List<String> {
        return mokData.getDataDescription()
    }
}