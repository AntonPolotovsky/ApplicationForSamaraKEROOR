package com.example.myapplication.presentation.traditions.domain

import com.example.myapplication.data.localdatasource.MokData
import com.example.myapplication.presentation.traditions.domain.TraditionsInteractor
import javax.inject.Inject

class TraditionsInteractorImpl @Inject constructor(
        private val mokData: MokData
    ) : TraditionsInteractor {

        override fun getDataForDescription(): List<String> {
            return mokData.getDataDescription()
        }
    }