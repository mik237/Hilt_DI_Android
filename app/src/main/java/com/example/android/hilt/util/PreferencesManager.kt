package com.example.android.hilt.util

import android.content.Context
import android.content.SharedPreferences
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject


class PreferencesManager @Inject constructor(@ApplicationContext context: Context){

    val sharedPreferences = context.getSharedPreferences("hilt_preferences", Context.MODE_PRIVATE)

    fun addString(key: String, value : String?) {
        sharedPreferences.edit().putString(key, value).apply()
    }

    fun getString(key: String) : String? {
        return sharedPreferences.getString(key, "")
    }
}