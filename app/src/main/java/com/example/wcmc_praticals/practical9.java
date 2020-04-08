package com.example.wcmc_praticals;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class practical9 extends AppCompatActivity {
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical9);
        webView = findViewById(R.id.mldag);

        webView.loadUrl("https://m.facebook.com/yash.radadiya.5");

    }
}
