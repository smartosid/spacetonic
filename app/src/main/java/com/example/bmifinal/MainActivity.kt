package com.example.bmifinal

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView



class MainActivity : AppCompatActivity() {
    private lateinit var heightEditText: EditText
    private lateinit var weightEditText: EditText
    private lateinit var calculateButton: Button
    private lateinit var bmiTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        heightEditText = findViewById(R.id.height_edit_text)
        weightEditText = findViewById(R.id.weight_edit_text)
        calculateButton = findViewById(R.id.calculate_button)
        bmiTextView = findViewById(R.id.bmi_text_view)


        calculateButton.setOnClickListener {
            calculateBMI()
        }
    }

    private fun calculateBMI() {
        val height = heightEditText.text.toString().toDouble()
        val weight = weightEditText.text.toString().toDouble()

        val bmi = weight / (height * height)

        bmiTextView.text = String.format("Your BMI Buddy %.2f", bmi)

    }
}