package com.tobianoapps.androidsdkversionutildemo

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.tobianoapps.androidsdkversionutil.Version
import com.tobianoapps.androidsdkversionutil.Version.sdkVersionNumber

class MainActivity : AppCompatActivity() {

    private lateinit var _text: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<TextView>(R.id.tv).also {
            _text = when {
                Version.is30 -> "Device running Android R. Version = $sdkVersionNumber."
                else -> "Device is NOT running Android R. Version = $sdkVersionNumber."
            }
            it.text = _text
        }
    }
}