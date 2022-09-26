package com.example.myapplication.data.localdatasource

import com.example.myapplication.app.App
import com.example.myapplication.R

class MokData {
    fun getDataDescription(): List<String> {
        return listOf(
            "Samara" +
                    "Krasnoyarsk" +
                    "Krasnodar" +
                    "Moscow" +
                    "Siberian"
        )
    }

    fun getTextForKeroorMission(): List<String?> {
        return listOf(
            App.getContext()?.resources?.getString(R.string.fragment3Top),
            App.getContext()?.resources?.getString(R.string.fragment3MainTextPart1),
            App.getContext()?.resources?.getString(R.string.fragment3MainTextPart2),
            App.getContext()?.resources?.getString(R.string.fragment3MainTextPart3),
            App.getContext()?.resources?.getString(R.string.fragment3MainTextPart4)
        )
    }

    fun getTextForVolonteering(): List<String?> {
        return listOf(
            App.getContext()?.resources?.getString(R.string.volMainText1),
            App.getContext()?.resources?.getString(R.string.volMainText2),
            App.getContext()?.resources?.getString(R.string.volMainText3)
        )

    }

    fun getTextForPensDescription(): List<String?> {
        return listOf(
            App.getContext()?.resources?.getString(R.string.pensioners1),
            App.getContext()?.resources?.getString(R.string.pensioners2),
            App.getContext()?.resources?.getString(R.string.pensioners3)
        )

    }
}