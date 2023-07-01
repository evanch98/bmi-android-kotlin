package com.example.assignment_part1

import kotlin.math.pow

class BmiCalculator(private val weight: Int, private val height: Double) {
  private var result: BmiResult = BmiResult.NORMAL;
  fun getResult(): BmiResult {
    this.calculate()
    return result;
  }

  private fun calculate() {
    val value = 703 * (weight / height.pow(2));
    result = if (value < 18.5) {
      BmiResult.UNDERWEIGHT
    } else if (value in 18.5..24.9) {
      BmiResult.NORMAL
    } else if (value in 25.0..29.9) {
      BmiResult.OVERWEIGHT
    } else {
      BmiResult.OBESE
    }
  }
}