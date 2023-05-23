package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class StreamView extends AppCompatActivity {
    private WebView mWebView;
    private Button captureButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stream_view);

        mWebView= (WebView) findViewById(R.id.webview);
        mWebView.setWebViewClient(new WebViewClient());
        //mWebView.loadUrl("http://192.168.90.205:5000");
        mWebView.loadUrl("http://192.168.252.64:5000");
    }
}