package com.example.archeageassistantapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.core.text.set

class Silver2Gold : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_silver2gold)

        val etGold = findViewById<EditText>(R.id.etGold)
        val etLabor = findViewById<EditText>(R.id.etLabor)
        val tvRatioValue = findViewById<TextView>(R.id.tvRatioValue)
        val btnCalculate = findViewById<Button>(R.id.btnCalculate)
        val btnClear = findViewById<Button>(R.id.btnClear)
        val btnReturn = findViewById<Button>(R.id.btnReturn)

        btnCalculate.setOnClickListener {
            val gold: Double = etGold.text.toString().toDouble()
            val labor: Double = etLabor.text.toString().toDouble()

            val ratio = gold / labor

            tvRatioValue.text = ratio.toString() + " per labor point"
        }

        btnClear.setOnClickListener {
            etGold.text.clear()
            etLabor.text.clear()

            tvRatioValue.text = ""
        }

        btnReturn.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}