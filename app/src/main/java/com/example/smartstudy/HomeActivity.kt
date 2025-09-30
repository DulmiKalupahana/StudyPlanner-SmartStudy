package com.example.smartstudy

import android.content.Intent
import android.os.Bundle
import com.google.android.material.button.MaterialButton

class HomeActivity : BaseNavActivity() {

    override fun currentTabId() = R.id.nav_home
    override fun layoutRes() = R.layout.activity_home

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        findViewById<MaterialButton>(R.id.btnCreateTask)?.setOnClickListener {
            startActivity(Intent(this, CreateTaskActivity::class.java))
        }
    }
    private fun goToSplash() {
        val intent = Intent(this, SplashActivity::class.java).apply {
            // wipe the current task so Back won't return to Home
            addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK)
        }
        startActivity(intent)
        // finish() is optional here; CLEAR_TASK already removes Home
    }

}
