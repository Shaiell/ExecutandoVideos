package br.ici.treinamento.executandovideos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

public class PlayerActivity extends AppCompatActivity {

    VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player);

        // colocar em full screen
        View decorView = getWindow().getDecorView();
        int opcoes = View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(opcoes);

        //esconder a action bar
        getSupportActionBar().hide();

        //Executar o video
        videoView = findViewById(R.id.videoView);
        videoView.setMediaController(new MediaController(this));
        videoView.setVideoPath("android.resource://"+ getPackageName()+"/"+R.raw.video);
        videoView.start();
    }
}
