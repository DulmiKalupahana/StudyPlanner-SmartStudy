package com.example.smartstudy

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class RegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        // Next → ProfileSetupActivity
        findViewById<Button>(R.id.btnContinueSetup).setOnClickListener {
            startActivity(Intent(this, ProfileSetupActivity::class.java))
            finish() // optional
        }

        // Whole "Already have an account? Login" text is clickable → LoginActivity
        findViewById<TextView>(R.id.tvGoLogin).setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
            finish() // optional
        }
    }
}
