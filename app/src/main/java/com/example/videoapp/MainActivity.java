package com.example.videoapp;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import java.net.URL;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        VideoView vview = findViewById(R.id.vv1);
        Uri urii = Uri.parse("android.resource://"+ getPackageName() + "/" + R.raw.vid1);
        vview.setVideoURI(urii);
        MediaController mcontroller = new MediaController(this);
        vview.setMediaController(mcontroller);
        mcontroller.setAnchorView(vview);
    }
}