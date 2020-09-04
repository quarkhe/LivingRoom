package com.xing.livingroom;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

public class TravelActivity extends AppCompatActivity implements View.OnClickListener {

    private String TAG= TravelActivity.class.getSimpleName();
    private static final String VIDEO_SAMPLE = "tacoma_narrows";
    private VideoView videoView;
    private Button play,pause,repaly;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_travel);

        initView();
        videoView.setMediaController(new android.widget.MediaController(this));
        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/raw/xiongan"));

        videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                Log.i(TAG, "准备完毕");
                //mp.setLooping(true);
                videoView.start();
            }
        });
        videoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                Log.i(TAG,"播放完毕");
            }
        });
        videoView.setOnErrorListener(new MediaPlayer.OnErrorListener() {
            @Override
            public boolean onError(MediaPlayer mp, int what, int extra) {
                Log.e(TAG, "播放失败");
                return false;
            }
        });
    }

    /**
     * 初始化控件
     */
    private void initView()
    {
        videoView= findViewById(R.id.videoView);
        play = findViewById(R.id.button1);
        pause = findViewById(R.id.button2);
        repaly = findViewById(R.id.button3);

        play.setOnClickListener(this);
        pause.setOnClickListener(this);
        repaly.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button1:
                if(!videoView.isPlaying())
                {
                    videoView.start();
                }
                break;

            case R.id.button2:
                if(videoView.isPlaying())
                {
                    videoView.pause();
                }
                break;

            case R.id.button3:
                if(videoView.isPlaying())
                {
                    videoView.pause();
                    videoView.stopPlayback();
                    videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/raw/xiongan"));
                    videoView.start();
                }
                break;
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if(videoView!=null)
            videoView.suspend();
    }
}