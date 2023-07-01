package com.example.assignment_part1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

  private val etWeight: EditText = findViewById(R.id.etBodyWeight)
  private val etHeightFeet: EditText = findViewById(R.id.etHeight)
  private val etHeightInch: EditText = findViewById(R.id.etHeightInch)
  private val btnCalculate: Button = findViewById(R.id.btnCalculate)
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    var bmiResult = BmiResult.NORMAL

    btnCalculate.setOnClickListener {
      val weight: Int = etWeight.text.toString().toInt()
      val heightFeet = etHeightFeet.text.toString().toDouble()
      val heightInch = etHeightInch.text.toString().toDouble()
      val height = convertHeightToInch(heightFeet = heightFeet, heightInch = heightInch)
      val bmiCalculator = BmiCalculator(weight, height)
      bmiResult = bmiCalculator.getResult()
    }
  }
}