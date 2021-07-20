package com.example.homework7;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class video extends AppCompatActivity {
    String videourl = "https://www.w3school.com.cn/example/html5/mov_bbb.mp4";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);
        VideoView videoView = findViewById(R.id.videoView);
        videoView.setVideoURI(Uri.parse(videourl));
        videoView.setMediaController(new MediaController(this));
        videoView.start();
    }

}
