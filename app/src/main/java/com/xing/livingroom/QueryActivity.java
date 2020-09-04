package com.xing.livingroom;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.tencent.ai.tvs.framework.TVSFramework;

public class QueryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_query);


        TVSFramework mTvsFramework = TVSFramework.getInstance(this);
        //mTvsFramework.addTTSListener(mTTSListener);
        mTvsFramework.requestTTS("您的帐户余额：99999元；最近到期理财产品：光大阳光金将于9天后到期！");
    }
}