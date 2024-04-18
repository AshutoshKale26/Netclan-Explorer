package com.example.netclanexplorer

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ImageView
import android.widget.Spinner

class Refine : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    private lateinit var spinner: Spinner
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_refine)

        val BackBtn = findViewById<ImageView>(R.id.backbtn)


        spinner = findViewById(R.id.spinnerOptions)
        val optionsArray = resources.getStringArray(R.array.options_array)
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, optionsArray)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter = adapter

        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: android.view.View?,
                position: Int,
                id: Long
            ) {
                val selectedOption = optionsArray[position]
                // Handle the selected option as needed
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                // Handle case when nothing is selected
            }
        }



        val button1: Button = findViewById(R.id.button1)
        val button2: Button = findViewById(R.id.button2)
        val button3: Button = findViewById(R.id.button3)
        val button4: Button = findViewById(R.id.button4)
        val button5: Button = findViewById(R.id.button5)
        val button6: Button = findViewById(R.id.button6)
        val button7: Button = findViewById(R.id.button7)
        val button8: Button = findViewById(R.id.button8)

        button1.setOnClickListener {
            toggleButtonColor(button1)
        }
        button2.setOnClickListener {
            toggleButtonColor(button2)
        }
        button3.setOnClickListener {
            toggleButtonColor(button3)
        }
        button4.setOnClickListener {
            toggleButtonColor(button4)
        }
        button5.setOnClickListener {
            toggleButtonColor(button5)
        }
        button6.setOnClickListener {
            toggleButtonColor(button6)
        }
        button7.setOnClickListener {
            toggleButtonColor(button7)
        }
        button8.setOnClickListener {
            toggleButtonColor(button8)
        }

        BackBtn.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }



    }

    @SuppressLint("ResourceAsColor")
    private fun toggleButtonColor(button: Button) {
//         Check the current background color of the button
        val backgroundColor = button.backgroundTintList?.defaultColor
        val TextColor = button.currentTextColor
        // If the background color is white, change it to blue and text color to white
        if (backgroundColor == Color.WHITE || TextColor == Color.BLUE) {
            button.setBackgroundColor(Color.BLUE)
            button.setTextColor(Color.WHITE)
        } else {
            // Otherwise, change it to white and text color to blue
            button.setBackgroundColor(Color.WHITE)
            button.setTextColor(Color.BLUE)
        }
    }
}