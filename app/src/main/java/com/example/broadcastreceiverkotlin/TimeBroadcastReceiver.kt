package com.example.broadcastreceiverkotlin

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast
import java.text.Format
import java.text.SimpleDateFormat
import java.util.*


class TimeBroadcastReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        Toast.makeText(context, "Broadcast : Flight mode changed.",
            Toast.LENGTH_LONG).show()



      //  val msgStr = StringBuilder("Текущее время: ")
        //        val formatter: Format = SimpleDateFormat("hh:mm:ss a")
        //       msgStr.append(formatter.format(Date()))
        //      Toast.makeText(context, msgStr, Toast.LENGTH_SHORT).show()
    }
}