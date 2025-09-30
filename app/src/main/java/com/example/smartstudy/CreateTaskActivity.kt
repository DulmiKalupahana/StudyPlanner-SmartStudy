package com.example.smartstudy

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.MaterialAutoCompleteTextView
import com.google.android.material.datepicker.MaterialDatePicker
import android.app.Activity
import android.os.Build


class CreateTaskActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_task)

        findViewById<Button>(R.id.btnSaveTask).setOnClickListener {
            Toast.makeText(this, "Saved (demo UI)", Toast.LENGTH_SHORT).show()
            finish() // if you want to always go to Schedule instead, call goToSchedule()
        }

        findViewById<MaterialButton>(R.id.btnCancel)?.setOnClickListener {
            goToSchedule()
        }

        findViewById<TextInputEditText>(R.id.etDate)?.setOnClickListener {
            val picker = MaterialDatePicker.Builder.datePicker()
                .setTitleText("Pick due date")
                .build()
            picker.addOnPositiveButtonClickListener {
                findViewById<TextInputEditText>(R.id.etDate)?.setText(picker.headerText)
            }
            picker.show(supportFragmentManager, "date")
        }

        findViewById<MaterialAutoCompleteTextView>(R.id.etSubjectForm)
            ?.setSimpleItems(arrayOf("DSA", "PS", "MAD", "SE", "Maths"))
    }

    private fun goToSchedule() {
        val i = Intent(this, ScheduleActivity::class.java)
            .addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_SINGLE_TOP)
        startActivity(i)

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.UPSIDE_DOWN_CAKE) {

            overrideActivityTransition(Activity.OVERRIDE_TRANSITION_CLOSE, 0, 0)
        } else {

            @Suppress("DEPRECATION")
            overridePendingTransition(0, 0)
        }

        finish()
    }


}
