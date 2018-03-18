package com.renanrhoden.mozisms

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.telephony.SmsManager

class SmsSender : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sms_sender)
        sendSMS(" +5551991813105", "Mensagem de teste")

    }

    private fun sendSMS(phoneNumber: String, message: String) {
        val sms = SmsManager.getDefault()
        sms.sendTextMessage(phoneNumber, null, message, null, null)
    }
}
