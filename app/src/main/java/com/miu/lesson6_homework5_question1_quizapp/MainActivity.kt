package com.miu.lesson6_homework5_question1_quizapp

import android.app.AlertDialog
import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
import android.widget.RadioButton
import androidx.core.app.ComponentActivity.ExtraData
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import android.widget.CheckBox



class MainActivity : AppCompatActivity() {

    var marks: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun resetting(view: View) {
        radioG.clearCheck()
        google.isChecked = false
        micro.isChecked = false
        jet.isChecked = false
    }
    fun submitting(view: View) {
        if (elvis.isChecked) {
            marks += 50        }
        if (jet.isChecked) {
            marks += 50
        }
        val c = Calendar.getInstance()
        val mYear = c.get(Calendar.YEAR)
        val mMonth = c.get(Calendar.MONTH)
        val mDay = c.get(Calendar.DAY_OF_MONTH)
        val mHour = c.get(Calendar.HOUR_OF_DAY)
        val mMinute = c.get(Calendar.MINUTE)
        val mSecond = c.get(Calendar.SECOND)

        var builder = AlertDialog.Builder(this)
        builder.setTitle("Alert message")
        builder.setIcon(R.drawable.aler)

        builder.setMessage("Congratulations! You submitted on $mDay /${mMonth + 1} /$mYear at $mHour:$mMinute:$mSecond, Your achieved $marks%")
        builder.setPositiveButton("OK") { dialogInterface, which ->
            dialogInterface.dismiss()
        }
        var dialogg: AlertDialog = builder.create()
        dialogg.show()
        radioG.clearCheck()
        google.isChecked = false
        micro.isChecked = false
        jet.isChecked = false
        marks=0
    }


}