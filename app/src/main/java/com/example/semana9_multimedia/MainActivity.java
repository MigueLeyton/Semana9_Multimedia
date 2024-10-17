package com.example.semana9_multimedia;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        Button buttonIrAudio = findViewById(R.id.irAudio);
        buttonIrAudio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, audio.class);
                startActivity(intent);
            }
        });

        Button buttonIrVideo = findViewById(R.id.irVideo);
        buttonIrVideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, video.class);
                startActivity(intent);
            }
        });

        Button animateButton = findViewById(R.id.irGif);
        final ImageView imageView = findViewById(R.id.imageViewGif);
        animateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation fadeInAnimation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.fade_in);
                imageView.startAnimation(fadeInAnimation);
            }
        });

    }
}