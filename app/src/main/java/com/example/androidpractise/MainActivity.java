package com.example.androidpractise;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        Button btn = findViewById(R.id.btn_welcome);
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        TextView txt = findViewById(R.id.txtWelcome);
        txt.setText("Hello Android");
    }

//    public void OnHelloBtnClicked(View view){
//        TextView txt = findViewById(R.id.txtWelcome);
//        txt.setText("Hello Android");
//    }

}