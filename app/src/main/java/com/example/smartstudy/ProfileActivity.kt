package com.example.smartstudy

import android.os.Bundle

class ProfileActivity : BaseNavActivity() {
    override fun currentTabId() = R.id.nav_profile
    override fun layoutRes() = R.layout.activity_profile
    override fun onCreate(savedInstanceState: Bundle?) { super.onCreate(savedInstanceState) }
}
