package com.xing.livingroom;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;

import com.tencent.ai.tvs.framework.TVSFramework;

public class CallActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call);

        TVSFramework mTvsFramework = TVSFramework.getInstance(this);
        //mTvsFramework.addTTSListener(mTTSListener);
        //mTvsFramework.requestTTS("谭先生您好！很高兴为您服务，请问您有什么需求？");

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                mTvsFramework.requestTTS("" +
                        "谭先生您好！很高兴为您服务，请问您有什么需求？");
            }
        }, 3000);
    }
}