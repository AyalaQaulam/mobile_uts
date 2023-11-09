package com.example.ourapplication

import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.ourapplication.databinding.ActivityCurrencyBinding

class CurrencyActivity : AppCompatActivity() {
    private lateinit var binding: ActivityCurrencyBinding
    private lateinit var sp1: Spinner
    private lateinit var sp2: Spinner
    private lateinit var ed1: EditText
    private lateinit var b1: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCurrencyBinding.inflate(layoutInflater)
        setContentView(binding.root)

        sp1 = binding.spfrom
        sp2 = binding.spto
        ed1 = binding.txtamount
        b1 = binding.btnconvert

        val from = arrayOf("USD")
        val ad: ArrayAdapter<String> = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, from)
        sp1.adapter = ad

        val to = arrayOf("IDR", "CNY")
        val ad1: ArrayAdapter<String> = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, to)
        sp2.adapter = ad1

        b1.setOnClickListener(View.OnClickListener {
            val tot: Double
            val amt = ed1.text.toString().toDouble()
            if (sp1.selectedItem.toString() == "USD" && sp2.selectedItem.toString() == "IDR") {
                tot = amt * 15564.00
                Toast.makeText(applicationContext, tot.toString(), Toast.LENGTH_LONG).show()
            } else if (sp1.selectedItem.toString() == "USD" && sp2.selectedItem.toString() == "CNY") {
                tot = amt * 7.28
                Toast.makeText(applicationContext, tot.toString(), Toast.LENGTH_LONG).show()
            }
        })
    }
}
