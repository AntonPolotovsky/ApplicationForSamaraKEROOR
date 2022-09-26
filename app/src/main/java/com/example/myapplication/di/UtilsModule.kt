package com.example.myapplication.di

import android.app.Application
import com.example.myapplication.utils.prefs.SharedWorker
import com.example.myapplication.utils.prefs.SharedWorkerImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
class UtilsModule {
    @Provides
    fun provideSharedWorker(context: Application) : SharedWorker{
        return SharedWorkerImpl(context)
    }
}