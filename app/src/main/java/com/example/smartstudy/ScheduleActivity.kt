package com.example.smartstudy

import android.content.Intent
import android.os.Bundle
import com.google.android.material.button.MaterialButton

class ScheduleActivity : BaseNavActivity() {

    override fun currentTabId() = R.id.nav_schedule
    override fun layoutRes() = R.layout.activity_schedule

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        findViewById<MaterialButton>(R.id.btnCreateTask)?.setOnClickListener {
            startActivity(Intent(this, CreateTaskActivity::class.java))
        }
    }
}
