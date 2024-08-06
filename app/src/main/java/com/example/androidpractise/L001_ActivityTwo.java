package com.example.androidpractise;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class L001_ActivityTwo extends AppCompatActivity {
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
            Intent i = new Intent(L001_ActivityTwo.this, L001_ActivityOne.class);
            startActivity(i);
        });
    }
}
