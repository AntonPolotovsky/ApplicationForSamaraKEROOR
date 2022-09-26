package com.example.myapplication.utils.prefs

import android.content.Context
import android.content.Context.MODE_PRIVATE
import android.content.SharedPreferences


class SharedWorkerImpl(context: Context) : SharedWorker {

    private val preferences: SharedPreferences =
        context.getSharedPreferences("SharedFile", MODE_PRIVATE)

    override fun save(key: String, value: String) {
        preferences.edit().putString(key, value).apply()
    }

    override fun load(key: String, defValue: String): String {
        return  preferences.getString(key, defValue)!!
    }
}