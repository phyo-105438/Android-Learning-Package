package com.example.androidpractise;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
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
    TextView java, kotlin , dart;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.get_data);
        init();
        bundle = getIntent().getExtras();
        String value = bundle.getString("Android");
        title.setText(value);
        radio();
        clickSubmit();
    }

    private void init(){
        radioGroup = findViewById(R.id.radioGP);
        submit = findViewById(R.id.btn);
        txt = findViewById(R.id.txt);
        title = findViewById(R.id.title);
        java = findViewById(R.id.java);
        kotlin = findViewById(R.id.kotlin);
        dart = findViewById(R.id.dart);


    }

    public void radio(){
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == R.id.java) {
                    txt.setText("Java");
                }
                else if(checkedId == R.id.kotlin){
                    txt.setText("Kotlin");
                }
                else if(checkedId == R.id.dart){
                    txt.setText("Dart");
                }

            }
        });
    }

    public void clickSubmit(){
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value = txt.getText().toString();
                Intent intent = new Intent(GetData.this , DataTransferMain.class);
                Bundle bundle = new Bundle();
                bundle.putString("Android",value);
                intent.putExtras(bundle);
                setResult(RESULT_OK,intent);
                finish();
            }
        });
    }

}
