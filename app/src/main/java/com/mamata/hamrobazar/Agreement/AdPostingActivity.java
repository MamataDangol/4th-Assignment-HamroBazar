package com.mamata.hamrobazar.Agreement;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.mamata.hamrobazar.R;

public class AdPostingActivity extends AppCompatActivity {
    private WebView webViewAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ad_posting);


        webViewAd = findViewById(R.id.webViewAd);

        webViewAd.getSettings().setJavaScriptEnabled(true);
        webViewAd.getSettings().setAppCacheEnabled(true);
        webViewAd.setWebViewClient(new WebViewClient());
        webViewAd.loadUrl("https://hamrobazaar.com/postrules.html");
    }
}
