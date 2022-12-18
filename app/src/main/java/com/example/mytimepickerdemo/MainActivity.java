package com.example.mytimepickerdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {
    private TimePicker timePicker;
    private TextView textView;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        timePicker = findViewById(R.id.timePickerId);
        timePicker.setIs24HourView(true);
        textView = findViewById(R.id.textViewId);
        button = findViewById(R.id.buttonId);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 String time = timePicker.getCurrentHour() +":" + timePicker.getCurrentMinute();
                 textView.setText(time);
            }
        });



    }
}