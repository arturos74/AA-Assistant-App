package com.example.archeageassistantapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.core.view.isVisible

class MoneyToGold : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_moneytogold)

        val etRatioMoney = findViewById<EditText>(R.id.etRatioMoney)
        val etRatioGold = findViewById<EditText>(R.id.etRatioGold)
        val etMoney = findViewById<EditText>(R.id.etMoney)
        val tvGoldValue = findViewById<TextView>(R.id.tvGoldValue)


        val btnCalculate = findViewById<Button>(R.id.btnCalculate)
        val btnClear  = findViewById<Button>(R.id.btnClear)
        val btnReturn = findViewById<Button>(R.id.btnReturn)


        btnCalculate.setOnClickListener {
            val total: Double
            val goldNum: Double = etRatioGold.text.toString().toDouble()
            val moneyDenum: Double = etRatioMoney.text.toString().toDouble()
            val money: Double = etMoney.text.toString().toDouble()

            total = money / (moneyDenum / goldNum)

            tvGoldValue.text = total.toString()
        }

        btnClear.setOnClickListener {
            etRatioMoney.text.clear()
            etRatioMoney.text.clear()
            etMoney.text.clear()

            tvGoldValue.text = ""
        }

        btnReturn.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

    }
}