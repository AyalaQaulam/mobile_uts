package com.example.ourapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.ourapplication.databinding.ActivityBmicalculatorBinding
import kotlin.math.pow

class BMICalculator : AppCompatActivity() {

    private lateinit var binding: ActivityBmicalculatorBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBmicalculatorBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
//        supportActionBar!!.title ="BMI Calculator"

        binding.calculateBtn.setOnClickListener{
            calculateBMI()
        }
    }

    private fun calculateBMI(){
        val weight = binding.weightEdit.text.toString().toFloatOrNull()
        val height = binding.heightEdit.text.toString().toFloatOrNull()

        if (weight != null && height != null) {
            val bmi = weight / (height / 100).pow(2)
            val bmiResult = String.format("%.2f", bmi)

            val bmiCategory = when {
                bmi < 18.5 -> "Underweight"
                bmi < 25 -> "Normal Weight"
                bmi < 30 -> "Over Weight"
                else -> "Obese"
            }
            binding.resultText.text = "BMI: $bmiResult\nCategory: $bmiCategory"
        } else {
            binding.resultText.text = "Invalid Input"
            }
    }
}
