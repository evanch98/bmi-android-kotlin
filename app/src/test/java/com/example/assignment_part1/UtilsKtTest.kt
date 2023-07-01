package com.example.assignment_part1

import org.junit.Assert.assertEquals
import org.junit.Test

private const val DELTA = 1e-15

class UtilsKtTest {
  @Test
  fun test1() {
    val result = convertHeightToInch(heightFeet = 5.0, heightInch = 7.0)
    assertEquals(67.0, result, DELTA)
  }
}