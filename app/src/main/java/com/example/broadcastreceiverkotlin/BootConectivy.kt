package com.example.broadcastreceiverkotlin

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log
import android.widget.Toast


class BootConectivy : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {

        val state = intent.getBooleanExtra("state", false)

        Toast.makeText(context, "Intent Detected.$intent", Toast.LENGTH_LONG).show();


        Log.i("TAG", "TimeReceiver:  Time is monitored ")








    }
}