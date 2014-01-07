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
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
//import com.adfeiwo.banner.AdBanner;
//import com.adfeiwo.banner.RecevieAdListener;
//import com.feiwo.coverscreen.CoverAdComponent;
//import com.umeng.analytics.MobclickAgent;

// Referenced classes of package com.dwbk.dwbks:
//            SurfaceActivity

public class MainActivity extends ADbaseActivity
{

	private Context mContext ;
    public MainActivity()
    {
        appKey = "02hkUFq82pqaq0hTY378wPJ6";
    }

    public void chushihuawx()
    {
        onoff_one = false;
        onoff_two = false;
        onoff_ten = false;
        numx = 0;
        buttontupian = (ImageButton)findViewById(0x7f0c0000);
        buttonback = (ImageButton)findViewById(0x7f0c0001);
        buttonnext = (ImageButton)findViewById(0x7f0c0002);
        buttontzg = (ImageButton)findViewById(0x7f0c0003);
        buttonyuyin = (ImageButton)findViewById(0x7f0c0004);
        opts = new android.graphics.BitmapFactory.Options();
        opts.inSampleSize = 2;
        bmtupian = BitmapFactory.decodeResource(getResources(), 0x7f020005, opts);
        bdtupian = new BitmapDrawable(getResources(), bmtupian);
        buttontupian.setBackgroundDrawable(bdtupian);
        bmtzg = BitmapFactory.decodeResource(getResources(), 0x7f020035);
        bdtzg = new BitmapDrawable(getResources(), bmtzg);
        buttontzg.setBackgroundDrawable(bdtzg);
        buttonback.setEnabled(false);
        buttonyuyin.setBackgroundResource(0x7f020149);
        buttonback.setBackgroundResource(0x7f020025);
        buttonnext.setBackgroundResource(0x7f020025);
        mpjiaosheng = MediaPlayer.create(this, 0x7f05000b);
        mpyuyin = MediaPlayer.create(this, 0x7f050016);
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
//        if(true) goto _L1; else goto _L3
//_L3:
        switch (j) {
		case -1:
	        preferences = getSharedPreferences("name", 0);
	        onoff_one = preferences.getBoolean("one_boolean_key", false);
	        onoff_two = preferences.getBoolean("two_boolean_key", false);
	        onoff_ten = preferences.getBoolean("ten_boolean_key", false);
			break;

		default:
			break;
		}
    }

