package com.xing.livingroom;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;

import com.tencent.ai.tvs.framework.TVSFramework;

public class SceneFiveActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scene_five);

        TVSFramework mTvsFramework = TVSFramework.getInstance(this);
        //mTvsFramework.addTTSListener(mTTSListener);
        mTvsFramework.requestTTS("" +
                "尊敬的张女士，按照医嘱，您现在应该服用2片六味地黄胶囊，祝您早日康复！");

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                mTvsFramework.requestTTS("" +
                        "您的六味地黄胶囊还剩3天的药量了，请问您需要嘉事堂药业给您配送吗？");
            }
        }, 10000);
    }
}