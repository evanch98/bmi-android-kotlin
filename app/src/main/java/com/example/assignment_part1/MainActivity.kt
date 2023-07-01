package com.example.assignment_part1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    val etWeight: EditText = findViewById(R.id.etBodyWeight)
    val etHeightFeet: EditText = findViewById(R.id.etHeight)
    val etHeightInch: EditText = findViewById(R.id.etHeightInch)
    val btnCalculate: Button = findViewById(R.id.btnCalculate)
    val tvResult: TextView = findViewById(R.id.tvResult)

    btnCalculate.setOnClickListener {
      val weight: Int = etWeight.text.toString().toInt()
      val heightFeet = etHeightFeet.text.toString().toDouble()
      val heightInch = etHeightInch.text.toString().toDouble()
      val height = convertHeightToInch(heightFeet = heightFeet, heightInch = heightInch)
      val bmiCalculator = BmiCalculator(weight, height)
      val bmiResult = bmiCalculator.getResult()
      if (bmiResult === BmiResult.NORMAL) {
        tvResult.setTextColor(getColor(R.color.green))
      } else {
        tvResult.setTextColor(getColor(R.color.red))
      }
      tvResult.text = bmiResult.text
    }
  }
}