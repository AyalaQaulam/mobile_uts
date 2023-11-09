package com.example.ourapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val btn_logout = findViewById<Button>(R.id.btn_logout)
        btn_logout.setOnClickListener {
            val Intent = Intent(this,LogInActivity::class.java)
            startActivity(Intent)
        }
    }
}