package com.example.assignment_part1

class BmiCalculator(val weight: Int, val height: Int, gender: String) {
  lateinit var result: String;
  fun getResult(): String {
    return result;
  }

  private fun calculate() {

  }
}