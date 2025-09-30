package com.example.smartstudy

import android.app.DatePickerDialog
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputEditText
import java.util.Calendar

class ProfileSetupActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile_setup)

        val etBirthday = findViewById<TextInputEditText>(R.id.etBirthday)

        // Date picker for birthday (YYYY-MM-DD)
        etBirthday.isFocusable = false
        etBirthday.isClickable = true
        etBirthday.setOnClickListener { showDatePicker(etBirthday) }

        // Skip button → go Home
        findViewById<MaterialButton>(R.id.btnSkip).setOnClickListener {
            goHome()
        }

        // Next button → go Home
        findViewById<MaterialButton>(R.id.btnSetupNext).setOnClickListener {
            goHome()
        }
    }

    private fun goHome() {
        val intent = Intent(this, HomeActivity::class.java)
        startActivity(intent)
        finish()
    }

    private fun showDatePicker(target: TextInputEditText) {
        val c = Calendar.getInstance()
        DatePickerDialog(
            this,
            { _, y, m, d ->
                target.setText("$y-${m + 1}-$d") // Simple YYYY-M-D format
            },
            c.get(Calendar.YEAR),
            c.get(Calendar.MONTH),
            c.get(Calendar.DAY_OF_MONTH)
        ).show()
    }
}
