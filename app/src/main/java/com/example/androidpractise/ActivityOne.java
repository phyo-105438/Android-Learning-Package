package com.example.androidpractise;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ActivityOne extends AppCompatActivity {
    Button btn;
    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        setContentView(R.layout.activity_one);
        btn = findViewById(R.id.btn);
        clickBtn();
    }

    public void clickBtn(){
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ActivityOne.this, ActivityTwo.class);
                startActivity(i);
            }
        });
    }
}
