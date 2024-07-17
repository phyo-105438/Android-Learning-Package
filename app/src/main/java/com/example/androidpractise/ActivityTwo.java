package com.example.androidpractise;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ActivityTwo extends AppCompatActivity {
    Button finish;
    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
        finish = findViewById(R.id.finish);
        clickBtn();

    }
    public void clickBtn(){
        finish.setOnClickListener(v -> {
            Intent i = new Intent(ActivityTwo.this, ActivityOne.class);
            startActivity(i);
        });
    }
}
