package com.example.android_lab2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.util.Objects
import kotlin.math.pow

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editValue = findViewById<EditText>(R.id.edit_value)
        val editConstrain = findViewById<EditText>(R.id.edit_constrain)
        val result = findViewById<TextView>(R.id.result)
        val button = findViewById<Button>(R.id.button)

        button.setOnClickListener {
            if(isTextFloat(editValue.text) && isTextFloat(editConstrain.text))
            {
                result.text = "result"
            }
            else
            {
                result.text = "Заполните все поля!"
            }
        }

    }

    private fun isTextFloat(input: Editable) : Boolean
    {
        return input.toString().toFloatOrNull() != null
    }

    private fun calculate(x: Int, e: Float) : Double
    {
        var sum = 0.0
        var term = 1.0
        var sign = 1
        var i = 1
        while(Math.abs(term) > e)
        {
            sum += term
            i++
            sign = -sign
            term = sign * 1.0 / (2*i - 1) / Math.pow(x.toDouble(), (2 * i - 1).toDouble())
        }

        return sum
    }
}