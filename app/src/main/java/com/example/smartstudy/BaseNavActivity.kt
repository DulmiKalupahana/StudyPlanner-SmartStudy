package com.example.smartstudy

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.example.smartstudy.R

abstract class BaseNavActivity : AppCompatActivity() {
    abstract fun currentTabId(): Int
    abstract fun layoutRes(): Int

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layoutRes())

        val bottom = findViewById<BottomNavigationView>(R.id.bottomNav)
        bottom.selectedItemId = currentTabId()

        bottom.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.nav_home -> {
                    if (this !is HomeActivity)
                        startActivity(Intent(this, HomeActivity::class.java)
                            .addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION))
                    true
                }
                R.id.nav_calendar -> {
                    if (this !is CalendarActivity)
                        startActivity(Intent(this, CalendarActivity::class.java)
                            .addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION))
                    true
                }
                R.id.nav_schedule -> {
                    if (this !is ScheduleActivity)
                        startActivity(Intent(this, ScheduleActivity::class.java)
                            .addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION))
                    true
                }
                R.id.nav_profile -> {
                    if (this !is ProfileActivity)
                        startActivity(Intent(this, ProfileActivity::class.java)
                            .addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION))
                    true
                }
                else -> false
            }.also { handled ->
                if (handled && item.itemId == currentTabId()) return@also
                if (handled) finish() // avoid stacking
            }
        }
    }
}
