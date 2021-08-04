package com.example.diceroller

/**
 * Dice with a fixed number of sides
 */
class Dice(val numSides: Int) {
    // A function that returns a random number between 1 and the number of sides of the dice we've instantiated
    fun roll() : Int{
        return (1..numSides).random()
    }
}