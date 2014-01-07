// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.dwbk.dwbks;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import net.youmi.android.AdManager;

//import com.adfeiwo.banner.AdBanner;
//import com.adfeiwo.banner.RecevieAdListener;
//import com.feiwo.coverscreen.CoverAdComponent;
//import com.slpush.LMA;
//import com.umeng.analytics.MobclickAgent;
//import com.umeng.analytics.onlineconfig.UmengOnlineConfigureListener;
//import com.umeng.socialize.bean.SocializeConfig;
//import com.umeng.socialize.controller.RequestType;
//import com.umeng.socialize.controller.UMServiceFactory;
//import com.umeng.socialize.controller.UMSocialService;
//import com.umeng.socialize.controller.UMSsoHandler;
//import com.umeng.socialize.media.UMImage;
//import com.umeng.socialize.sso.QZoneSsoHandler;
//import com.umeng.socialize.sso.SinaSsoHandler;
//import com.umeng.socialize.sso.TencentWBSsoHandler;
//import com.umeng.update.UmengUpdateAgent;
import org.json.JSONObject;

import com.android.adlib.ADbaseActivity;
import com.myandroid.myapp.R;

// Referenced classes of package com.dwbk.dwbks:
//            Gongneng, WebViewTB

public class SurfaceActivity extends ADbaseActivity
{

    public SurfaceActivity()
    {
//        mController = UMServiceFactory.getUMSocialService("com.umeng.share", RequestType.SOCIAL);
        appKey = "02hkUFq82pqaq0hTY378wPJ6";
    }

    public void initWeiXin()
    {
//        fxnr_wx = MobclickAgent.getConfigParams(this, "dwbk_wxnr");
//        if("".equals(fxnr_wx))
//            fxnr_wx = "\u82E6\u5988\u4EEC\uFF01\u5C0F\u5B69\u771F\u7684\u5F88\u96BE\u517B\uFF0C\u6709\u6728\u6709\uFF1F";
////        mController.setShareContent(fxnr_wx);
////        fxtp_wx = MobclickAgent.getConfigParams(this, "dwbk_wxtp");
//        if("".equals(fxtp_wx))
//            fxtp_wx = "http://bcs.duapp.com/xiaoernanyang/9-30%2Fgou_twomj.jpg?sign=MBO:D73f6dd4ed2f433611632aca997e05dd:YBc9RQBZbBJzuxhYmFitRUd7Aaw%3D";
////        fxtpbt_wx = MobclickAgent.getConfigParams(this, "dwbk_wxtpbt");
//        if("".equals(fxtpbt_wx))
//            fxtpbt_wx = "off";
////        if(fxtpbt_wx.equals("on"))
////            mController.setShareMedia(new UMImage(this, fxtp_wx));
////        else
////        if(fxtpbt_wx.equals("off"))
////            mController.setShareMedia(new UMImage(this, 0x7f02000a));
////        downStrwx = MobclickAgent.getConfigParams(this, "dwbk_share");
//        if("".equals(downStrwx))
//            downStrwx = "http://bcs.duapp.com/xiaobaba/xbb1anzhi%2FXiaobabazaojiaoji.apk?sign=MBO:D73f6dd4ed2f433611632aca997e05dd:a%2Be9%2FvDednMI4Z1Y6ST7NCkIZM0%3D&response-content-disposition=attachment;filename*=utf8''Xiaobabazaojiaoji.apk&response-cache-control=private";
////        str_wxfxzbt = MobclickAgent.getConfigParams(this, "dwbk_wxfenxiangbt");
//        if("".equals(str_wxfxzbt))
//            bl_wxfxzbt = false;
//        else
//        if(str_wxfxzbt.equals("off"))
//            bl_wxfxzbt = false;
//        else
//        if(str_wxfxzbt.equals("on"))
//            bl_wxfxzbt = true;
//        if(bl_wxfxzbt)
//        {
//            boolean flag = true;
////            wx_appidStr = MobclickAgent.getConfigParams(this, "dwbk_wxappid_um");
//            if("".equals(wx_appidStr))
//                flag = false;
//            if(flag)
//            {
//                String s = wx_appidStr;
//                String s1 = downStrwx;
////                mController.getConfig().supportWXPlatform(this, s, s1);
////                mController.getConfig().supportWXCirclePlatform(this, s, s1);
//            }
//        }
//        mController.getConfig().supportQQPlatform(this, downStrwx);
//        mController.getConfig().setSsoHandler(new QZoneSsoHandler(this));
//        mController.getConfig().setSsoHandler(new SinaSsoHandler());
//        mController.getConfig().setSsoHandler(new TencentWBSsoHandler());
    }

