package com.xing.livingroom;

import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.tencent.ai.tvs.framework.ITVSTTSListener;
import com.tencent.ai.tvs.framework.TVSFramework;

public class MainActivity extends AppCompatActivity {

    ITVSTTSListener mTTSListener = new ITVSTTSListener.Stub() {
        @Override
        public void onTTSStarted(String dialogRequestId) {
            Log.d("XingXing", "TTS开始，dialogRequestId = " + dialogRequestId);
        }

        @Override
        public void onGetTTSText(String dialogRequestId, String text, String tag) throws RemoteException {
        }

        @Override
        public void onTTSFinished(String dialogRequestId, boolean complete) {
            Log.d("XingXing", "TTS结束，dialogRequestId = " + dialogRequestId);
        }
    };
    private Button
            button_call, button_query, button_called, button_howto,
            button_health, button_push1_travel, button_push2_visit, button_sales;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_call = findViewById(R.id.button_call);
        button_query = findViewById(R.id.button_query);
        button_called = findViewById(R.id.button_called);
        button_howto = findViewById(R.id.button_howto);

        button_health = findViewById(R.id.button_health);
        button_push1_travel = findViewById(R.id.button_push1_travel);
        button_push2_visit = findViewById(R.id.button_push2_visit);
        button_sales = findViewById(R.id.button_sales);

        TVSFramework mTvsFramework = TVSFramework.getInstance(this);
        mTvsFramework.addTTSListener(mTTSListener);

        Animation animation = AnimationUtils.loadAnimation(this, R.anim.menu_anim);
        animation.setFillAfter(false);
        //button_call.setAnimation(animation);

        //Scene 1
        button_call.setOnClickListener(v -> {
            Intent intent = new Intent();
            intent.setClass(MainActivity.this, CallActivity.class);
            startActivity(intent);
        });

        //Scene 2
        button_query.setOnClickListener(v -> {
            Intent intent = new Intent();
            intent.setClass(MainActivity.this, QueryActivity.class);
            startActivity(intent);
        });

        //Scene 3
        button_called.setOnClickListener(v->{
            Intent intent = new Intent();
            intent.setClass(MainActivity.this, SceneThreeActivity.class);
            startActivity(intent);
        });

        //Scene 4
        button_howto.setOnClickListener(v->{
            Intent intent = new Intent();
            intent.setClass(MainActivity.this, HowtoActivity.class);
            startActivity(intent);
        });

        //Scene 5
        button_health.setOnClickListener(v->{
            Intent intent = new Intent();
            intent.setClass(MainActivity.this, SceneFiveActivity.class);
            startActivity(intent);
        });

        //Scene 6
        button_push1_travel.setOnClickListener(v -> {
            Intent intent = new Intent();
            intent.setClass(MainActivity.this, TravelActivity.class);
            startActivity(intent);
        });

        //Scene 7
        button_push2_visit.setOnClickListener(v->{
            Intent intent = new Intent();
            intent.setClass(MainActivity.this, SceneSevenActivity.class);
            startActivity(intent);
        });

        //Scene 8
        button_sales.setOnClickListener(v->{
            Intent intent = new Intent();
            intent.setClass(MainActivity.this, SceneEightActivity.class);
            startActivity(intent);
        });
    }
}