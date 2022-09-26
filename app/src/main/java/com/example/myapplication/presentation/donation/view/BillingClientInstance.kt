package com.example.myapplication.presentation.donation.view

import android.content.Context
import com.android.billingclient.api.*
import com.example.myapplication.app.App
import com.example.myapplication.presentation.MainActivity
import dagger.hilt.android.qualifiers.ActivityContext


class BillingClientInstance(
   private val context: Context
) {
    private lateinit var mBillingClient: BillingClient

    private val mSkuDetailsMap = mutableMapOf<String, SkuDetails>()
    private val mSkuId = "sku_id_1"

    fun createBilling() {
        mBillingClient = BillingClient.newBuilder(context)
            .setListener { result, purchases ->
                if (result.responseCode == BillingClient.BillingResponseCode.OK && purchases != null) {
                    //сюда мы попадем когда будет осуществлена покупка

                }
            }.build()

        mBillingClient.startConnection(object : BillingClientStateListener {
            override fun onBillingServiceDisconnected() {
                //сюда мы попадем если что-то пойдет не так
            }

            override fun onBillingSetupFinished(billingResponseCode: BillingResult) {
                if (billingResponseCode.responseCode == BillingClient.BillingResponseCode.OK) {
                    //здесь мы можем запросить информацию о товарах и покупках
                    querySkuDetails()//запрос о товарах

                }
            }
        })
    }

    private fun querySkuDetails() {
        val skuDetailsParamsBuilder = SkuDetailsParams.newBuilder()
        val skuList: MutableList<String> = ArrayList()
        skuList.add(mSkuId)
        skuDetailsParamsBuilder.setSkusList(skuList).setType(BillingClient.SkuType.INAPP)
        mBillingClient.querySkuDetailsAsync(
            skuDetailsParamsBuilder.build()
        ) { p0, p1 ->
            if (p0.responseCode == 0) {
                if (p1 != null) {
                    for (skuDetails in p1) {
                        mSkuDetailsMap[skuDetails.sku] = skuDetails
                    }
                }
            }
        }
    }


    fun launchBilling(skuId: String?) {
        val billingFlowParams = BillingFlowParams.newBuilder()
            .setSkuDetails(mSkuDetailsMap[skuId]!!)
            .build()
        mBillingClient.launchBillingFlow(MainActivity(), billingFlowParams)
    }

}