package com.example.flutter_ambient_mode_files

import android.os.Bundle
import androidx.annotation.NonNull
import androidx.wear.ambient.AmbientModeSupport
import io.flutter.embedding.android.FlutterFragmentActivity

class MainActivity : FlutterFragmentActivity(), AmbientModeSupport.AmbientCallbackProvider {
    private lateinit var ambientController: AmbientModeSupport.AmbientController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ambientController = AmbientModeSupport.attach(this)
    }

    override fun getAmbientCallback(): AmbientModeSupport.AmbientCallback {
        return object : AmbientModeSupport.AmbientCallback() {
            override fun onEnterAmbient(ambientDetails: Bundle?) {
                super.onEnterAmbient(ambientDetails)
                // Handle entering ambient mode
            }

            override fun onExitAmbient() {
                super.onExitAmbient()
                // Handle exiting ambient mode
            }
        }
    }
}