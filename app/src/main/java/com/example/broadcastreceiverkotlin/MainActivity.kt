package com.example.broadcastreceiverkotlin

import android.content.Intent
import android.content.IntentFilter
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


btnaccion.setOnClickListener {
    val intentFilter = IntentFilter(Intent.ACTION_AIRPLANE_MODE_CHANGED)

    val myReceiver = BootConectivy()
    registerReceiver(myReceiver, intentFilter)

}




    }






}