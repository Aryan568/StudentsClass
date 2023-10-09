package com.example.studentclass;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.SeekBar;
import android.widget.Toast;
import android.widget.VideoView;

public class video extends AppCompatActivity {

    private VideoView videoView;
    private ImageButton btnPlayPause;
    private SeekBar seekBar;
    private boolean isPlaying = false;
    private Handler handler = new Handler();
//    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);

        videoView = findViewById(R.id.videoView);
        btnPlayPause = findViewById(R.id.btnPlayPause);
        seekBar = findViewById(R.id.seekBar);
//        button= findViewById(R.id.openPdfButton);
//
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent= new Intent(video.this, pdfview.class);
//                startActivity(intent);
//            }
//        });

//        String videoUrl = "android.resource://" + getPackageName() + "/" + R.raw.marvel;
//        String videoPath= getIntent().getStringExtra("video_path");
//        videoView.setVideoPath(videoPath);
        String videoPat = getIntent().getStringExtra("video_path");
        if (videoPat != null) {
            videoView.setVideoURI(Uri.parse(videoPat));
            videoView.start();
            isPlaying = true;
            btnPlayPause.setImageResource(R.drawable.pause);
            updateSeekBar();

        videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                // Set up the SeekBar's max value to the video duration
                seekBar.setMax(mp.getDuration());
            }
        });

        btnPlayPause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isPlaying) {
                    videoView.pause();
                    btnPlayPause.setImageResource(R.drawable.play);
                } else {
                    videoView.start();
                    btnPlayPause.setImageResource(R.drawable.pause);
                    updateSeekBar();
                }
                isPlaying = !isPlaying;
            }
        });

        videoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                btnPlayPause.setImageResource(R.drawable.play);
                isPlaying = false;
            }
        });

        // SeekBar listener to seek the video
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                if (fromUser) {
                    videoView.seekTo(progress);
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });
    } else {
        // Handle a null video path (e.g., display an error message)
        Toast.makeText(this, "Invalid video path", Toast.LENGTH_SHORT).show();
    }
}

    private void updateSeekBar() {
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                if (videoView.isPlaying()) {
                    int currentPosition = videoView.getCurrentPosition();
                    seekBar.setProgress(currentPosition);
                    updateSeekBar();
                }
            }
        }, 1000); // Update every 1 second
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        handler.removeCallbacksAndMessages(null);
    }
}