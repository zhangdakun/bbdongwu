// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.dwbk.dwbks;

import android.app.Activity;
import android.content.*;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
//import com.umeng.analytics.MobclickAgent;

// Referenced classes of package com.dwbk.dwbks:
//            MainActivity

public class Home extends Activity
{

    public Home()
    {
    }

    public void chushihua()
    {
        bl_one = false;
        bl_two = false;
        bl_zhu = false;
        gn_one = false;
        gn_two = false;
        gn_zhu = false;
        hometomain = new Intent();
        homeback = (ImageView)findViewById(0x7f0c0016);
        homeback.setBackgroundResource(0x7f02001a);
        textwlts = (TextView)findViewById(0x7f0c0020);
        textwlts.setText("\u63D0\u793A\uFF1A\u5F00\u542F\u7279\u6B8A\u529F\u80FD\u65F6\uFF0C\u9700\u8981\u8FDE\u63A5\u7F51\u7EDC");
        textone = (TextView)findViewById(0x7f0c0017);
        textone.setText("\u5F00\u542F\u72D7\u72D7\u58A8\u955C");
        textone.setTextSize(20F);
        btone = (ImageButton)findViewById(0x7f0c0018);
        btone.setBackgroundResource(0x7f020003);
        fgx = (ImageView)findViewById(0x7f0c0019);
        fgx.setBackgroundResource(0x7f020006);
        texttwo = (TextView)findViewById(0x7f0c001a);
        texttwo.setText("\u5F00\u542F\u70AB\u5F69\u516C\u9E21");
        texttwo.setTextSize(20F);
        bttwo = (ImageButton)findViewById(0x7f0c001b);
        bttwo.setBackgroundResource(0x7f020003);
        fgx2 = (ImageView)findViewById(0x7f0c001c);
        fgx2.setBackgroundResource(0x7f020006);
        textzhu = (TextView)findViewById(0x7f0c001d);
        textzhu.setText("\u5F00\u542F\u5BB3\u7F9E\u732A\u516B\u6212");
        textzhu.setTextSize(20F);
        btzhu = (ImageButton)findViewById(0x7f0c001e);
        btzhu.setBackgroundResource(0x7f020003);
        fgx3 = (ImageView)findViewById(0x7f0c001f);
        fgx3.setBackgroundResource(0x7f020006);
        textone.setTextColor(Color.rgb(255, 0, 0));
        texttwo.setTextColor(Color.rgb(255, 0, 0));
        textzhu.setTextColor(Color.rgb(255, 0, 0));
        hometomain.setClass(this,  MainActivity.class);
        preferences = getSharedPreferences("name", 0);
        editor = preferences.edit();
        gn_one = preferences.getBoolean("gongneng_one", false);
        gn_two = preferences.getBoolean("gongneng_two", false);
        gn_zhu = preferences.getBoolean("gongneng_ten", false);
        bl_one = preferences.getBoolean("one_boolean_key", false);
        bl_two = preferences.getBoolean("two_boolean_key", false);
        bl_zhu = preferences.getBoolean("ten_boolean_key", false);
        if(bl_one)
        {
            btone.setBackgroundResource(0x7f020004);
            textone.setTextColor(Color.rgb(0, 0, 255));
        } else
        {
            btone.setBackgroundResource(0x7f020003);
            textone.setTextColor(Color.rgb(255, 0, 0));
        }
        if(bl_two)
        {
            bttwo.setBackgroundResource(0x7f020004);
            texttwo.setTextColor(Color.rgb(0, 0, 255));
        } else
        {
            bttwo.setBackgroundResource(0x7f020003);
            texttwo.setTextColor(Color.rgb(255, 0, 0));
        }
        if(bl_zhu)
        {
            btzhu.setBackgroundResource(0x7f020004);
            textzhu.setTextColor(Color.rgb(0, 0, 255));
        } else
        {
            btzhu.setBackgroundResource(0x7f020003);
            textzhu.setTextColor(Color.rgb(255, 0, 0));
        }
    }

    public void dog_mojing()
    {
        boolean flag;
        if(bl_one)
            flag = false;
        else
            flag = true;
        bl_one = flag;
        if(bl_one)
        {
            btone.setBackgroundResource(0x7f020004);
            textone.setTextColor(Color.rgb(0, 0, 255));
            editor.putBoolean("one_boolean_key", true);
        } else
        {
            btone.setBackgroundResource(0x7f020003);
            textone.setTextColor(Color.rgb(255, 0, 0));
            editor.putBoolean("one_boolean_key", false);
        }
        editor.commit();
        setResult(-1, hometomain);
    }

