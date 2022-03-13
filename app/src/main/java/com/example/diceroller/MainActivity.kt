package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // buscamos el elemento buton con findViewById
        // guardamos una referencia al objeto button en una variable
        // de tipo Button.
        val rollButton: Button = findViewById(R.id.button)
        // existe un id de recurso tanto para el botón como para el texView
        // del formato R.<type>.<name>. por ejemplo del tipo id, o string (para
        // el texto del textView)
        rollButton.setOnClickListener{
            // esto puede ser declarado como una variable
           Toast.makeText(this, "Dice Rolled!", Toast.LENGTH_SHORT).show()

            val resultTextView: TextView = findViewById(R.id.textView)
            resultTextView.text = "6"

            rollDice()
        }


    }

    private fun rollDice() {
        // instanciamos un objeto de la clase Dice
        val dice = Dice(6)
        val diceRoll = dice.roll()
        val resultTextView: TextView = findViewById(R.id.textView)
        resultTextView.text = diceRoll.toString()
    }
}

class Dice(val numSides: Int){
    fun roll(): Int{
        return (1..numSides).random()
    }
}