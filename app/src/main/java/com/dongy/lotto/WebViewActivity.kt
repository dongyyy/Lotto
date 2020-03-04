package com.dongy.lotto

import android.os.Bundle
import android.webkit.WebSettings
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_web_view.*

class WebViewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_view)

        val lottoWinUrl = intent.getStringExtra("lottoWinUrl")

        val webSettings: WebSettings = webView.settings
        webSettings.javaScriptEnabled = true

        val webViewClient = WebViewClientImpl()
        webView.webViewClient = webViewClient

        webView.loadUrl(lottoWinUrl)
    }
}
