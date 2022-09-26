package com.example.myapplication.presentation.donation.viewmodel

import androidx.lifecycle.ViewModel
import com.example.myapplication.presentation.donation.domain.DonationInteractor
import com.example.myapplication.presentation.donation.view.BillingClientInstance
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class DonationViewModel @Inject constructor(
    private val interactor: DonationInteractor,
    private val billingClientInstance: BillingClientInstance
): ViewModel() {
    fun getDataDescription():List<String>{
        return interactor.getDataForDescription()
    }

    fun callPayFunction(){
        billingClientInstance.createBilling()
        billingClientInstance.launchBilling("sku_id_1")
    }
}