    protected void onActivityResult(int i, int j, Intent intent)
    {
        super.onActivityResult(i, j, intent);
//        UMSsoHandler umssohandler = mController.getConfig().getSsoHandler(i);
//        if(umssohandler != null)
//            umssohandler.authorizeCallBack(i, j, intent);
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
//        LMA.showPushMessage(this);
//        com.slpresent.LMA.showPresent(this);
//        com.slpop.LMA.showPop(this);
//        com.slinsert.LMA.showInsert(this);
//        com.slfloat.LMA.showFloat(this);
//        MobclickAgent.onError(this);
//        setContentView(0x7f030001);
        setContentView(R.layout.activity_surface);
        
		AdManager.getInstance(this).init("a5a4f02ff73d3e84",
				"41bab4c06cdfeea5", false);
		
        ycanbt = true;
        adShowbt = false;
        bl_wxfxzbt = false;
        bl_desbt = false;
//        UmengUpdateAgent.update(this);
//        UmengUpdateAgent.setUpdateOnlyWifi(false);
//        MobclickAgent.updateOnlineConfig(this);
//        CoverAdComponent.init(getApplicationContext(), "02hkUFq82pqaq0hTY378wPJ6");
//        MobclickAgent.setOnlineConfigureListener(new UmengOnlineConfigureListener() {
//
//            public void onDataReceived(JSONObject jsonobject)
//            {
//                SurfaceActivity.adShowbt = false;
//                SurfaceActivity.strADbt = MobclickAgent.getConfigParams(SurfaceActivity.this, "dwbksur_adshow_hiapk");
//                if("".equals(SurfaceActivity.strADbt))
//                    SurfaceActivity.adShowbt = false;
//                if(SurfaceActivity.strADbt.equals("on"))
//                    SurfaceActivity.adShowbt = true;
//                if(SurfaceActivity.strADbt.equals("off"))
//                    SurfaceActivity.adShowbt = false;
//                if(SurfaceActivity.adShowbt)
//                    showAnzhiAD();
//            }
//
//            final SurfaceActivity this$0;
//
//            
//            {
//                this$0 = SurfaceActivity.this;
//                super();
//            }
//        }
//);
        initWeiXin();
        backmusicbt = true;
        ImageButton imagebutton = (ImageButton)findViewById(0x7f0c0006);
        final ImageButton buttonjcnr = (ImageButton)findViewById(0x7f0c0007);
        final ImageButton buttonmmpd = (ImageButton)findViewById(0x7f0c0008);
        final ImageButton buttonycan = (ImageButton)findViewById(0x7f0c000a);
        final ImageButton buttonbackmusic = (ImageButton)findViewById(0x7f0c0009);
        imagebutton.setBackgroundResource(0x7f020022);
        buttonjcnr.setBackgroundResource(0x7f02001f);
        buttonmmpd.setBackgroundResource(0x7f020028);
        buttonbackmusic.setBackgroundResource(0x7f020001);
        buttonycan.setBackgroundResource(0x7f020147);
        buttonjcnr.setVisibility(4);
        buttonmmpd.setVisibility(4);
        mCloudstart = AnimationUtils.loadAnimation(this, 0x7f040001);
        imagebutton.startAnimation(mCloudstart);
        aniYcan = AnimationUtils.loadAnimation(this, 0x7f040019);
        mpbackmusic = MediaPlayer.create(this, 0x7f050011);
        mpbackmusic.setLooping(true);
        mpbackmusic.start();
        mpclick = MediaPlayer.create(this, 0x7f050000);
//        if(adShowbt)
//        {
//            myAdonContainerView = (RelativeLayout)findViewById(0x7f0c000b);
//            myAdView = new AdBanner(this);
//            myAdonContainerView.addView(myAdView);
//            myAdView.setAppKey(appKey);
//            RecevieAdListener recevieadlistener = new RecevieAdListener() {
//
//                public void onFailedToRecevieAd(AdBanner adbanner)
//                {
//                    myAdonContainerView.setVisibility(8);
//                    SurfaceActivity.bl_desbt = false;
//                }
//
//                public void onSucessedRecevieAd(AdBanner adbanner)
//                {
//                    myAdonContainerView.setVisibility(0);
//                    SurfaceActivity.bl_desbt = true;
//                }
//
//                final SurfaceActivity this$0;
//
//            
//            {
//                this$0 = SurfaceActivity.this;
//                super();
//            }
//            }
//;
//            myAdView.setRecevieAdListener(recevieadlistener);
//        }
        imagebutton.setOnClickListener(new android.view.View.OnClickListener() {

            public void onClick(View view)
            {
                SurfaceActivity.mpclick.start();
                Intent intent = new Intent();
                intent.setClass(SurfaceActivity.this, Gongneng.class);
                startActivity(intent);
            }

//            final SurfaceActivity this$0;
//
//            
//            {
//                this$0 = SurfaceActivity.this;
//                super();
//            }
        }
);
        buttonjcnr.setOnClickListener(new android.view.View.OnClickListener() {

            public void onClick(View view)
            {
                SurfaceActivity.mpclick.start();
                Intent intent = new Intent();
                intent.setClass(SurfaceActivity.this, WebViewTB.class);
                Bundle bundle1 = new Bundle();
                bundle1.putString("mmpd", "http://r.m.taobao.com/s?p=mm_47361298_4272092_14448338&q=\u73A9\u5177");
                intent.putExtras(bundle1);
                startActivity(intent);
            }

//            final SurfaceActivity this$0;
//
//            
//            {
//                this$0 = SurfaceActivity.this;
//                super();
//            }
        }
);
        buttonmmpd.setOnClickListener(new android.view.View.OnClickListener() {

            public void onClick(View view)
            {
                SurfaceActivity.mpclick.start();
                Intent intent = new Intent();
                intent.setClass(SurfaceActivity.this, WebViewTB.class);
                Bundle bundle1 = new Bundle();
                bundle1.putString("mmpd", "http://r.m.taobao.com/m3?p=mm_47361298_4272092_14450315&c=1009");
                intent.putExtras(bundle1);
                startActivity(intent);
            }

////            final SurfaceActivity this$0;
////
////            
////            {
////                this$0 = SurfaceActivity.this;
////                super();
//            }
        }
);
        buttonbackmusic.setOnClickListener(new android.view.View.OnClickListener() {

            public void onClick(View view)
            {
                SurfaceActivity.mpclick.start();
                if(SurfaceActivity.backmusicbt)
                {
                    buttonbackmusic.setBackgroundResource(0x7f020002);
                    SurfaceActivity.mpbackmusic.pause();
                    SurfaceActivity.backmusicbt = false;
                } else
                {
                    buttonbackmusic.setBackgroundResource(0x7f020001);
                    SurfaceActivity.mpbackmusic.start();
                    SurfaceActivity.backmusicbt = true;
                }
            }

//            final SurfaceActivity this$0;
//            private final ImageButton val$buttonbackmusic;
//
//            
//            {
//                this$0 = SurfaceActivity.this;
//                buttonbackmusic = imagebutton;
//                super();
//            }
        }
);
        buttonycan.setOnClickListener(new android.view.View.OnClickListener() {

            public void onClick(View view)
            {
                buttonycan.startAnimation(aniYcan);
                SurfaceActivity.mpclick.start();
                if(SurfaceActivity.ycanbt)
                {
                    buttonjcnr.setVisibility(0);
                    buttonmmpd.setVisibility(0);
                    SurfaceActivity.ycanbt = false;
                } else
                {
                    buttonjcnr.setVisibility(4);
                    buttonmmpd.setVisibility(4);
                    SurfaceActivity.ycanbt = true;
                }
            }

//            final SurfaceActivity this$0;
//            private final ImageButton val$buttonjcnr;
//            private final ImageButton val$buttonmmpd;
//            private final ImageButton val$buttonycan;
//
//            
//            {
//                this$0 = SurfaceActivity.this;
//                buttonycan = imagebutton;
//                buttonjcnr = imagebutton1;
//                buttonmmpd = imagebutton2;
//                super();
//            }
        }
);
    }

