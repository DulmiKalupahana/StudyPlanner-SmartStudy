package com.example.smartstudy

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Immediately go to Splash
        startActivity(Intent(this, SplashActivity::class.java))
        finish() // so back button won't come back here
    }
}
