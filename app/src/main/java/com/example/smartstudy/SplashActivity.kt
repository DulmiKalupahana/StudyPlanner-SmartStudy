package com.example.smartstudy

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        findViewById<Button>(R.id.btnGetStarted).setOnClickListener {
            // go to Login (or Home if you prefer)
            startActivity(Intent(this, LoginActivity::class.java))
            finish()
        }
    }
}
