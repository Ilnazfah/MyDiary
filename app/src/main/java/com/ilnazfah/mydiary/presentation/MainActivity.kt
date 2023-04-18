package com.ilnazfah.mydiary.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.CalendarView
import android.widget.CalendarView.OnDateChangeListener
import android.widget.Toast
import androidx.fragment.app.FragmentActivity
import com.ilnazfah.mydiary.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val calendar = findViewById<CalendarView>(R.id.calendar)
//        calendar.setOnDateChangeListener { view, year, month, dayOfMonth ->
//            Toast.makeText(this, dayOfMonth.toString(), Toast.LENGTH_SHORT).show()
//        }

    }
}