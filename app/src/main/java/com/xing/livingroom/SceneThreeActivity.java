package com.xing.livingroom;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.tencent.ai.tvs.framework.TVSFramework;

public class SceneThreeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scene_three);

        TVSFramework mTvsFramework = TVSFramework.getInstance(this);
        //mTvsFramework.addTTSListener(mTTSListener);
        mTvsFramework.requestTTS("" +
                "张女士您好！您在我们银行的风险评估马上到期了，为了不耽误您继续购买理财产品，需要您重新填写风险评估表。" +
                "下面我将每个问题发到屏幕上，您根据您的情况选择。这个过程我们会录像，您同意吗？");
    }
}