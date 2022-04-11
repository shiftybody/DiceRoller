package com.example.diceroller

import org.junit.Assert.assertTrue
import org.junit.Test


class ExampleUnitTest {

    // indicamos que lo que vamos a escribir es una prueba de la biblioteca org.junit
    @Test
    fun generate_number(){
        // ctrl + p to see parameters
        val dice = Dice(6)
        val rollResult = dice.roll()
        assertTrue("The value of rollResult was not between 1 and 6", rollResult in 1..6)
    }
}