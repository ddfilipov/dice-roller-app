package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

/**
 * This activity allows the user to roll a dice and view the result on the screen
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener { rollDice() }
    }

    /**
     * Roll a dice and display its result on the screen
     */
    private fun rollDice() {
        // Create new Dice object with 6 sides and roll it
        val firstDice = Dice(6)
        val firstDiceRoll = firstDice.roll()

        // Create the second dice
        val secondDice = Dice(6)
        val secondDiceRoll = secondDice.roll()

        // Display the roll of the first dice on the screen
        val resultFirstDiceTextView: TextView = findViewById(R.id.firstDiceTextView)
        resultFirstDiceTextView.text = firstDiceRoll.toString()

        // Display the roll of the second dice on the screen
        val resultSecondDiceTextView: TextView = findViewById(R.id.secondDiceTextView)
        resultSecondDiceTextView.text = secondDiceRoll.toString()
    }
}
