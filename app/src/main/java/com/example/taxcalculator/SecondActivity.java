package com.example.taxcalculator;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView t = (TextView) findViewById(R.id.tv4);
        Intent i = getIntent();
        String res = i.getStringExtra("r");
        t.setText(res);
    }
}