// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.dwbk.dwbks;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.*;
//import com.feiwo.coverscreen.CoverAdComponent;
//import com.umeng.analytics.MobclickAgent;

public class WebViewTB extends Activity
{
    private class HelloWebViewClient extends WebViewClient
    {

        public boolean shouldOverrideUrlLoading(WebView webview, String s)
        {
            webview.loadUrl(s);
            return true;
        }

//        final WebViewTB this$0;

//        private HelloWebViewClient()
//        {
//            this$0 = WebViewTB.this;
//            super();
//        }

//        HelloWebViewClient(HelloWebViewClient hellowebviewclient)
//        {
//            this();
//        }
    }


    public WebViewTB()
    {
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
//        MobclickAgent.onError(this);
        setContentView(0x7f030048);
        String s = getIntent().getExtras().getString("mmpd");
        webviewtb = (WebView)findViewById(0x7f0c0106);
        webviewtb.getSettings().setJavaScriptEnabled(true);
        webviewtb.requestFocusFromTouch();
        webviewtb.loadUrl(s);
//        webviewtb.setWebViewClient(new HelloWebViewClient(null));
        adShowbt = false;
//        strADbt = MobclickAgent.getConfigParams(this, "dwbkwvtb_adshow_hiapk");
//        if("".equals(strADbt))
//            adShowbt = false;
//        if(strADbt.equals("on"))
//            adShowbt = true;
//        if(strADbt.equals("off"))
//            adShowbt = false;
//        if(adShowbt)
//            showAnzhiAD();
    }

    protected void onDestroy()
    {
        webviewtb.clearCache(true);
        webviewtb.clearHistory();
        super.onDestroy();
    }

    public boolean onKeyDown(int i, KeyEvent keyevent)
    {
        boolean flag;
        if(webviewtb.canGoBack() && i == 4 && keyevent.getRepeatCount() == 0)
        {
            webviewtb.goBack();
            flag = true;
        } else
        {
            flag = super.onKeyDown(i, keyevent);
        }
        return flag;
    }

    public void onPause()
    {
        super.onPause();
//        MobclickAgent.onPause(this);
    }

    public void onResume()
    {
        super.onResume();
//        MobclickAgent.onResume(this);
    }

    public void showAnzhiAD()
    {
//        switch(CoverAdComponent.showAd(this))
//        {
//        case 0: // '\0'
//        case 1: // '\001'
//        case 2: // '\002'
//        case 3: // '\003'
//        case 4: // '\004'
//        default:
//            return;
//        }
    }

    public static boolean adShowbt;
    public static String strADbt;
    private WebView webviewtb;
}
