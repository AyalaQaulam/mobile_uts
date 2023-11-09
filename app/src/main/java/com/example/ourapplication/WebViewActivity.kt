package com.example.ourapplication

import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity
import com.example.ourapplication.databinding.ActivityWebViewBinding

class WebViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        lateinit var binding: ActivityWebViewBinding

        super.onCreate(savedInstanceState)
        binding = ActivityWebViewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // 1st, Insert webview item in acitivity.
        val myWeb = findViewById<WebView>(R.id.MyWebView)

        // Block to run chrome unexpectedly
        myWeb.webViewClient = WebViewClient()

        // 3rd, Run webview loading code.
        myWeb.apply {
            loadUrl("http://www.google.com")
            settings.javaScriptEnabled = true
        }
    }
}