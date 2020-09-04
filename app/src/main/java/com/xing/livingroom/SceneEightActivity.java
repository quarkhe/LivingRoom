package com.xing.livingroom;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.tencent.ai.tvs.framework.TVSFramework;

public class SceneEightActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scene_eight);

        TVSFramework mTvsFramework = TVSFramework.getInstance(this);
        //mTvsFramework.addTTSListener(mTTSListener);
        mTvsFramework.requestTTS("" +
                "客户您好！光大银行在今天下午4点组织一次老年用品直播活动，现场会有抽奖以及大幅优惠，" +
                "您要是希望参加，我可以帮您设置闹钟......");
    }
}