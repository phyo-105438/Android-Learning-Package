package com.example.androidpractise;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LikeAndUnlikeActivity extends AppCompatActivity {
    ImageView sastEmo, angryEmo;
    TextView txt;
    Button likeBtn, unlikeBtn;

    int count = 3000;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_like_and_unlike);
        setUI();
        clickBtn();

    }

    private void setUI() {
        sastEmo = findViewById(R.id.sastified_emoji);
        angryEmo = findViewById(R.id.angry_emoji);
        txt = findViewById(R.id.txt);
        likeBtn = findViewById(R.id.like);
        unlikeBtn = findViewById(R.id.unlike);
    }

    private void clickBtn() {
        likeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                Toast.makeText(LikeAndUnlikeActivity.this, "Liked", Toast.LENGTH_SHORT).show();
                sastEmo.setVisibility(View.VISIBLE);
                angryEmo.setVisibility(View.INVISIBLE);
                txt.setText(String.valueOf(count));
            }
        });

        unlikeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count--;
                Toast.makeText(LikeAndUnlikeActivity.this, "Unliked", Toast.LENGTH_SHORT).show();
                sastEmo.setVisibility(View.INVISIBLE);
                angryEmo.setVisibility(View.VISIBLE);
                txt.setText(String.valueOf(count));
            }
        });
    }

}

