package com.nan.androidgradleprimer

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("MainActivity_TAG", BuildConfig.URL)
        Log.d("MainActivity_TAG", getString(R.string.welcome))

        com.nan.mylibrary.Test.main(arrayOf(""))
    }
}