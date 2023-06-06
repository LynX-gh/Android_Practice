package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText in1, in2, ans;
    Button ad, sb, ml, dv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        in1 = findViewById(R.id.Num1);
        in2 = findViewById(R.id.Num2);
        ans = findViewById(R.id.Result);
        ad = findViewById(R.id.add);
        sb = findViewById(R.id.sub);
        dv = findViewById(R.id.div);
        ml = findViewById(R.id.mul);

        ad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n1 = Integer.parseInt(in1.getText().toString());
                int n2 = Integer.parseInt(in2.getText().toString());
                int n3 = n1+n2;
                ans.setText(String.valueOf(n3));
                cln();
            }
        });

        sb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n1=Integer.parseInt(in1.getText().toString());
                int n2=Integer.parseInt(in2.getText().toString());
                int n3=n1-n2;
                ans.setText(String.valueOf(n3));
                cln();
            }
        });

        dv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n1=Integer.parseInt(in1.getText().toString());
                int n2=Integer.parseInt(in2.getText().toString());
                int n3=n1/n2;
                ans.setText(String.valueOf(n3));
                cln();
            }
        });

        ml.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n1=Integer.parseInt(in1.getText().toString());
                int n2=Integer.parseInt(in2.getText().toString());
                int n3=n1*n2;
                ans.setText(String.valueOf(n3));
                cln();
            }
        });
    }

    public void cln(){
        in1.setText(null);
        in2.setText(null);
    }
}