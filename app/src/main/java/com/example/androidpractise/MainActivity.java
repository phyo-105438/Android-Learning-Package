package com.example.androidpractise;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btn);
//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(MainActivity.this,"Hello Android Developer",Toast.LENGTH_LONG).show();
//            }
//        });

        btn.setOnClickListener(new Walifer());
    }
    public class Walifer implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            Toast.makeText(MainActivity.this,"Hello Android Developer",Toast.LENGTH_LONG).show();
        }
    }

}