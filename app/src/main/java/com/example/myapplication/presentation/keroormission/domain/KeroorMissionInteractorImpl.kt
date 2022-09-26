package com.example.myapplication.presentation.keroormission.domain

import com.example.myapplication.data.localdatasource.MokData
import com.example.myapplication.presentation.donation.domain.DonationInteractor
import javax.inject.Inject

class KeroorMissionInteractorImpl @Inject constructor(
        private val mokData: MokData
    ) : KeroorMissionInteractor {



    override fun getTextForKeroorMission(): List<String?> {
        return mokData.getTextForKeroorMission()
    }

}