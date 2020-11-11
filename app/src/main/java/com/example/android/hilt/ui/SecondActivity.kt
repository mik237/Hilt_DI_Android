package com.example.android.hilt.ui

import android.content.SharedPreferences
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.android.hilt.R
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class SecondActivity : AppCompatActivity(){

    //@Inject lateinit var preferencesManager: PreferencesManager

    @Inject lateinit var preferencesManager: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        Toast.makeText(this, "Second activity", Toast.LENGTH_LONG).show()
        if(preferencesManager != null)
            Toast.makeText(this, "Preferences manager injected successfully", Toast.LENGTH_LONG).show()
    }
}