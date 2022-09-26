package com.example.myapplication.presentation.donation.domain

import com.example.myapplication.data.localdatasource.MokData
import javax.inject.Inject

class DonationInteractorImpl @Inject constructor(
        private val mokData: MokData
    ) : DonationInteractor {

        override fun getDataForDescription(): List<String> {
            return mokData.getDataDescription()
        }
    }