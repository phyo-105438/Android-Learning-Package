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

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this,"On Start is stariting",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this,"On Resume is stariting",Toast.LENGTH_SHORT).show();
    }

//    @Override
//    protected void onPause() {
//        super.onPause();
//        Toast.makeText(LifeCycle.this,"On Pause is starting",Toast.LENGTH_SHORT).show();
//    }
//
//    @Override
//    protected void onStop() {
//        super.onStop();
//        Toast.makeText(LifeCycle.this,"On Stop is starting",Toast.LENGTH_SHORT).show();
//    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(LifeCycle.this,"On Destroy is starting",Toast.LENGTH_SHORT).show();
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