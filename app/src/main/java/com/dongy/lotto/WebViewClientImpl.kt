package com.dongy.lotto

import android.webkit.WebView
import android.webkit.WebViewClient

class WebViewClientImpl: WebViewClient() {
    override fun shouldOverrideUrlLoading(view: WebView?, url: String?): Boolean {
        return false
    }
}