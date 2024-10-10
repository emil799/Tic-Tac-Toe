package com.example.tictactoe

import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Create a WebView instance
        val webView = WebView(this)

        // Enable JavaScript in WebView
        webView.settings.javaScriptEnabled = true

        // Ensure that URLs are opened in the WebView, not the browser
        webView.webViewClient = WebViewClient()

        // Load the HTML file from the assets folder
        webView.loadUrl("file:///android_asset/index.html")

        // Set the content view to the WebView
        setContentView(webView)
    }
}
