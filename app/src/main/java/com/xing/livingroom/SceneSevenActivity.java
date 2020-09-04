package com.xing.livingroom;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.tencent.ai.tvs.framework.TVSFramework;

public class SceneSevenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scene_seven);

        TVSFramework mTvsFramework = TVSFramework.getInstance(this);
        //mTvsFramework.addTTSListener(mTTSListener);
        mTvsFramework.requestTTS("" +
                "光大康乐养老社区建设在美丽的北戴河，" +
                "近期光大银行组织优质客户免费旅游参观，如果您感兴趣，请点屏幕");
    }
}