package com.example.myapplication.presentation.children.domain

import com.example.myapplication.data.localdatasource.MokData
import javax.inject.Inject

class ChildrenInteractorImpl @Inject constructor(
    private val mokData: MokData
    ) : ChildrenInteractor {

    override fun getDataForDescription(): List<String> {
        return mokData.getDataDescription()
    }
}