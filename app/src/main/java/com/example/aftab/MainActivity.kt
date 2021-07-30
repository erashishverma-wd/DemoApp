package com.example.aftab

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.telephony.TelephonyManager

class MainActivity : AppCompatActivity() {

    private var tm : TelephonyManager?= null
    var psListener : MyPhoneStateListener? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
}