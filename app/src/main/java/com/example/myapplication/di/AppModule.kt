package com.example.myapplication.di

import android.content.Context
import com.example.myapplication.data.localdatasource.MokData
import com.example.myapplication.presentation.aboutkeroor.domain.AboutKeroorInteractor
import com.example.myapplication.presentation.aboutkeroor.domain.AboutKeroorInteractorImpl
import com.example.myapplication.presentation.cafe.domain.CafeInteractor
import com.example.myapplication.presentation.cafe.domain.CafeInteractorImpl
import com.example.myapplication.presentation.children.domain.ChildrenInteractor
import com.example.myapplication.presentation.children.domain.ChildrenInteractorImpl
import com.example.myapplication.presentation.donation.domain.DonationInteractor
import com.example.myapplication.presentation.donation.domain.DonationInteractorImpl
import com.example.myapplication.presentation.donation.view.BillingClientInstance
import com.example.myapplication.presentation.keroormission.domain.KeroorMissionInteractor
import com.example.myapplication.presentation.keroormission.domain.KeroorMissionInteractorImpl
import com.example.myapplication.presentation.mainpage.domain.MainPageInteractor
import com.example.myapplication.presentation.mainpage.domain.MainPageInteractorImpl
import com.example.myapplication.presentation.medTourism.domain.MedTourismInteractor
import com.example.myapplication.presentation.medTourism.domain.MedTourismInteractorImpl
import com.example.myapplication.presentation.pensioners.domain.PensionersInteractor
import com.example.myapplication.presentation.pensioners.domain.PensionersInteractorImpl
import com.example.myapplication.presentation.traditions.domain.TraditionsInteractor
import com.example.myapplication.presentation.traditions.domain.TraditionsInteractorImpl
import com.example.myapplication.presentation.volonteering.domain.VolonteeringInteractor
import com.example.myapplication.presentation.volonteering.domain.VolonteeringInteractorImpl
import com.example.myapplication.presentation.women.domain.WomenInteractor
import com.example.myapplication.presentation.women.domain.WomenInteractorImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@InstallIn(SingletonComponent::class)
@Module
class AppModule {


    @Provides
    fun provideAboutKeroorInteractor(mokData:MokData):AboutKeroorInteractor{
        return AboutKeroorInteractorImpl(mokData)
    }
    @Provides
    fun provideDonationInteractor(mokData:MokData): DonationInteractor {
        return DonationInteractorImpl(mokData)
    }


    @Provides
    fun provideBillingClientInstance(@ApplicationContext appContext: Context):BillingClientInstance{
        return BillingClientInstance(appContext)
    }

    @Provides
    fun provideMainPageInteractor(mokData:MokData): MainPageInteractor {
        return MainPageInteractorImpl(mokData)
    }

    @Provides
    fun provideKeroorMissionInteractor(mokData: MokData): KeroorMissionInteractor {
        return KeroorMissionInteractorImpl(mokData)
    }
    @Provides
    fun provideTraditionsInteractor(mokData: MokData): TraditionsInteractor {
        return TraditionsInteractorImpl(mokData)
    }
    @Provides
    fun provideWomenInteractor(mokData: MokData): WomenInteractor {
        return WomenInteractorImpl(mokData)
    }
    @Provides
    fun provideChildrenInteractor(mokData: MokData): ChildrenInteractor {
        return ChildrenInteractorImpl(mokData)
    }
    @Provides
    fun providePensionersInteractor(mokData: MokData): PensionersInteractor {
        return PensionersInteractorImpl(mokData)
    }
    @Provides
    fun provideVolonteeringInteractor(mokData: MokData): VolonteeringInteractor {
        return VolonteeringInteractorImpl(mokData)
    }
    @Provides
    fun provideMedTourismInteractor(mokData: MokData): MedTourismInteractor {
        return MedTourismInteractorImpl(mokData)
    }
    @Provides
    fun provideCafeInteractor(mokData: MokData): CafeInteractor {
        return CafeInteractorImpl(mokData)
    }
    @Singleton
    @Provides
    fun provideMokData():MokData{
        return  MokData()
    }


}