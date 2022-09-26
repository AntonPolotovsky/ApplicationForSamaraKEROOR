package com.example.myapplication.presentation.aboutkeroor.domain

import com.example.myapplication.data.localdatasource.MokData
import javax.inject.Inject

class AboutKeroorInteractorImpl @Inject constructor(
    private val mokData: MokData
) : AboutKeroorInteractor {

    override fun getDataForDescription(): List<String> {
        return mokData.getDataDescription()
    }
}