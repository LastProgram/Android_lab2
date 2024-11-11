package com.example.android_lab2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editValue = findViewById<EditText>(R.id.edit_value)
        val editConstrain = findViewById<EditText>(R.id.edit_constrain)
        val result = findViewById<TextView>(R.id.result)
    }
}