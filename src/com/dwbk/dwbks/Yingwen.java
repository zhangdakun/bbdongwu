// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.dwbk.dwbks;

import net.youmi.android.banner.AdSize;
import net.youmi.android.banner.AdView;

import com.android.adlib.AD;
import com.android.adlib.ADbaseActivity;
import com.myandroid.myapp.R;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.*;
//import com.adfeiwo.banner.AdBanner;
//import com.adfeiwo.banner.RecevieAdListener;
//import com.feiwo.coverscreen.CoverAdComponent;
//import com.umeng.analytics.MobclickAgent;

// Referenced classes of package com.dwbk.dwbks:
//            SurfaceActivity, WebViewTB

public class Yingwen extends ADbaseActivity
{

	private Context mContext;
    public Yingwen()
    {
//        appKey = "02hkUFq82pqaq0hTY378wPJ6";
    }

    public void chushihuawx()
    {
        onoff_one = false;
        onoff_two = false;
        onoff_ten = false;
        numx = 0;
//        imagesybyj = (ImageView)findViewById(0x7f0c010d);
        buttontupian = (ImageButton)findViewById(0x7f0c0000);
        buttonback = (ImageButton)findViewById(0x7f0c0001);
        buttonnext = (ImageButton)findViewById(0x7f0c0002);
        buttontzg = (ImageButton)findViewById(0x7f0c0003);
        buttonyuyin = (ImageButton)findViewById(0x7f0c0004);
        opts = new android.graphics.BitmapFactory.Options();
        opts.inSampleSize = 2;
        bmtupian = BitmapFactory.decodeResource(getResources(), 0x7f020017);
        bdtupian = new BitmapDrawable(getResources(), bmtupian);
        buttontupian.setBackgroundDrawable(bdtupian);
        bmtzg = BitmapFactory.decodeResource(getResources(), 0x7f020039);
        bdtzg = new BitmapDrawable(getResources(), bmtzg);
        buttontzg.setBackgroundDrawable(bdtzg);
        buttonback.setEnabled(false);
//        imagesybyj.setBackgroundResource(0x7f020032);
        buttonyuyin.setBackgroundResource(0x7f020149);
        buttonback.setBackgroundResource(0x7f020025);
        buttonnext.setBackgroundResource(0x7f020025);
        mpjiaosheng = MediaPlayer.create(this, 0x7f050007);
        mpyuyin = MediaPlayer.create(this, 0x7f050007);
        preferences = getSharedPreferences("name", 0);
        onoff_one = preferences.getBoolean("one_boolean_key", false);
        onoff_two = preferences.getBoolean("two_boolean_key", false);
        onoff_ten = preferences.getBoolean("ten_boolean_key", false);
    }

