package com.example.calculatorappkotlinw6

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var inputText: EditText
    private lateinit var resultText: TextView
    private lateinit var binaryButton: Button
    private lateinit var octalButton: Button
    private lateinit var decimalButton: Button
    private lateinit var hexButton: Button
    private lateinit var buttonNumber: Button
    private lateinit var buttonNumber0: Button
    private lateinit var buttonNumber1: Button
    private lateinit var buttonNumber2: Button
    private lateinit var buttonNumber3: Button
    private lateinit var buttonNumber4: Button
    private lateinit var buttonNumber5: Button
    private lateinit var buttonNumber6: Button
    private lateinit var buttonNumber7: Button
    private lateinit var buttonNumber8: Button
    private lateinit var buttonNumber9: Button
   // private lateinit var input: TextView
   lateinit var input : String

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonNumber = findViewById(R.id.buttonNumber)
        buttonNumber0 = findViewById(R.id.buttonNumber0)
        buttonNumber1 = findViewById(R.id.buttonNumber1)
        buttonNumber2 = findViewById(R.id.buttonNumber2)
        buttonNumber3 = findViewById(R.id.buttonNumber3)
        buttonNumber4 = findViewById(R.id.buttonNumber4)
        buttonNumber5 = findViewById(R.id.buttonNumber5)
        buttonNumber6 = findViewById(R.id.buttonNumber6)
        buttonNumber7 = findViewById(R.id.buttonNumber7)
        buttonNumber8 = findViewById(R.id.buttonNumber8)
        buttonNumber9 = findViewById(R.id.buttonNumber9)
        resultText = findViewById(R.id.resultsTV)
        binaryButton = findViewById(R.id.binary_button)
        octalButton = findViewById(R.id.octal_button)
        decimalButton = findViewById(R.id.decimal_button)
        hexButton = findViewById(R.id.hex_button)
        binaryButton.setOnClickListener { convertToBinary() }
        octalButton.setOnClickListener { convertToOctal() }
        decimalButton.setOnClickListener { convertToDecimal() }
        hexButton.setOnClickListener { convertToHex() }
        buttonNumber.setOnClickListener { input = "."}
        buttonNumber1.setOnClickListener { input = "1"}
        buttonNumber2.setOnClickListener { input = "2"}
        buttonNumber3.setOnClickListener{ input = "3"}
        buttonNumber4.setOnClickListener { input = "4"}
        buttonNumber5.setOnClickListener { input = "5"}
        buttonNumber6.setOnClickListener { input = "6"}
        buttonNumber7.setOnClickListener { input = "7"}
        buttonNumber8.setOnClickListener { input = "8"}
        buttonNumber9.setOnClickListener { input = "9"}
    }
    private fun convertToBinary() {
        val input = input
        val decimal = input.toInt()
        val binary = Integer.toBinaryString(decimal)
        resultText.text = binary
    }

    private fun convertToOctal() {
        val input = input
        val decimal = input.toInt()
        val octal = Integer.toOctalString(decimal)
        resultText.text = octal
    }

    private fun convertToDecimal() {
        val input = input
        val decimal = input.toInt()
        resultText.text = decimal.toString()
    }

    private fun convertToHex() {
        val input = input
        val decimal = input.toInt()
        val hex = Integer.toHexString(decimal)
        resultText.text = hex
    }

}