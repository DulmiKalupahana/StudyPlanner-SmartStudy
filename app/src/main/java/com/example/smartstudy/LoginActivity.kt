package com.example.smartstudy

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login) // file name must be activity_login.xml

        val btnLogin: Button = findViewById(R.id.btnLogin)
        val tvGoRegister: TextView = findViewById(R.id.tvGoRegister)

        btnLogin.setOnClickListener {
            startActivity(Intent(this, HomeActivity::class.java))
            finish()
        }

        tvGoRegister.setOnClickListener {
            startActivity(Intent(this, RegisterActivity::class.java))
        }
    }
}
