package com.example.aftab

import android.telephony.PhoneStateListener
import android.telephony.SignalStrength

class MyPhoneStateListener(private val ctx: MainActivity) : PhoneStateListener() {
    private var signalStrengthValue = 0

    override fun onSignalStrengthsChanged(signalStrength: SignalStrength?) {
        super.onSignalStrengthsChanged(signalStrength)
        signalStrengthValue = if (signalStrength.isGsm)
    }
}