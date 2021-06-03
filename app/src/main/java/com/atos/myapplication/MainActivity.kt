package com.atos.myapplication

import android.os.Build
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.lang.StringBuilder
import java.text.SimpleDateFormat
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.*

class MainActivity : AppCompatActivity() {

    lateinit var btDateTime: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btDateTime = findViewById(R.id.btDateTime)
        btDateTime.setOnClickListener {
            var TimeDate = formatISOTime()
            Toast.makeText(this, "" + TimeDate, Toast.LENGTH_LONG).show()
        }
    }


    fun formatISOTime(): String {
        val now = OffsetDateTime.now();
        val formatter = DateTimeFormatter.ISO_DATE_TIME;
        System.out.println(formatter.format(now))
        val mDate = formatter.format(now)
        return mDate
    }


//    fun formatISOTime(): String {
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
//            val now = OffsetDateTime.now();
//            val formatter = DateTimeFormatter.ISO_DATE_TIME;
//            System.out.println(formatter.format(now))
//            val mDate = formatter.format(now)
//            return mDate
//        } else {
//            var date = Date()
////            val formatter = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.ZZ")
//            val formatter = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZZZ")
////            val formatter = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXX")
//            val mDate: String = formatter.format(date)
////            return mDate
//
//            val mDate1=StringBuilder(  SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ")
//                .format(date)).insert(22,':').toString()
//
//            return mDate1
//
//        }
//    }

}