    public void onClickAd()
    {
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
//        setContentView(0x7f030000);
        setContentView(R.layout.activity_main);
        LinearLayout adLayout = (LinearLayout) findViewById(R.id.adLayout);
        AdView adView = new AdView(this, AdSize.FIT_SCREEN);
        adLayout.addView(adView);
        
        mContext = this;
        chushihuawx();
        ani_bt_left = AnimationUtils.loadAnimation(this, 0x7f040000);
        ani_bt_right = AnimationUtils.loadAnimation(this, 0x7f040000);
        ani_bt_tp = AnimationUtils.loadAnimation(this, 0x7f040000);
        bl_desbt = false;
        adShowbt = false;
//        strADbt = MobclickAgent.getConfigParams(this, "dwbkmain_adshow_hiapk");
//        if("".equals(strADbt))
//            adShowbt = false;
//        if(strADbt.equals("on"))
//            adShowbt = true;
//        if(strADbt.equals("off"))
//            adShowbt = false;
//        if(adShowbt)
//            showAnzhiAD();
        buttonback.setOnClickListener(new android.view.View.OnClickListener() {

            public void onClick(View view)
            {
                SurfaceActivity.mpclick.start();
                MainActivity.numx = -1 + MainActivity.numx;
                MainActivity.buttonback.startAnimation(ani_bt_left);
                setwx(MainActivity.numx);
            }

//            final MainActivity this$0;
//
//            
//            {
//                this$0 = MainActivity.this;
//                super();
//            }
        }
);
        buttonnext.setOnClickListener(new android.view.View.OnClickListener() {

            public void onClick(View view)
            {
            	if(MainActivity.numx > 7) {
            		if(!AD.haveOffers(mContext)) {
            			return;
            		}
            	}
                SurfaceActivity.mpclick.start();
                MainActivity.numx = 1 + MainActivity.numx;
                MainActivity.buttonnext.startAnimation(ani_bt_right);
                setwx(MainActivity.numx);
            }

//            final MainActivity this$0;
//
//            
//            {
//                this$0 = MainActivity.this;
//                super();
//            }
        }
);
        buttontupian.setOnClickListener(new android.view.View.OnClickListener() {

            public void onClick(View view)
            {
                MainActivity.mpjiaosheng.start();
                MainActivity.buttontupian.startAnimation(ani_bt_tp);
            }

//            final MainActivity this$0;
//
//            
//            {
//                this$0 = MainActivity.this;
//                super();
//            }
        }
);
        buttonyuyin.setOnClickListener(new android.view.View.OnClickListener() {

            public void onClick(View view)
            {
                MainActivity.mpyuyin.start();
            }

//            final MainActivity this$0;
//
//            
//            {
//                this$0 = MainActivity.this;
//                super();
//            }
        }
);
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

    public void onDisplayAd()
    {
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
//        JVM INSTR tableswitch 0 10: default 60
//    //                   0 113
//    //                   1 143
//    //                   2 175
//    //                   3 207
//    //                   4 239
//    //                   5 271
//    //                   6 303
//    //                   7 335
//    //                   8 367
//    //                   9 399
//    //                   10 431;
//           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12
//_L1:
//        bdtupian = new BitmapDrawable(getResources(), bmtupian);
//        buttontupian.setBackgroundDrawable(bdtupian);
//        bdtzg = new BitmapDrawable(getResources(), bmtzg);
//        buttontzg.setBackgroundDrawable(bdtzg);
//        return;
//_L2:
//        bmtupian = BitmapFactory.decodeResource(getResources(), 0x7f020005, opts);
//        bmtzg = BitmapFactory.decodeResource(getResources(), 0x7f020035);
//        continue; /* Loop/switch isn't completed */
//_L3:
//        bmtupian = BitmapFactory.decodeResource(getResources(), 0x7f02000a, opts);
//        bmtzg = BitmapFactory.decodeResource(getResources(), 0x7f020036);
//        continue; /* Loop/switch isn't completed */
//_L4:
//        bmtupian = BitmapFactory.decodeResource(getResources(), 0x7f020020, opts);
//        bmtzg = BitmapFactory.decodeResource(getResources(), 0x7f02003c);
//        continue; /* Loop/switch isn't completed */
//_L5:
//        bmtupian = BitmapFactory.decodeResource(getResources(), 0x7f020026, opts);
//        bmtzg = BitmapFactory.decodeResource(getResources(), 0x7f02003d);
//        continue; /* Loop/switch isn't completed */
//_L6:
//        bmtupian = BitmapFactory.decodeResource(getResources(), 0x7f020027, opts);
//        bmtzg = BitmapFactory.decodeResource(getResources(), 0x7f02003e);
//        continue; /* Loop/switch isn't completed */
//_L7:
//        bmtupian = BitmapFactory.decodeResource(getResources(), 0x7f020029, opts);
//        bmtzg = BitmapFactory.decodeResource(getResources(), 0x7f02003f);
//        continue; /* Loop/switch isn't completed */
//_L8:
//        bmtupian = BitmapFactory.decodeResource(getResources(), 0x7f02002a, opts);
//        bmtzg = BitmapFactory.decodeResource(getResources(), 0x7f020040);
//        continue; /* Loop/switch isn't completed */
//_L9:
//        bmtupian = BitmapFactory.decodeResource(getResources(), 0x7f020145, opts);
//        bmtzg = BitmapFactory.decodeResource(getResources(), 0x7f020046);
//        continue; /* Loop/switch isn't completed */
//_L10:
//        bmtupian = BitmapFactory.decodeResource(getResources(), 0x7f020146, opts);
//        bmtzg = BitmapFactory.decodeResource(getResources(), 0x7f020047);
//        continue; /* Loop/switch isn't completed */
//_L11:
//        bmtupian = BitmapFactory.decodeResource(getResources(), 0x7f02014b, opts);
//        bmtzg = BitmapFactory.decodeResource(getResources(), 0x7f020048);
//        continue; /* Loop/switch isn't completed */
//_L12:
//        bmtupian = BitmapFactory.decodeResource(getResources(), 0x7f020034, opts);
//        bmtzg = BitmapFactory.decodeResource(getResources(), 0x7f020044);
//        if(true) goto _L1; else goto _L13
//_L13:
    	switch (i) {
		case 0:
	        bmtupian = BitmapFactory.decodeResource(getResources(), 0x7f020005, opts);
	        bmtzg = BitmapFactory.decodeResource(getResources(), 0x7f020035);			
			break;
		case 1:
	        bmtupian = BitmapFactory.decodeResource(getResources(), 0x7f02000a, opts);
	        bmtzg = BitmapFactory.decodeResource(getResources(), 0x7f020036);
			break;
		case 2:
	        bmtupian = BitmapFactory.decodeResource(getResources(), 0x7f020020, opts);
	        bmtzg = BitmapFactory.decodeResource(getResources(), 0x7f02003c);
			break;
		case 3:
	        bmtupian = BitmapFactory.decodeResource(getResources(), 0x7f020026, opts);
	        bmtzg = BitmapFactory.decodeResource(getResources(), 0x7f02003d);
			break;
		case 4:
	        bmtupian = BitmapFactory.decodeResource(getResources(), 0x7f020027, opts);
	        bmtzg = BitmapFactory.decodeResource(getResources(), 0x7f02003e);
			break;
		case 5:
	        bmtupian = BitmapFactory.decodeResource(getResources(), 0x7f020029, opts);
	        bmtzg = BitmapFactory.decodeResource(getResources(), 0x7f02003f);
			break;
		case 6:
	        bmtupian = BitmapFactory.decodeResource(getResources(), 0x7f02002a, opts);
	        bmtzg = BitmapFactory.decodeResource(getResources(), 0x7f020040);
			break;
		case 7:
	        bmtupian = BitmapFactory.decodeResource(getResources(), 0x7f020145, opts);
	        bmtzg = BitmapFactory.decodeResource(getResources(), 0x7f020046);
			break;
		case 8:
	        bmtupian = BitmapFactory.decodeResource(getResources(), 0x7f020146, opts);
	        bmtzg = BitmapFactory.decodeResource(getResources(), 0x7f020047);
			break;
		case 9:
	        bmtupian = BitmapFactory.decodeResource(getResources(), 0x7f02014b, opts);
	        bmtzg = BitmapFactory.decodeResource(getResources(), 0x7f020048);
			break;
		case 10:
	        bmtupian = BitmapFactory.decodeResource(getResources(), 0x7f020034, opts);
	        bmtzg = BitmapFactory.decodeResource(getResources(), 0x7f020044);
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
//        JVM INSTR tableswitch 0 10: default 60
//    //                   0 61
//    //                   1 96
//    //                   2 133
//    //                   3 170
//    //                   4 207
//    //                   5 244
//    //                   6 281
//    //                   7 318
//    //                   8 355
//    //                   9 392
//    //                   10 429;
//           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12
//_L1:
//        return;
//_L2:
//        mpyuyin = MediaPlayer.create(this, 0x7f050016);
//        mpjiaosheng = MediaPlayer.create(this, 0x7f05000b);
//        buttonback.setEnabled(false);
//        buttonnext.setEnabled(true);
//        continue; /* Loop/switch isn't completed */
//_L3:
//        mpyuyin = MediaPlayer.create(this, 0x7f050017);
//        mpjiaosheng = MediaPlayer.create(this, 0x7f050014);
//        buttonback.setEnabled(true);
//        buttonnext.setEnabled(true);
//        continue; /* Loop/switch isn't completed */
//_L4:
//        mpyuyin = MediaPlayer.create(this, 0x7f050018);
//        mpjiaosheng = MediaPlayer.create(this, 0x7f050013);
//        buttonback.setEnabled(true);
//        buttonnext.setEnabled(true);
//        continue; /* Loop/switch isn't completed */
//_L5:
//        mpyuyin = MediaPlayer.create(this, 0x7f050019);
//        mpjiaosheng = MediaPlayer.create(this, 0x7f050004);
//        buttonback.setEnabled(true);
//        buttonnext.setEnabled(true);
//        continue; /* Loop/switch isn't completed */
//_L6:
//        mpyuyin = MediaPlayer.create(this, 0x7f05001a);
//        mpjiaosheng = MediaPlayer.create(this, 0x7f050003);
//        buttonback.setEnabled(true);
//        buttonnext.setEnabled(true);
//        continue; /* Loop/switch isn't completed */
//_L7:
//        mpyuyin = MediaPlayer.create(this, 0x7f05001b);
//        mpjiaosheng = MediaPlayer.create(this, 0x7f050010);
//        buttonback.setEnabled(true);
//        buttonnext.setEnabled(true);
//        continue; /* Loop/switch isn't completed */
//_L8:
//        mpyuyin = MediaPlayer.create(this, 0x7f05001c);
//        mpjiaosheng = MediaPlayer.create(this, 0x7f05000d);
//        buttonback.setEnabled(true);
//        buttonnext.setEnabled(true);
//        continue; /* Loop/switch isn't completed */
//_L9:
//        mpyuyin = MediaPlayer.create(this, 0x7f05001f);
//        mpjiaosheng = MediaPlayer.create(this, 0x7f050001);
//        buttonback.setEnabled(true);
//        buttonnext.setEnabled(true);
//        continue; /* Loop/switch isn't completed */
//_L10:
//        mpyuyin = MediaPlayer.create(this, 0x7f050020);
//        mpjiaosheng = MediaPlayer.create(this, 0x7f05000a);
//        buttonback.setEnabled(true);
//        buttonnext.setEnabled(true);
//        continue; /* Loop/switch isn't completed */
//_L11:
//        mpyuyin = MediaPlayer.create(this, 0x7f050021);
//        mpjiaosheng = MediaPlayer.create(this, 0x7f050012);
//        buttonback.setEnabled(true);
//        buttonnext.setEnabled(true);
//        continue; /* Loop/switch isn't completed */
//_L12:
//        mpyuyin = MediaPlayer.create(this, 0x7f05001d);
//        mpjiaosheng = MediaPlayer.create(this, 0x7f050002);
//        buttonback.setEnabled(true);
//        buttonnext.setEnabled(false);
//        if(true) goto _L1; else goto _L13
//_L13:
    	switch (i) {
		case 0:
	        mpyuyin = MediaPlayer.create(this, 0x7f050016);
	        mpjiaosheng = MediaPlayer.create(this, 0x7f05000b);
	        buttonback.setEnabled(false);
	        buttonnext.setEnabled(true);			
			break;
		case 1:
	        mpyuyin = MediaPlayer.create(this, 0x7f050017);
	        mpjiaosheng = MediaPlayer.create(this, 0x7f050014);
	        buttonback.setEnabled(true);
	        buttonnext.setEnabled(true);
			break;
		case 2:
	        mpyuyin = MediaPlayer.create(this, 0x7f050018);
	        mpjiaosheng = MediaPlayer.create(this, 0x7f050013);
	        buttonback.setEnabled(true);
	        buttonnext.setEnabled(true);
			break;
		case 3:
	        mpyuyin = MediaPlayer.create(this, 0x7f050019);
	        mpjiaosheng = MediaPlayer.create(this, 0x7f050004);
	        buttonback.setEnabled(true);
	        buttonnext.setEnabled(true);
			break;
		case 4:
	        mpyuyin = MediaPlayer.create(this, 0x7f05001a);
	        mpjiaosheng = MediaPlayer.create(this, 0x7f050003);
	        buttonback.setEnabled(true);
	        buttonnext.setEnabled(true);
			break;
		case 5:
	        mpyuyin = MediaPlayer.create(this, 0x7f05001b);
	        mpjiaosheng = MediaPlayer.create(this, 0x7f050010);
	        buttonback.setEnabled(true);
	        buttonnext.setEnabled(true);
			break;
		case 6:
	        mpyuyin = MediaPlayer.create(this, 0x7f05001c);
	        mpjiaosheng = MediaPlayer.create(this, 0x7f05000d);
	        buttonback.setEnabled(true);
	        buttonnext.setEnabled(true);
			break;
		case 7:
	        mpyuyin = MediaPlayer.create(this, 0x7f05001f);
	        mpjiaosheng = MediaPlayer.create(this, 0x7f050001);
	        buttonback.setEnabled(true);
	        buttonnext.setEnabled(true);
			break;
		case 8:
	        mpyuyin = MediaPlayer.create(this, 0x7f050020);
	        mpjiaosheng = MediaPlayer.create(this, 0x7f05000a);
	        buttonback.setEnabled(true);
	        buttonnext.setEnabled(true);
			break;
		case 9:
	        mpyuyin = MediaPlayer.create(this, 0x7f050021);
	        mpjiaosheng = MediaPlayer.create(this, 0x7f050012);
	        buttonback.setEnabled(true);
	        buttonnext.setEnabled(true);
			break;
		case 10:
	        mpyuyin = MediaPlayer.create(this, 0x7f05001d);
	        mpjiaosheng = MediaPlayer.create(this, 0x7f050002);
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
            numx = 10;
        if(i < 1)
            numx = 0;
        recyclewx();
        setsoundwx(numx);
        setdrawablewx(numx);
    }

    public void showAnzhiAD()
    {
        myAdonContainerView = (RelativeLayout)findViewById(0x7f0c0005);
//        myAdView = new AdBanner(this);
//        myAdonContainerView.addView(myAdView);
//        myAdView.setAppKey(appKey);
//        RecevieAdListener recevieadlistener = new RecevieAdListener() {
//
//            public void onFailedToRecevieAd(AdBanner adbanner)
//            {
//                myAdonContainerView.setVisibility(8);
//                MainActivity.bl_desbt = false;
//            }
//
//            public void onSucessedRecevieAd(AdBanner adbanner)
//            {
//                myAdonContainerView.setVisibility(0);
//                MainActivity.bl_desbt = true;
//            }
//
//            final MainActivity this$0;
//
//            
//            {
//                this$0 = MainActivity.this;
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
    public static MediaPlayer mpjiaosheng;
    public static MediaPlayer mpyuyin;
    public static int numx;
    public static boolean onoff_one;
    public static boolean onoff_ten;
    public static boolean onoff_two;
    public static android.graphics.BitmapFactory.Options opts;
    public static String strADbt;
    Animation ani_bt_left;
    Animation ani_bt_right;
    Animation ani_bt_tp;
    private String appKey;
//    private AdBanner myAdView;
    private RelativeLayout myAdonContainerView;
    SharedPreferences preferences;

}
