package com.example.android_class_exercise;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText ios,swift,java,android,dbms;
    Button Add;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ios=findViewById(R.id.edtdbms);
        swift=findViewById(R.id.edtswift);
        java=findViewById(R.id.edtjava);
        android=findViewById(R.id.edtandroid);
        dbms=findViewById(R.id.edtdbms);
        Add=findViewById(R.id.btnadd);

        Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent mIntent=new Intent(MainActivity.this,ResultActivity.class);
            }
        });
    }
}
