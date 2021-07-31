package com.example.converter2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var userTemperature = findViewById<EditText>(R.id.txtTemp6)
        var userResults = findViewById<TextView>(R.id.txtResults6)
        var celsiusButton = findViewById<Button>(R.id.btnCelsius)
        var fahrenheitButton = findViewById<Button>(R.id.btnFahrenheit6)
        var clearButton = findViewById<Button>(R.id.btnClear)

        celsiusButton.setOnClickListener {
           var convertedResult = ((userTemperature.text.toString().toDouble() - 32) * 5/9)
            userResults.setText(convertedResult.toString())
       }

        fahrenheitButton.setOnClickListener {
            var convertedResult = ((userTemperature.text.toString().toDouble() * 1.8) + 32)
            userResults.setText(convertedResult.toString())
        }

        clearButton.setOnClickListener {
            userResults.setText("Results")
            userTemperature.getText().clear()
        }




//            resetButton.setOnClickListener {
//            userCelsius.getText().clear()
//            userFahrenheit.getText().clear()
//            }
//        }
    }
}