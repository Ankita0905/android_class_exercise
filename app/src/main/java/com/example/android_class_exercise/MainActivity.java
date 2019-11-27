package com.example.android_class_exercise;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Marks m;
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
                m = new Marks();
                m.setmDbms(Integer.parseInt(dbms.getText().toString()));
                m.setmAndroid(Integer.parseInt(android.getText().toString()));
                m.setmIos(Integer.parseInt(ios.getText().toString()));
                m.setmSwift(Integer.parseInt(swift.getText().toString()));
                m.setmJava(Integer.parseInt(java.getText().toString()));

                mIntent.putExtra("marks", m);


                startActivity(mIntent);
            }
        });
    }
}
