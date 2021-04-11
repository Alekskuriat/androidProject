package com.example.myandroidproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnTask1;
    Button btnTask2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnTask1 = (Button) findViewById(R.id.task1);
        btnTask2 = (Button) findViewById(R.id.task2);
        btnTask1.setOnClickListener(this);
        btnTask2.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.task1:
                setContentView(R.layout.task_1);
                break;
            case R.id.task2:
                setContentView(R.layout.task_2);
                break;

        }
    }
}