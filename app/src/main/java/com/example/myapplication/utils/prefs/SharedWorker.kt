package com.example.myapplication.utils.prefs

interface SharedWorker {
    fun save (key: String, value : String)
    fun load (key: String, defValue: String) : String


}