// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.dwbk.dwbks;

import net.youmi.android.AdManager;

import com.android.adlib.ADbaseActivity;
import com.myandroid.myapp.R;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
//import com.adfeiwo.banner.AdBanner;
//import com.adfeiwo.banner.RecevieAdListener;
//import com.feiwo.coverscreen.CoverAdComponent;
//import com.umeng.analytics.MobclickAgent;

// Referenced classes of package com.dwbk.dwbks:
//            SurfaceActivity, MainActivity, Yingwen

public class Gongneng extends ADbaseActivity
{

    public Gongneng()
    {
        appKey = "02hkUFq82pqaq0hTY378wPJ6";
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
//        setContentView(0x7f030002);
        setContentView(R.layout.gongneng);
//		AdManager.getInstance(this).init("a5a4f02ff73d3e84",
//				"41bab4c06cdfeea5", false);
        bt_renshidongwu = (ImageView)findViewById(0x7f0c000d);
        bt_kaixinyingyu = (ImageView)findViewById(0x7f0c000e);
        bl_desbt = false;
        adShowbt = false;
//        strADbt = MobclickAgent.getConfigParams(this, "dwbkgn_adshow_hiapk");
//        if("".equals(strADbt))
//            adShowbt = false;
//        if(strADbt.equals("on"))
//            adShowbt = true;
//        if(strADbt.equals("off"))
//            adShowbt = false;
//        if(adShowbt)
//            showAnzhiAD();
        bt_renshidongwu.setOnClickListener(new android.view.View.OnClickListener() {

            public void onClick(View view)
            {
                SurfaceActivity.mpclick.start();
                Intent intent = new Intent();
                intent.setClass(Gongneng.this, MainActivity.class);
                startActivity(intent);
            }

//            final Gongneng this$0;
//
//            
//            {
//                this$0 = Gongneng.this;
//                super();
//            }
        }
);
        bt_kaixinyingyu.setOnClickListener(new android.view.View.OnClickListener() {

            public void onClick(View view)
            {
                SurfaceActivity.mpclick.start();
                Intent intent = new Intent();
                intent.setClass(Gongneng.this, Yingwen.class);
                startActivity(intent);
            }

//            final Gongneng this$0;
//
//            
//            {
//                this$0 = Gongneng.this;
//                super();
//            }
        }
);
    }

    protected void onDestroy()
    {
//        if(bl_desbt)
//            myAdView.destroy();
        super.onDestroy();
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
//        myAdonContainerView = (RelativeLayout)findViewById(0x7f0c000f);
//        myAdView = new AdBanner(this);
//        myAdonContainerView.addView(myAdView);
//        myAdView.setAppKey(appKey);
//        RecevieAdListener recevieadlistener = new RecevieAdListener() {
//
//            public void onFailedToRecevieAd(AdBanner adbanner)
//            {
//                myAdonContainerView.setVisibility(8);
//                Gongneng.bl_desbt = false;
//            }
//
//            public void onSucessedRecevieAd(AdBanner adbanner)
//            {
//                myAdonContainerView.setVisibility(0);
//                Gongneng.bl_desbt = true;
//            }
//
//            final Gongneng this$0;
//
//            
//            {
//                this$0 = Gongneng.this;
//                super();
//            }
//        }
//;
//        myAdView.setRecevieAdListener(recevieadlistener);
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
    public static boolean bl_desbt;
    public static String strADbt;
    private String appKey;
    public ImageView bt_kaixinyingyu;
    public ImageView bt_renshidongwu;
    public ImageView bt_shuiqiangushi;
//    private AdBanner myAdView;
//    private RelativeLayout myAdonContainerView;
    
}
