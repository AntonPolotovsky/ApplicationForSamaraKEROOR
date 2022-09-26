package com.example.myapplication.presentation.mainpage.viewmodel

import android.content.Context
import android.widget.Toast
import androidx.lifecycle.ViewModel
import com.example.myapplication.app.AppPrefsKeys.TEST_APP_KEY
import com.example.myapplication.presentation.aboutkeroor.domain.AboutKeroorInteractor
import com.example.myapplication.presentation.mainpage.domain.MainPageInteractor
import com.example.myapplication.utils.prefs.SharedWorker
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainPageViewModel @Inject constructor(
    private val interactor: MainPageInteractor,
    private val sharedWorker: SharedWorker

): ViewModel() {
    init {
        sharedWorker.save(TEST_APP_KEY, "success")
    }

    fun getDataDescription():List<String>{
        return interactor.getDataForDescription()
    }

    fun initialiseFragment(context: Context){
        if(sharedWorker.load(TEST_APP_KEY, " ") != "") {
            Toast.makeText(context, "success", Toast.LENGTH_SHORT).show()
        }else{
            Toast.makeText(context, "error", Toast.LENGTH_SHORT).show()
        }
    }
}