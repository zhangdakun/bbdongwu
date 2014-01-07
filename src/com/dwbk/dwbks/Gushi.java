// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.dwbk.dwbks;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
//import com.adfeiwo.banner.AdBanner;
//import com.adfeiwo.banner.RecevieAdListener;
//import com.feiwo.coverscreen.CoverAdComponent;
//import com.umeng.analytics.MobclickAgent;

// Referenced classes of package com.dwbk.dwbks:
//            SurfaceActivity

public class Gushi extends Activity
{

    public Gushi()
    {
        appKey = "02hkUFq82pqaq0hTY378wPJ6";
    }

    public void duihuakuang()
    {
        (new android.app.AlertDialog.Builder(this)).setTitle("\u60A8\u7684M\u5E01\u4F59\u989D\u4E0D\u8DB3").setMessage("\u5F00\u542F\u6B64\u529F\u80FD\u9700\u8981100M\u5E01\uFF0C\u53BB\u514D\u8D39\u8D5A\u53D6M\u5E01\u5427\uFF01").setCancelable(false).setPositiveButton("\u514D\u8D39\u8D5A\u53D6M\u5E01", new android.content.DialogInterface.OnClickListener() {

            public void onClick(DialogInterface dialoginterface, int i)
            {
            }

//            final Gushi this$0;
//
//            
//            {
//                this$0 = Gushi.this;
//                super();
//            }
        }
).setNegativeButton("\u53D6\u6D88", new android.content.DialogInterface.OnClickListener() {

            public void onClick(DialogInterface dialoginterface, int i)
            {
                dialoginterface.cancel();
            }

//            final Gushi this$0;
//
//            
//            {
//                this$0 = Gushi.this;
//                super();
//            }
        }
).show();
    }