    protected void onActivityResult(int i, int j, Intent intent)
    {
        super.onActivityResult(i, j, intent);
//        j;
//        JVM INSTR tableswitch -1 -1: default 28
//    //                   -1 29;
//           goto _L1 _L2
//_L1:
//        return;
//_L2:
//        preferences = getSharedPreferences("name", 0);
//        onoff_one = preferences.getBoolean("one_boolean_key", false);
//        onoff_two = preferences.getBoolean("two_boolean_key", false);
//        onoff_ten = preferences.getBoolean("ten_boolean_key", false);
//        switchwx();
//        if(true) goto _L1; else goto _L3
//_L3:
		switch(j) {
	
		case -1:
		    preferences = getSharedPreferences("name", 0);
		    onoff_one = preferences.getBoolean("one_boolean_key", false);
		    onoff_two = preferences.getBoolean("two_boolean_key", false);
		    onoff_ten = preferences.getBoolean("ten_boolean_key", false);
		    switchwx();
			break;
		}
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
//        setContentView(0x7f03004a);
        setContentView(R.layout.yingwen);
        mContext = this;
        LinearLayout adLayout = (LinearLayout) findViewById(R.id.adLayout);
        AdView adView = new AdView(this, AdSize.FIT_SCREEN);
        adLayout.addView(adView);
        
        chushihuawx();
        ani_bt_left = AnimationUtils.loadAnimation(this, 0x7f040000);
        ani_bt_right = AnimationUtils.loadAnimation(this, 0x7f040000);
        ani_bt_tp = AnimationUtils.loadAnimation(this, 0x7f040000);
        bl_desbt = false;
        adShowbt = false;
//        strADbt = MobclickAgent.getConfigParams(this, "dwbkyw_adshow_hiapk");
//        if("".equals(strADbt))
//            adShowbt = false;
//        if(strADbt.equals("on"))
//            adShowbt = true;
//        if(strADbt.equals("off"))
//            adShowbt = false;
//        if(adShowbt)
//            showAnzhiAD();
//        strYYbt = MobclickAgent.getConfigParams(this, "dwbkyw_yyshow");
//        if("".equals(strYYbt))
//            imagesybyj.setVisibility(8);
//        if(strYYbt.equals("on"))
//            imagesybyj.setVisibility(0);
//        if(strYYbt.equals("off"))
//            imagesybyj.setVisibility(8);
        buttonback.setOnClickListener(new android.view.View.OnClickListener() {

            public void onClick(View view)
            {
                SurfaceActivity.mpclick.start();
                Yingwen.numx = -1 + Yingwen.numx;
                Yingwen.buttonback.startAnimation(ani_bt_left);
                setwx(Yingwen.numx);
            }

//            final Yingwen this$0;
//
//            
//            {
//                this$0 = Yingwen.this;
//                super();
//            }
        }
);
        buttonnext.setOnClickListener(new android.view.View.OnClickListener() {

            public void onClick(View view)
            {
            	if(Yingwen.numx > 6) {
            		if(!AD.haveOffers(mContext)) {
            			return;
            		}
            	}
                SurfaceActivity.mpclick.start();
                Yingwen.numx = 1 + Yingwen.numx;
                Yingwen.buttonnext.startAnimation(ani_bt_right);
                setwx(Yingwen.numx);
            }

//            final Yingwen this$0;
//
//            
//            {
//                this$0 = Yingwen.this;
//                super();
//            }
        }
);
        buttontupian.setOnClickListener(new android.view.View.OnClickListener() {

            public void onClick(View view)
            {
                Yingwen.mpjiaosheng.start();
                Yingwen.buttontupian.startAnimation(ani_bt_tp);
            }

//            final Yingwen this$0;
//
//            
//            {
//                this$0 = Yingwen.this;
//                super();
//            }
        }
);
        buttonyuyin.setOnClickListener(new android.view.View.OnClickListener() {

            public void onClick(View view)
            {
                Yingwen.mpyuyin.start();
            }

//            final Yingwen this$0;
//
//            
//            {
//                this$0 = Yingwen.this;
//                super();
//            }
        }
);
//        imagesybyj.setOnClickListener(new android.view.View.OnClickListener() {
//
//            public void onClick(View view)
//            {
//                Intent intent = new Intent();
//                intent.setClass(Yingwen.this, WebViewTB.class);
//                Bundle bundle1 = new Bundle();
//                bundle1.putString("mmpd", "http://r.m.taobao.com/s?p=mm_47361298_4272092_14440355&q=\u5C11\u513F\u82F1\u8BED");
//                intent.putExtras(bundle1);
//                startActivity(intent);
//            }
//
////            final Yingwen this$0;
////
////            
////            {
////                this$0 = Yingwen.this;
////                super();
////            }
//        }
//);
    }

