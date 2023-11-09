// DashboardActivity.kt
package com.example.ourapplication

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import com.example.ourapplication.databinding.ActivityDashboardBinding

class DashboardActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDashboardBinding

    private var cardCal: CardView? = null
    private var cardBmi: CardView? = null
    private var cardCurr: CardView? = null
    private var cardWeb: CardView? = null
    private var cardTic: CardView? = null
    private var cardSnake: CardView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDashboardBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bottomNavigationView.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.home -> {
                    val intent = Intent(this, DashboardActivity::class.java)
                    startActivity(intent)
                }
                R.id.profile -> {
                    val intent = Intent(this, ProfileActivity::class.java)
                    startActivity(intent)
                }
                R.id.settings -> {
                    val intent = Intent(this, LogInActivity::class.java)
                    startActivity(intent)
                }
                else -> {
                    // Handle default case
                }
            }
            true
        }

        cardCal = findViewById<CardView>(R.id.cardHome)
        cardBmi = findViewById<CardView>(R.id.cardChat)
        cardCurr = findViewById<CardView>(R.id.cardProfile)
        cardWeb = findViewById<CardView>(R.id.cardWidget)
        cardTic = findViewById<CardView>(R.id.cardSettings)
        cardSnake = findViewById<CardView>(R.id.cardLogout)

        cardCal?.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, CalculatorActivity::class.java)
            startActivity(intent)
        })
        cardBmi?.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, BMICalculator::class.java)
            startActivity(intent)
        })
        cardCurr?.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, CurrencyActivity::class.java)
            startActivity(intent)
        })
        cardWeb?.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, WebViewActivity::class.java)
            startActivity(intent)
        })
        cardTic?.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, TicTacToeActivity::class.java)
            startActivity(intent)
        })
        cardSnake?.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, SnakeGameActivity::class.java)
            startActivity(intent)
        })
    }

    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}

