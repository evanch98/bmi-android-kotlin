package com.example.assignment_part1

import org.junit.Assert.assertEquals
import org.junit.Test

class BmiCalculatorTest {
  @Test
  fun resultTest1() {
    val bmiCalculator = BmiCalculator(136, 67.0)
    val result: BmiResult = bmiCalculator.getResult()
    assertEquals(BmiResult.NORMAL, result)
  }

  @Test
  fun resultTest2() {
    var bmiCalculator = BmiCalculator(90, 67.0)
    val result: BmiResult = bmiCalculator.getResult()
    assertEquals(BmiResult.UNDERWEIGHT, result)
  }

  @Test
  fun resultTest3() {
    var bmiCalculator = BmiCalculator(180, 67.0)
    val result: BmiResult = bmiCalculator.getResult()
    assertEquals(BmiResult.OVERWEIGHT, result)
  }

  @Test
  fun resultTest4() {
    var bmiCalculator = BmiCalculator(200, 67.0)
    val result: BmiResult = bmiCalculator.getResult()
    assertEquals(BmiResult.OBESE, result)
  }
}