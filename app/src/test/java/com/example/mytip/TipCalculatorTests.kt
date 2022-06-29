package com.example.mytip

import junit.framework.Assert.assertEquals
import org.junit.Test

class TipCalculatorTests {
    @Test
    fun calculate_20_tip(){
        val amount = 10.00
        val tipPercent = 20.00
        val expectedTip = "$2.00"
        val actualTip = calculateTip(amount, tipPercent, false)
        assertEquals(expectedTip, actualTip)

    }

}