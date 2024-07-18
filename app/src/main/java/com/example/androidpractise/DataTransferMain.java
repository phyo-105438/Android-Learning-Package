package com.example.androidpractise;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class DataTransferMain extends AppCompatActivity {
    public EditText editText;
    public Button btn_1, btn_2;
    public TextView play , result;
    public MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.data_transfer_main);
        init();
    }

    public void init(){
        editText = findViewById(R.id.editTxt);
        btn_1 = findViewById(R.id.btn_1);
        btn_2 = findViewById(R.id.btn_2);
        result = findViewById(R.id.result);
        play = findViewById(R.id.mainTitle);
        mediaPlayer = MediaPlayer.create(DataTransferMain.this,R.raw.music);
    }

    public void clickBtn(){
        play.setOnClickListener(v -> {
            mediaPlayer.start();
        });

        btn_1.setOnClickListener(v -> {

        });

        btn_2.setOnClickListener(v -> {

        });
    }
}
