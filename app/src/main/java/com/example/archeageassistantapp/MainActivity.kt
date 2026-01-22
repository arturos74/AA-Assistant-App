package com.example.archeageassistantapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val silver2LaborButton = findViewById<Button>(R.id.silver2LaborButton)
        val moneyToGoldButton = findViewById<Button>(R.id.moneyToGoldButton)
        val goldToMoneyButton = findViewById<Button>(R.id.goldToMoneyButton)
        val eventScheduleButton = findViewById<Button>(R.id.eventScheduleButton)
        val skillCalculatorButton = findViewById<Button>(R.id.skillCalculatorButton)
        val tradePackCalculatorButton = findViewById<Button>(R.id.tradePackCalculatorButton)


        silver2LaborButton.setOnClickListener {
            val intent = Intent(this, Silver2Gold::class.java)
            startActivity(intent)
        }

        moneyToGoldButton.setOnClickListener {
            val intent = Intent(this, MoneyToGold::class.java)
            startActivity(intent)
        }

        skillCalculatorButton.setOnClickListener {
            val intent = Intent(this, SkillCalculator::class.java)
            startActivity(intent)
        }
    }
}
