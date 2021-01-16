package com.amrilhs.aplikasiwisatasibolga.ui.hospital

import android.os.Bundle
import android.view.View
import android.webkit.WebChromeClient
import android.webkit.WebView
import android.widget.ProgressBar
import androidx.appcompat.app.AppCompatActivity
import com.amrilhs.aplikasiwisatasibolga.R

class WebrsMettaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_webrs_metta)
        var webView: WebView
        var pb: ProgressBar
        webView = findViewById(R.id.web1)
        pb = findViewById(R.id.progressBar1)
        webView.settings.javaScriptEnabled = true
        webView.settings.javaScriptCanOpenWindowsAutomatically = true
        webView.webChromeClient = object : WebChromeClient() {
            override fun onProgressChanged(view: WebView?, newProgress: Int) {
                super.onProgressChanged(view, newProgress)
                if (newProgress == 100) {
                    pb.visibility = View.GONE
                }
            }
        }
        webView.loadUrl("http://www.rsmettamedika.com/")

    }
}