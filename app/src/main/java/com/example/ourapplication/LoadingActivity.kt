package com.example.ourapplication

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class LoadingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loading)

        Log.d("MyApp", "LogInActivity onCreate() called")

        Handler().postDelayed({
            val intent = Intent(this, DashboardActivity::class.java)
            startActivity(intent)
            finish()
        }, 1500)
    }
}