    protected void onDestroy()
    {
//        if(bl_desbt)
//            myAdView.destroy();
//        CoverAdComponent.destory(this);
        if(mpbackmusic != null)
            mpbackmusic.release();
        if(mpclick != null)
            mpclick.release();
        super.onDestroy();
    }

    public boolean onKeyDown(int i, KeyEvent keyevent)
    {
        boolean flag;
        if(i == 82)
        {
//            mController.openShare(this, false);
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

    public void openOptionsMenu()
    {
        super.openOptionsMenu();
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
    public static boolean backmusicbt;
    public static boolean bl_desbt;
    public static boolean bl_wxfxzbt;
    public static String downStrwx;
    public static String fxnr_wx;
    public static String fxtp_wx;
    public static String fxtpbt_wx;
    public static MediaPlayer mpbackmusic;
    public static MediaPlayer mpclick;
    public static String strADbt;
    public static String str_wxfxzbt;
    public static String wx_appidStr;
    public static boolean ycanbt = true;
    RelativeLayout adviewLayout;
    Animation aniYcan;
    private String appKey;
    android.content.SharedPreferences.Editor editor;
    Animation mCloudstart;
//    final UMSocialService mController;
//    private AdBanner myAdView;
    RelativeLayout myAdonContainerView;
    SharedPreferences preferences;

}
