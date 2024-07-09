package com.example.androidpractise;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        Button btn = findViewById(R.id.btnWelcome);
       // btn.setOnClickListener(this);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView txt = findViewById(R.id.txt);
                EditText edt = findViewById(R.id.editTxt);
                txt.setText("Hello "+edt.getText().toString()+"");
                //edt.clear();

            }
        });
        btn.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Toast.makeText(MainActivity.this,"Long Clicked",Toast.LENGTH_LONG).show();
                return true;
            }
        });
    }





//    @Override
//    public void onClick(View v) {
//        TextView txt = findViewById(R.id.txtWelcome);
//        txt.setText("Hello Android");
//    }

//    public void OnHelloBtnClicked(View view){
//        TextView txt = findViewById(R.id.txtWelcome);
//        txt.setText("Hello Android");
//    }

}