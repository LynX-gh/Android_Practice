package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    DatePicker calendar = (DatePicker) findViewById(R.id.calendarView);
    TextView date = (TextView) findViewById(R.id.text1);
    Button button = (Button) findViewById(R.id.button);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        date.setText("Current Date - " + getCurrentDate());
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                date.setText("Selected Date - " + getCurrentDate());
            }
        });
    }

    public String getCurrentDate(){
        StringBuilder builder=new StringBuilder();;
        builder.append((calendar.getMonth() +1 )+"/");
        builder.append(calendar.getDayOfMonth()+"/");
        builder.append(calendar.getYear());
        return builder.toString();
    }
}