    public void kaiqi(int i)
    {
//        i;
//        JVM INSTR tableswitch 6 9: default 32
//    //                   6 33
//    //                   7 74
//    //                   8 115
//    //                   9 156;
//           goto _L1 _L2 _L3 _L4 _L5
//_L1:
//        return;
//_L2:
//        gn_gs6 = true;
//        editor.putBoolean("gs_gongneng_six", true);
//        editor.commit();
//        Toast.makeText(this, "\u5DF2\u5F00\u901A\u300A\u806A\u660E\u7684\u8001\u56FD\u738B\u300B", 0).show();
//        continue; /* Loop/switch isn't completed */
//_L3:
//        gn_gs7 = true;
//        editor.putBoolean("gs_gongneng_sev", true);
//        editor.commit();
//        Toast.makeText(this, "\u5DF2\u5F00\u901A\u300A\u8C46\u5B69\u5B50\u300B", 0).show();
//        continue; /* Loop/switch isn't completed */
//_L4:
//        gn_gs8 = true;
//        editor.putBoolean("gs_gongneng_eig", true);
//        editor.commit();
//        Toast.makeText(this, "\u5DF2\u5F00\u901A\u300A\u957F\u889C\u5B50\u76AE\u76AE\u300B", 0).show();
//        continue; /* Loop/switch isn't completed */
//_L5:
//        gn_gs9 = true;
//        editor.putBoolean("gs_gongneng_nin", true);
//        editor.commit();
//        Toast.makeText(this, "\u5DF2\u5F00\u901A\u300A\u8E29\u7740\u9762\u5305\u8D70\u7684\u5973\u5B69\u300B", 0).show();
//        if(true) goto _L1; else goto _L6
//_L6:
    	switch(i) {
    	case 6:
          gn_gs6 = true;
          editor.putBoolean("gs_gongneng_six", true);
          editor.commit();
          Toast.makeText(this, "\u5DF2\u5F00\u901A\u300A\u806A\u660E\u7684\u8001\u56FD\u738B\u300B", 0).show();
    		break;
    	case 7:
          gn_gs7 = true;
          editor.putBoolean("gs_gongneng_sev", true);
          editor.commit();
          Toast.makeText(this, "\u5DF2\u5F00\u901A\u300A\u8C46\u5B69\u5B50\u300B", 0).show();
    		break;
    	case 8:
          gn_gs8 = true;
          editor.putBoolean("gs_gongneng_eig", true);
          editor.commit();
          Toast.makeText(this, "\u5DF2\u5F00\u901A\u300A\u957F\u889C\u5B50\u76AE\u76AE\u300B", 0).show();
    		break;
    	case 9:
          gn_gs9 = true;
          editor.putBoolean("gs_gongneng_nin", true);
          editor.commit();
          Toast.makeText(this, "\u5DF2\u5F00\u901A\u300A\u8E29\u7740\u9762\u5305\u8D70\u7684\u5973\u5B69\u300B", 0).show();
    		break;
    	default:
    		break;
    	}
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f030003);
        preferences = getSharedPreferences("gushi_preferences", 0);
        editor = preferences.edit();
        gn_gs6 = preferences.getBoolean("gs_gongneng_six", false);
        gn_gs7 = preferences.getBoolean("gs_gongneng_sev", false);
        gn_gs8 = preferences.getBoolean("gs_gongneng_eig", false);
        gn_gs9 = preferences.getBoolean("gs_gongneng_nin", false);
        mScrollView = (ScrollView)findViewById(0x7f0c000c);
        gsstart = (ImageView)findViewById(0x7f0c0010);
        button2 = (ImageView)findViewById(0x7f0c0011);
        button3 = (ImageView)findViewById(0x7f0c0012);
        button4 = (ImageView)findViewById(0x7f0c0013);
        button5 = (ImageView)findViewById(0x7f0c0014);
        mpgushi = MediaPlayer.create(this, 0x7f050002);
        bl_desbt = false;
        adShowbt = false;
//        strADbt = MobclickAgent.getConfigParams(this, "dwbkgs_adshow_hiapk");
        if("".equals(strADbt))
            adShowbt = false;
        if(strADbt.equals("on"))
            adShowbt = true;
        if(strADbt.equals("off"))
            adShowbt = false;
        if(adShowbt)
            showAnzhiAD();
        button2.setOnClickListener(new android.view.View.OnClickListener() {

            public void onClick(View view)
            {
                SurfaceActivity.mpclick.start();
                if(Gushi.mpgushi != null)
                    Gushi.mpgushi.release();
                Uri uri = Uri.parse("http://bcs.duapp.com/xenyzjj/gs_mhcdxnh_new.mp3?sign=MBO:03b035d90d7d018a2d9a19d87605e075:ebuL2kvW09e7vSCzzmJRwEH0x44%3D");
                Gushi.mpgushi = MediaPlayer.create(Gushi.this, uri);
                Gushi.mpgushi.start();
                Toast.makeText(Gushi.this, "\u8BF7\u7A0D\u7B49...", 0).show();
                Toast.makeText(Gushi.this, "\u5356\u706B\u67F4\u7684\u5C0F\u5973\u5B69", 1).show();
            }

//            final Gushi this$0;
//
//            
//            {
//                this$0 = Gushi.this;
//                super();
//            }
        }
);
        button3.setOnClickListener(new android.view.View.OnClickListener() {

            public void onClick(View view)
            {
                SurfaceActivity.mpclick.start();
                if(Gushi.mpgushi != null)
                    Gushi.mpgushi.release();
                Uri uri = Uri.parse("http://bcs.duapp.com/xenyzjj/gs_dwg_new.mp3?sign=MBO:03b035d90d7d018a2d9a19d87605e075:3iOmX7XdVoNp7FXswU18Jn8LKF4%3D");
                Gushi.mpgushi = MediaPlayer.create(Gushi.this, uri);
                Gushi.mpgushi.start();
                Toast.makeText(Gushi.this, "\u8BF7\u7A0D\u7B49...", 0).show();
                Toast.makeText(Gushi.this, "\u5927\u4E4C\u9F9F", 1).show();
            }

//            final Gushi this$0;
//
//            
//            {
//                this$0 = Gushi.this;
//                super();
//            }
        }
);
        button4.setOnClickListener(new android.view.View.OnClickListener() {

            public void onClick(View view)
            {
                SurfaceActivity.mpclick.start();
                if(Gushi.mpgushi != null)
                    Gushi.mpgushi.release();
                Uri uri = Uri.parse("http://bcs.duapp.com/xenyzjj/gs_cxzdm_new.mp3?sign=MBO:03b035d90d7d018a2d9a19d87605e075:Im6oP9d3CS1yjMOoAGo1xWPVn%2BY%3D");
                Gushi.mpgushi = MediaPlayer.create(Gushi.this, uri);
                Gushi.mpgushi.start();
                Toast.makeText(Gushi.this, "\u8BF7\u7A0D\u7B49...", 0).show();
                Toast.makeText(Gushi.this, "\u7A7F\u9774\u5B50\u7684\u732B", 1).show();
            }

//            final Gushi this$0;
//
//            
//            {
//                this$0 = Gushi.this;
//                super();
//            }
        }
);
        button5.setOnClickListener(new android.view.View.OnClickListener() {

            public void onClick(View view)
            {
                SurfaceActivity.mpclick.start();
                if(Gushi.mpgushi != null)
                    Gushi.mpgushi.release();
                Uri uri = Uri.parse("http://bcs.duapp.com/xenyzjj/gs_hlhpt_new.mp3?sign=MBO:03b035d90d7d018a2d9a19d87605e075:DXF0fC8B2g9VDufLbbCynOfljxY%3D");
                Gushi.mpgushi = MediaPlayer.create(Gushi.this, uri);
                Gushi.mpgushi.start();
                Toast.makeText(Gushi.this, "\u8BF7\u7A0D\u7B49...", 0).show();
                Toast.makeText(Gushi.this, "\u72D0\u72F8\u548C\u8461\u8404", 1).show();
            }

//            final Gushi this$0;
//
//            
//            {
//                this$0 = Gushi.this;
//                super();
//            }
        }
);
    }

    protected void onDestroy()
    {
        if(mpgushi != null)
            mpgushi.release();
        if(mpgushi != null)
            mpgushi.release();
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
        myAdonContainerView = (RelativeLayout)findViewById(0x7f0c0015);
//        myAdView = new AdBanner(this);
//        myAdonContainerView.addView(myAdView);
//        myAdView.setAppKey(appKey);
//        RecevieAdListener recevieadlistener = new RecevieAdListener() {
//
//            public void onFailedToRecevieAd(AdBanner adbanner)
//            {
//                myAdonContainerView.setVisibility(8);
//                Gushi.bl_desbt = false;
//            }
//
//            public void onSucessedRecevieAd(AdBanner adbanner)
//            {
//                myAdonContainerView.setVisibility(0);
//                Gushi.bl_desbt = true;
//            }
//
//            final Gushi this$0;
//
//            
//            {
//                this$0 = Gushi.this;
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
    public static MediaPlayer mpgushi;
    public static String strADbt;
    private String appKey;
    public ImageView button2;
    public ImageView button3;
    public ImageView button4;
    public ImageView button5;
    android.content.SharedPreferences.Editor editor;
    public boolean gn_gs6;
    public boolean gn_gs7;
    public boolean gn_gs8;
    public boolean gn_gs9;
    public ImageView gsstart;
    private ScrollView mScrollView;
//    private AdBanner myAdView;
    private RelativeLayout myAdonContainerView;
    SharedPreferences preferences;

}
