package com.example.androidpractise;

import android.os.Bundle;
import android.renderscript.ScriptGroup;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.androidpractise.databinding.ActivityLifeCycleBinding;

public class LifeCycle extends AppCompatActivity {

   public ActivityLifeCycleBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_life_cycle);
        binding = ActivityLifeCycleBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        btnClicked("On Create");

    }

    protected void onStart() {

        super.onStart();
        btnClicked("On Start");
    }

    @Override
    protected void onResume() {
        super.onResume();
        btnClicked("On Resume");
    }

    public void btnClicked(String text) {
        binding.btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(LifeCycle.this, text+" is running", Toast.LENGTH_SHORT).show();
            }
        });
    }
}