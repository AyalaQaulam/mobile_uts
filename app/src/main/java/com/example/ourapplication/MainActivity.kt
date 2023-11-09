package com.example.ourapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        // Buat objek Handler
        val handler = Handler()

        // Set waktu tunda 5 detik (5000 milidetik)
        val delayMillis: Long = 5000

        // Post Runnable untuk memulai aktivitas baru setelah waktu tertentu
        handler.postDelayed({
            val intent = Intent(this, CalculatorActivity::class.java)
            startActivity(intent)
            finish()
        }, delayMillis)

    }
}