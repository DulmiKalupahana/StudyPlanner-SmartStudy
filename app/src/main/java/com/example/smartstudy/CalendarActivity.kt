package com.example.smartstudy

import android.os.Bundle

class CalendarActivity : BaseNavActivity() {
    override fun currentTabId() = R.id.nav_calendar
    override fun layoutRes() = R.layout.activity_calendar
    override fun onCreate(savedInstanceState: Bundle?) { super.onCreate(savedInstanceState) }
}
