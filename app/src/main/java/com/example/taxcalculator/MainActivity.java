package com.example.taxcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    double p=0, q=0, r=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b = (Button) findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                EditText et1 = (EditText) findViewById(R.id.et1);
                String d1 = et1.getText().toString();
                EditText et2 = (EditText) findViewById(R.id.et2);
                String d2 = et2.getText().toString();

                if(d1.isEmpty() || d2.isEmpty()){
                    Toast.makeText(MainActivity.this,":Please fill the VALUES:", Toast.LENGTH_SHORT).show();
                }
                else{
                    p=Double.parseDouble(d1);
                    q=Double.parseDouble(d2);
                    if(p>=65 || p<=18)
                        Toast.makeText(MainActivity.this,":You are not eligible as Tax Payee:", Toast.LENGTH_SHORT).show();
                    else{
                        r = q*18/100;
                        String res = Double.toString(r);
                        Intent i = new Intent(MainActivity.this,SecondActivity.class);
                        i.putExtra("r",res);
                        startActivity(i);
                    }
                }
            }
        });
    }
}
