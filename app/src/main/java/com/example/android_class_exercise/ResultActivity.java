package com.example.android_class_exercise;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {


    TextView iosM,dbmsM,androidM,javaM,swiftM;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        iosM=findViewById(R.id.txtios);
        dbmsM=findViewById(R.id.txtdbms);
        androidM=findViewById(R.id.txtandroid);
        javaM=findViewById(R.id.txtjava);
        swiftM=findViewById(R.id.txtswift);


        Marks m = (Marks)getIntent().getSerializableExtra("marks");
        iosM.setText(String.valueOf(m.getmIos()));
        androidM.setText(String.valueOf(m.getmAndroid()));
        javaM.setText(String.valueOf(m.getmJava()));
        swiftM.setText(String.valueOf(m.getmSwift()));
        dbmsM.setText(String.valueOf(m.getmDbms()));
    }
}
