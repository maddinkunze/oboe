package com.maddin.oboe

import android.bluetooth.BluetoothAdapter
import android.bluetooth.BluetoothManager
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private val rng = Random(0)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        addHandlers()
    }

    private fun addHandlers() {
        findViewById<Button>(R.id.button).setOnClickListener { updateInfo() }
    }

    private fun updateInfo() {
        val bluetoothManager: BluetoothManager = getSystemService(BluetoothManager::class.java)

        findViewById<TextView>(R.id.textView).text = "Update ${rng.nextInt()}"
    }
}