package com.example.android.timepicker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TimePicker;
import android.widget.Toast;

import java.sql.Time;

public class MainActivity extends AppCompatActivity {
    private TimePicker timePicker;
    private Button button_show_time;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showTime();
    }

    public void showTime(){
        //Pretty cool for setting the time of something!
        //Maybe for a productivity Android application
        timePicker = (TimePicker) findViewById(R.id.timePicker);
        button_show_time = (Button) findViewById(R.id.button);
        button_show_time.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(getBaseContext(), timePicker.getCurrentHour() + " : " + timePicker.getCurrentMinute(), Toast.LENGTH_LONG).show();

                    }
                }
        );
    }
}
