package com.ebookfrenzy.videoplayer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.VideoView;
import android.widget.MediaController;
import android.util.Log;
import android.media.MediaPlayer;

public class VideoPlayerActivity extends AppCompatActivity {

    String TAG = "ebookfrenzy.videoplayer";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_player);

        final VideoView videoView =
                (VideoView) findViewById(R.id.videoView1);

        videoView.setVideoPath(
                "http://www.ebookfrenzy.com/android_book/movie.mp4");

        MediaController mediaController = new
                MediaController(this);
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);

        videoView.setOnPreparedListener(new
                MediaPlayer.OnPreparedListener() {
                     @Override
                     public void onPrepared(MediaPlayer mp) {
                               Log.i(TAG, "Duration = " +
                                    videoView.getDuration());
                     }
                });

        videoView.start();
    }
}