    protected void onDestroy()
    {
        recyclewx();
        if(mpjiaosheng != null)
            mpjiaosheng.release();
        if(mpyuyin != null)
            mpyuyin.release();
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

    public void recyclewx()
    {
        BitmapDrawable bitmapdrawable = (BitmapDrawable)buttontupian.getBackground();
        BitmapDrawable bitmapdrawable1 = (BitmapDrawable)buttontzg.getBackground();
        buttontupian.setBackgroundResource(0);
        buttontzg.setBackgroundResource(0);
        bitmapdrawable.setCallback(null);
        bitmapdrawable1.setCallback(null);
        if(bmtupian != null && !bmtupian.isRecycled())
        {
            bmtupian.recycle();
            bmtupian = null;
        }
        if(bmtzg != null && !bmtzg.isRecycled())
        {
            bmtzg.recycle();
            bmtzg = null;
        }
        System.gc();
    }

    public void setdrawablewx(int i)
    {
//        i;
//        JVM INSTR tableswitch 0 9: default 56
//    //                   0 109
//    //                   1 136
//    //                   2 165
//    //                   3 194
//    //                   4 223
//    //                   5 252
//    //                   6 281
//    //                   7 310
//    //                   8 339
//    //                   9 368;
//           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11
//_L1:
//        bdtupian = new BitmapDrawable(getResources(), bmtupian);
//        buttontupian.setBackgroundDrawable(bdtupian);
//        bdtzg = new BitmapDrawable(getResources(), bmtzg);
//        buttontzg.setBackgroundDrawable(bdtzg);
//        return;
//_L2:
//        bmtupian = BitmapFactory.decodeResource(getResources(), 0x7f020017);
//        bmtzg = BitmapFactory.decodeResource(getResources(), 0x7f020039);
//        continue; /* Loop/switch isn't completed */
//_L3:
//        bmtupian = BitmapFactory.decodeResource(getResources(), 0x7f02002e);
//        bmtzg = BitmapFactory.decodeResource(getResources(), 0x7f020043);
//        continue; /* Loop/switch isn't completed */
//_L4:
//        bmtupian = BitmapFactory.decodeResource(getResources(), 0x7f020015);
//        bmtzg = BitmapFactory.decodeResource(getResources(), 0x7f020037);
//        continue; /* Loop/switch isn't completed */
//_L5:
//        bmtupian = BitmapFactory.decodeResource(getResources(), 0x7f020148);
//        bmtzg = BitmapFactory.decodeResource(getResources(), 0x7f02003b);
//        continue; /* Loop/switch isn't completed */
//_L6:
//        bmtupian = BitmapFactory.decodeResource(getResources(), 0x7f020018);
//        bmtzg = BitmapFactory.decodeResource(getResources(), 0x7f02003a);
//        continue; /* Loop/switch isn't completed */
//_L7:
//        bmtupian = BitmapFactory.decodeResource(getResources(), 0x7f020016);
//        bmtzg = BitmapFactory.decodeResource(getResources(), 0x7f020038);
//        continue; /* Loop/switch isn't completed */
//_L8:
//        bmtupian = BitmapFactory.decodeResource(getResources(), 0x7f02002f);
//        bmtzg = BitmapFactory.decodeResource(getResources(), 0x7f020042);
//        continue; /* Loop/switch isn't completed */
//_L9:
//        bmtupian = BitmapFactory.decodeResource(getResources(), 0x7f020143);
//        bmtzg = BitmapFactory.decodeResource(getResources(), 0x7f020045);
//        continue; /* Loop/switch isn't completed */
//_L10:
//        bmtupian = BitmapFactory.decodeResource(getResources(), 0x7f02014a);
//        bmtzg = BitmapFactory.decodeResource(getResources(), 0x7f020049);
//        continue; /* Loop/switch isn't completed */
//_L11:
//        bmtupian = BitmapFactory.decodeResource(getResources(), 0x7f02002b);
//        bmtzg = BitmapFactory.decodeResource(getResources(), 0x7f020041);
//        if(true) goto _L1; else goto _L12
//_L12:
    	switch (i) {
		case 0:
	        bmtupian = BitmapFactory.decodeResource(getResources(), 0x7f020017);
	        bmtzg = BitmapFactory.decodeResource(getResources(), 0x7f020039);
			break;
		case 1:
	        bmtupian = BitmapFactory.decodeResource(getResources(), 0x7f02002e);
	        bmtzg = BitmapFactory.decodeResource(getResources(), 0x7f020043);
			break;
		case 2:
	        bmtupian = BitmapFactory.decodeResource(getResources(), 0x7f020015);
	        bmtzg = BitmapFactory.decodeResource(getResources(), 0x7f020037);
			break;
		case 3:
	        bmtupian = BitmapFactory.decodeResource(getResources(), 0x7f020148);
	        bmtzg = BitmapFactory.decodeResource(getResources(), 0x7f02003b);
			break;
		case 4:
	        bmtupian = BitmapFactory.decodeResource(getResources(), 0x7f020018);
	        bmtzg = BitmapFactory.decodeResource(getResources(), 0x7f02003a);
			break;
		case 5:
	        bmtupian = BitmapFactory.decodeResource(getResources(), 0x7f020016);
	        bmtzg = BitmapFactory.decodeResource(getResources(), 0x7f020038);
			break;
		case 6:
	        bmtupian = BitmapFactory.decodeResource(getResources(), 0x7f02002f);
	        bmtzg = BitmapFactory.decodeResource(getResources(), 0x7f020042);
			break;
		case 7:
	        bmtupian = BitmapFactory.decodeResource(getResources(), 0x7f020143);
	        bmtzg = BitmapFactory.decodeResource(getResources(), 0x7f020045);
			break;
		case 8:
	        bmtupian = BitmapFactory.decodeResource(getResources(), 0x7f02014a);
	        bmtzg = BitmapFactory.decodeResource(getResources(), 0x7f020049);
			break;
		case 9:
	        bmtupian = BitmapFactory.decodeResource(getResources(), 0x7f02002b);
	        bmtzg = BitmapFactory.decodeResource(getResources(), 0x7f020041);
			break;

		default:
			break;
		}
      bdtupian = new BitmapDrawable(getResources(), bmtupian);
      buttontupian.setBackgroundDrawable(bdtupian);
      bdtzg = new BitmapDrawable(getResources(), bmtzg);
      buttontzg.setBackgroundDrawable(bdtzg);
    }

    public void setsoundwx(int i)
    {
//        i;
//        JVM INSTR tableswitch 0 9: default 56
//    //                   0 57
//    //                   1 92
//    //                   2 129
//    //                   3 166
//    //                   4 203
//    //                   5 240
//    //                   6 277
//    //                   7 314
//    //                   8 351
//    //                   9 388;
//           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11
//_L1:
//        return;
//_L2:
//        mpyuyin = MediaPlayer.create(this, 0x7f050007);
//        mpjiaosheng = MediaPlayer.create(this, 0x7f050007);
//        buttonback.setEnabled(false);
//        buttonnext.setEnabled(true);
//        continue; /* Loop/switch isn't completed */
//_L3:
//        mpyuyin = MediaPlayer.create(this, 0x7f05000e);
//        mpjiaosheng = MediaPlayer.create(this, 0x7f05000e);
//        buttonback.setEnabled(true);
//        buttonnext.setEnabled(true);
//        continue; /* Loop/switch isn't completed */
//_L4:
//        mpyuyin = MediaPlayer.create(this, 0x7f050005);
//        mpjiaosheng = MediaPlayer.create(this, 0x7f050005);
//        buttonback.setEnabled(true);
//        buttonnext.setEnabled(true);
//        continue; /* Loop/switch isn't completed */
//_L5:
//        mpyuyin = MediaPlayer.create(this, 0x7f050009);
//        mpjiaosheng = MediaPlayer.create(this, 0x7f050009);
//        buttonback.setEnabled(true);
//        buttonnext.setEnabled(true);
//        continue; /* Loop/switch isn't completed */
//_L6:
//        mpyuyin = MediaPlayer.create(this, 0x7f050008);
//        mpjiaosheng = MediaPlayer.create(this, 0x7f050008);
//        buttonback.setEnabled(true);
//        buttonnext.setEnabled(true);
//        continue; /* Loop/switch isn't completed */
//_L7:
//        mpyuyin = MediaPlayer.create(this, 0x7f050006);
//        mpjiaosheng = MediaPlayer.create(this, 0x7f050006);
//        buttonback.setEnabled(true);
//        buttonnext.setEnabled(true);
//        continue; /* Loop/switch isn't completed */
//_L8:
//        mpyuyin = MediaPlayer.create(this, 0x7f05000f);
//        mpjiaosheng = MediaPlayer.create(this, 0x7f05000f);
//        buttonback.setEnabled(true);
//        buttonnext.setEnabled(true);
//        continue; /* Loop/switch isn't completed */
//_L9:
//        mpyuyin = MediaPlayer.create(this, 0x7f050015);
//        mpjiaosheng = MediaPlayer.create(this, 0x7f050015);
//        buttonback.setEnabled(true);
//        buttonnext.setEnabled(true);
//        continue; /* Loop/switch isn't completed */
//_L10:
//        mpyuyin = MediaPlayer.create(this, 0x7f050022);
//        mpjiaosheng = MediaPlayer.create(this, 0x7f050022);
//        buttonback.setEnabled(true);
//        buttonnext.setEnabled(true);
//        continue; /* Loop/switch isn't completed */
//_L11:
//        mpyuyin = MediaPlayer.create(this, 0x7f05000c);
//        mpjiaosheng = MediaPlayer.create(this, 0x7f05000c);
//        buttonback.setEnabled(true);
//        buttonnext.setEnabled(false);
//        if(true) goto _L1; else goto _L12
//_L12:
    	switch (i) {
		case 0:
	        mpyuyin = MediaPlayer.create(this, 0x7f050007);
	        mpjiaosheng = MediaPlayer.create(this, 0x7f050007);
	        buttonback.setEnabled(false);
	        buttonnext.setEnabled(true);			
			break;
		case 1:
	        mpyuyin = MediaPlayer.create(this, 0x7f05000e);
	        mpjiaosheng = MediaPlayer.create(this, 0x7f05000e);
	        buttonback.setEnabled(true);
	        buttonnext.setEnabled(true);
			break;
		case 2:
	        mpyuyin = MediaPlayer.create(this, 0x7f050005);
	        mpjiaosheng = MediaPlayer.create(this, 0x7f050005);
	        buttonback.setEnabled(true);
	        buttonnext.setEnabled(true);
			break;
		case 3:
	        mpyuyin = MediaPlayer.create(this, 0x7f050009);
	        mpjiaosheng = MediaPlayer.create(this, 0x7f050009);
	        buttonback.setEnabled(true);
	        buttonnext.setEnabled(true);
			break;
		case 4:
	        mpyuyin = MediaPlayer.create(this, 0x7f050008);
	        mpjiaosheng = MediaPlayer.create(this, 0x7f050008);
	        buttonback.setEnabled(true);
	        buttonnext.setEnabled(true);
			break;
		case 5:
	        mpyuyin = MediaPlayer.create(this, 0x7f050006);
	        mpjiaosheng = MediaPlayer.create(this, 0x7f050006);
	        buttonback.setEnabled(true);
	        buttonnext.setEnabled(true);
			break;
		case 6:
	        mpyuyin = MediaPlayer.create(this, 0x7f05000f);
	        mpjiaosheng = MediaPlayer.create(this, 0x7f05000f);
	        buttonback.setEnabled(true);
	        buttonnext.setEnabled(true);
			break;
		case 7:
	        mpyuyin = MediaPlayer.create(this, 0x7f050015);
	        mpjiaosheng = MediaPlayer.create(this, 0x7f050015);
	        buttonback.setEnabled(true);
	        buttonnext.setEnabled(true);
			break;
		case 8:
	        mpyuyin = MediaPlayer.create(this, 0x7f050022);
	        mpjiaosheng = MediaPlayer.create(this, 0x7f050022);
	        buttonback.setEnabled(true);
	        buttonnext.setEnabled(true);
			break;
		case 9:
	        mpyuyin = MediaPlayer.create(this, 0x7f05000c);
	        mpjiaosheng = MediaPlayer.create(this, 0x7f05000c);
	        buttonback.setEnabled(true);
	        buttonnext.setEnabled(false);
			break;

		default:
			break;
		}
    }

    public void setwx(int i)
    {
        if(i > 9)
            numx = 9;
        if(i < 1)
            numx = 0;
        recyclewx();
        setsoundwx(numx);
        setdrawablewx(numx);
    }

    public void showAnzhiAD()
    {
//        myAdonContainerView = (RelativeLayout)findViewById(0x7f0c010c);
//        myAdView = new AdBanner(this);
//        myAdonContainerView.addView(myAdView);
//        myAdView.setAppKey(appKey);
//        RecevieAdListener recevieadlistener = new RecevieAdListener() {
//
//            public void onFailedToRecevieAd(AdBanner adbanner)
//            {
//                myAdonContainerView.setVisibility(8);
//                Yingwen.bl_desbt = false;
//            }
//
//            public void onSucessedRecevieAd(AdBanner adbanner)
//            {
//                myAdonContainerView.setVisibility(0);
//                Yingwen.bl_desbt = true;
//            }
//
//            final Yingwen this$0;
//
//            
//            {
//                this$0 = Yingwen.this;
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

    public void switchwx()
    {
        switch(numx)
        {
        case 1: // '\001'
        case 2: // '\002'
        case 9: // '\t'
        default:
            return;
        }
    }

    public static boolean adShowbt;
    public static BitmapDrawable bdtupian;
    public static BitmapDrawable bdtzg;
    public static boolean bl_desbt;
    public static Bitmap bmtupian;
    public static Bitmap bmtzg;
    public static ImageButton buttonback;
    public static ImageButton buttonnext;
    public static ImageButton buttontupian;
    public static ImageButton buttontzg;
    public static ImageButton buttonyuyin;
//    public static ImageView imagesybyj;
    public static MediaPlayer mpjiaosheng;
    public static MediaPlayer mpyuyin;
    public static int numx;
    public static boolean onoff_one;
    public static boolean onoff_ten;
    public static boolean onoff_two;
    public static android.graphics.BitmapFactory.Options opts;
    public static String strADbt;
    public static String strYYbt;
    Animation ani_bt_left;
    Animation ani_bt_right;
    Animation ani_bt_tp;
    private String appKey;
//    private AdBanner myAdView;
    private RelativeLayout myAdonContainerView;
    SharedPreferences preferences;

}
