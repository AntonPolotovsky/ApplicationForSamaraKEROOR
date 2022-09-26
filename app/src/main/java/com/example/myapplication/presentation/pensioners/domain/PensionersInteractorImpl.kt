package com.example.myapplication.presentation.pensioners.domain

import com.example.myapplication.data.localdatasource.MokData
import javax.inject.Inject

class PensionersInteractorImpl @Inject constructor(
    private val mokData: MokData
    ) : PensionersInteractor {

    override fun getTextForPensDescription(): List<String?> {
        return mokData.getTextForPensDescription()
    }
}