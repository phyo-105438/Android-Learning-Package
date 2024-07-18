package com.example.androidpractise;

import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class GetData extends AppCompatActivity {
    public RadioGroup radioGroup;
    public Button submit;
    public TextView txt, title;

    public Bundle bundle;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.get_data);
        init();
        bundle = getIntent().getExtras();
        if(!(bundle == null)){
            String value = bundle.getString("Ezzie");
            if(!(value == null)){
                title.setText(value);
            }
        }



    }

    private void init(){
        radioGroup = findViewById(R.id.radioGP);
        submit = findViewById(R.id.btn);
        txt = findViewById(R.id.txt);
        title = findViewById(R.id.title);

    }
}