    public void duihuakuang()
    {
        (new android.app.AlertDialog.Builder(this)).setTitle("\u60A8\u7684M\u5E01\u4F59\u989D\u4E0D\u8DB3").setMessage("\u5F00\u542F\u6B64\u529F\u80FD\u9700\u8981100M\u5E01\uFF0C\u53BB\u514D\u8D39\u8D5A\u53D6M\u5E01\u5427\uFF01").setCancelable(false).setPositiveButton("\u514D\u8D39\u8D5A\u53D6M\u5E01", new android.content.DialogInterface.OnClickListener() {

            public void onClick(DialogInterface dialoginterface, int i)
            {
            }

//            final Home this$0;
//
//            
//            {
//                this$0 = Home.this;
//                super();
//            }
        }
).setNegativeButton("\u53D6\u6D88", new android.content.DialogInterface.OnClickListener() {

            public void onClick(DialogInterface dialoginterface, int i)
            {
                dialoginterface.cancel();
            }

//            final Home this$0;
//
//            
//            {
//                this$0 = Home.this;
//                super();
//            }
        }
).show();
    }

    public void ji_xuancai()
    {
        boolean flag;
        if(bl_two)
            flag = false;
        else
            flag = true;
        bl_two = flag;
        if(bl_two)
        {
            bttwo.setBackgroundResource(0x7f020004);
            texttwo.setTextColor(Color.rgb(0, 0, 255));
            editor.putBoolean("two_boolean_key", true);
        } else
        {
            bttwo.setBackgroundResource(0x7f020003);
            texttwo.setTextColor(Color.rgb(255, 0, 0));
            editor.putBoolean("two_boolean_key", false);
        }
        editor.commit();
        setResult(-1, hometomain);
    }

    public void kaiqi(int i)
    {
//        i;
//        JVM INSTR lookupswitch 3: default 36
//    //                   1: 37
//    //                   2: 72
//    //                   10: 107;
//           goto _L1 _L2 _L3 _L4
//_L1:
//        return;
//_L2:
//        gn_one = true;
//        editor.putBoolean("gongneng_one", true);
//        editor.commit();
//        dog_mojing();
//        continue; /* Loop/switch isn't completed */
//_L3:
//        gn_two = true;
//        editor.putBoolean("gongneng_two", true);
//        editor.commit();
//        ji_xuancai();
//        continue; /* Loop/switch isn't completed */
//_L4:
//        gn_zhu = true;
//        editor.putBoolean("gongneng_ten", true);
//        editor.commit();
//        zhu_zhubajie();
//        if(true) goto _L1; else goto _L5
//_L5:
    	
    	switch(i) {
    	case 1:
          gn_one = true;
          editor.putBoolean("gongneng_one", true);
          editor.commit();
          dog_mojing();
    		break;
    	case 2:
          gn_two = true;
          editor.putBoolean("gongneng_two", true);
          editor.commit();
          ji_xuancai();
    		break;
    	case 10:
          gn_zhu = true;
          editor.putBoolean("gongneng_ten", true);
          editor.commit();
          zhu_zhubajie();
    		break;
    	}
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f030004);
        chushihua();
        btone.setOnClickListener(new android.view.View.OnClickListener() {

            public void onClick(View view)
            {
                if(gn_one)
                    dog_mojing();
                else
                    xiaoFei(100, 1);
            }

//            final Home this$0;
//
//            
//            {
//                this$0 = Home.this;
//                super();
//            }
        }
);
        bttwo.setOnClickListener(new android.view.View.OnClickListener() {

            public void onClick(View view)
            {
                if(gn_two)
                    ji_xuancai();
                else
                    xiaoFei(100, 2);
            }

//            final Home this$0;
//
//            
//            {
//                this$0 = Home.this;
//                super();
//            }
        }
);
        btzhu.setOnClickListener(new android.view.View.OnClickListener() {

            public void onClick(View view)
            {
                if(gn_zhu)
                    zhu_zhubajie();
                else
                    xiaoFei(100, 10);
            }

//            final Home this$0;
//
//            
//            {
//                this$0 = Home.this;
//                super();
//            }
        }
);
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

    public void xiaoFei(int i, int j)
    {
    }

    public void zhu_zhubajie()
    {
        boolean flag;
        if(bl_zhu)
            flag = false;
        else
            flag = true;
        bl_zhu = flag;
        if(bl_zhu)
        {
            btzhu.setBackgroundResource(0x7f020004);
            textzhu.setTextColor(Color.rgb(0, 0, 255));
            editor.putBoolean("ten_boolean_key", true);
        } else
        {
            btzhu.setBackgroundResource(0x7f020003);
            textzhu.setTextColor(Color.rgb(255, 0, 0));
            editor.putBoolean("ten_boolean_key", false);
        }
        editor.commit();
        setResult(-1, hometomain);
    }

    public static ImageView fgx;
    public static ImageView fgx2;
    public static ImageView fgx3;
    public static ImageView homeback;
    public boolean bl_one;
    public boolean bl_two;
    public boolean bl_zhu;
    public ImageButton btone;
    public ImageButton bttwo;
    public ImageButton btzhu;
    android.content.SharedPreferences.Editor editor;
    public boolean gn_one;
    public boolean gn_two;
    public boolean gn_zhu;
    public Intent hometomain;
    SharedPreferences preferences;
    public TextView textone;
    public TextView texttwo;
    public TextView textwlts;
    public TextView textzhu;
}
